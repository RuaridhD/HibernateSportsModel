package models;

import java.util.HashSet;
import java.util.Set;

public class Competition {

    private String name;
    private int numberOfGames;
    private String sponsor;
    private Set<Team> teams;
    private int id;

    public Competition() {
    }

    public Competition(String name, int numberOfGames, String sponsor) {
        this.name = name;
        this.numberOfGames = numberOfGames;
        this.sponsor = sponsor;
        this.teams = new HashSet<Team>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
