package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {

    private Set<Competition> competitions;
    private Set<Player> players;
    private Set<Management> staff;
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
        this.staff = new HashSet<Management>();
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "team_competitions",
            joinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "competition_id", nullable = false, updatable = false)})
    public Set<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }
    @OneToMany(mappedBy="team")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
    @OneToMany(mappedBy="team")
    public Set<Management> getStaff() {
        return staff;
    }

    public void setStaff(Set<Management> staff) {
        this.staff = staff;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    @Column(name="games_played")
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
    @Column(name="goals_scored")
    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    @Column(name="goals_conceded")
    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
