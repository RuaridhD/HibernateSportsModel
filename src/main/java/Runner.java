import db.DBCompetition;
import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Competition competition1 = new Competition("Scottish Premiership", 38, "Ladbrokes");
        DBHelper.save(competition1);

        Team team1 = new Team("Rangers", 70, 38, 76, 50);
        DBHelper.save(team1);
        Team team2 = new Team("Celtic", 82, 38, 73, 25);
        DBHelper.save(team2);

        Player player1 = new Player("Dunbar", "7", 27, team1, 3000);
        DBHelper.save(player1);
        Player player2 = new Player("Drogba", "9", 37, team1, 5000);
        DBHelper.save(player2);

        Player player3 = new Player("Griffiths", "9", 25, team2, 6000);
        DBHelper.save(player3);
        Player player4 = new Player("Dembele", "7", 23, team2, 4500);
        DBHelper.save(player4);

        Management manager1 = new Manager("Head Coach", "Steven Gerrard", 10000, team1);
        DBHelper.save(manager1);
        Management assistantManager1 = new AssistantManager("Assistant Manager", "Gary McAllister", 3000, team1);
        DBHelper.save(assistantManager1);
        Management physio1 = new BackroomStaff("Physio", "Paul Thompson", 600, team1);
        DBHelper.save(physio1);


        Management manager2 = new Manager("Head Coach", "Brendan Rodgers", 20000, team2);
        DBHelper.save(manager2);
        Management assistantManager2 = new AssistantManager("Assistant Manager", "Roger Brendan", 2000, team2);
        DBHelper.save(assistantManager2);
        Management physio2 = new BackroomStaff("Team Doctor", "Tom Paulson", 600, team2);
        DBHelper.save(physio2);

        DBHelper.addManagementToTeam(team1, manager1);
        DBHelper.addManagementToTeam(team1, assistantManager1);
        DBHelper.addManagementToTeam(team1, physio1);
        DBHelper.addPlayerToTeam(team1, player1);
        DBHelper.addPlayerToTeam(team1, player2);

        DBHelper.addManagementToTeam(team2, manager2);
        DBHelper.addManagementToTeam(team2, assistantManager2);
        DBHelper.addManagementToTeam(team2, physio2);
        DBHelper.addPlayerToTeam(team2, player3);
        DBHelper.addPlayerToTeam(team2, player4);

        DBHelper.addTeamToCompetition(competition1, team1);
        DBHelper.addTeamToCompetition(competition1, team2);

        List<Team> teamList = DBHelper.getAll(Team.class);
        List<Player> playerList = DBHelper.getAll(Player.class);

        List<Team> allTeamsInCompetition = DBCompetition.allTeamsInCompetition(competition1);


    }
}
