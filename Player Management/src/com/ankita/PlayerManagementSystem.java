package com.ankita;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManagementSystem {
    private static ArrayList<Player> players = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Add Player");
            System.out.println("2. Display All Players");
            System.out.println("3. Search Player");
            System.out.println("4. Update Player");
            System.out.println("5. Remove Player");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPlayer();
                    break;
                case 2:
                    displayPlayers();
                    break;
                case 3:
                    searchPlayer();
                    break;
                case 4:
                    updatePlayer();
                    break;
                case 5:
                    removePlayer();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addPlayer() {
        System.out.println("Enter Player Details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Team: ");
        String team = scanner.nextLine();

        System.out.print("Score: ");
        int score = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        players.add(new Player(name, id, age, team, score));
        System.out.println("Player added successfully!");
    }

    private static void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players to display.");
        } else {
            System.out.println("-------> All Players Details <-------");
            for (Player player : players) {
                player.displayPlayer();
            }
        }
    }

    private static void searchPlayer() {
        System.out.println("Search Player By:");
        System.out.println("a. Name");
        System.out.println("b. ID");
        System.out.println("c. Team");
        System.out.print("Enter your choice: ");
        char option = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline

        switch (option) {
            case 'a':
                System.out.print("Enter player name: ");
                String name = scanner.nextLine();
                searchByName(name);
                break;
            case 'b':
                System.out.print("Enter player ID: ");
                String id = scanner.nextLine();
                searchById(id);
                break;
            case 'c':
                System.out.print("Enter team name: ");
                String team = scanner.nextLine();
                searchByTeam(team);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static void searchByName(String name) {
        for (Player player : players) {
            if (player.name.equalsIgnoreCase(name)) {
                player.displayPlayer();
                return;
            }
        }
        System.out.println("No player found with name: " + name);
    }

    private static void searchById(String id) {
        for (Player player : players) {
            if (player.id.equalsIgnoreCase(id)) {
                player.displayPlayer();
                return;
            }
        }
        System.out.println("No player found with ID: " + id);
    }

    private static void searchByTeam(String team) {
        for (Player player : players) {
            if (player.team.equalsIgnoreCase(team)) {
                player.displayPlayer();
                return;
            }
        }
        System.out.println("No player found with team: " + team);
    }

    private static void updatePlayer() {
        System.out.print("Enter the name of the player to update: ");
        String name = scanner.nextLine();

        for (Player player : players) {
            if (player.name.equalsIgnoreCase(name)) {
                System.out.println("Enter new details for the player:");

                System.out.print("Name: ");
                player.name = scanner.nextLine();

                System.out.print("ID: ");
                player.id = scanner.nextLine();

                System.out.print("Age: ");
                player.age = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Team: ");
                player.team = scanner.nextLine();

                System.out.print("Score: ");
                player.score = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.println("Player updated successfully!");
                return;
            }
        }

        System.out.println("Player not found!");
    }

    private static void removePlayer() {
        System.out.print("Enter the name of the player to remove: ");
        String name = scanner.nextLine();

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).name.equalsIgnoreCase(name)) {
                players.remove(i);
                System.out.println("Player removed successfully!");
                return;
            }
        }

        System.out.println("Player not found!");
    }
}