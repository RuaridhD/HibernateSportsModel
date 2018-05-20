package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="competitions")
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

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="number_of_games")
    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }
    @Column(name = "sponsors")
    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "competition_teams",
            inverseJoinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)},
            joinColumns = {@JoinColumn(name = "competition_id", nullable = false, updatable = false)})
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
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

    public void addTeam(Team team){
        this.teams.add(team);
    }
}
