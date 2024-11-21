package com.ankita;

public class Player {
    String name;
    String id;
    int age;
    String team;
    int score;
//constructor
    public Player(String name, String id, int age, String team, int score) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.team = team;
        this.score = score;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void displayPlayer() {
        System.out.println("\nPlayer Name: " + name);
        System.out.println("Player ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
        System.out.println("Score: " + score);
        System.out.println("-------------------------------------------");
    }
}
