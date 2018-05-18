package models;

public abstract class Management {

    private String title;
    private String name;
    private double salary;
    Team team;
    private int id;

    public Management() {
    }

    public Management(String title, String name, double salary, Team team) {
        this.title = title;
        this.name = name;
        this.salary = salary;
        this.team = team;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
