package models;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private Set<Competition> competitions;
    private Set<Player> players;
    private String name;
    private int points;
    private int gamesPlayed;
    private int goalsScored;
    private int goalsConceded;
    private int id;

    public Team() {
    }

    public Team(String name, int points, int gamesPlayed, int goalsScored, int goalsConceded) {
        this.name = name;
        this.points = points;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.players = new HashSet<Player>();
        this.competitions = new HashSet<Competition>();
    }

    public Set<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
