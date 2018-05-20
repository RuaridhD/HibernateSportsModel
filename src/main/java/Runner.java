import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {

        Competition competition1 = new Competition("Scottish Premiership", 38, "Ladbrokes");
        DBHelper.save(competition1);
        Team team1 = new Team("Rangers", 0, 0, 0, 0);
        DBHelper.save(team1);
        Player player1 = new Player("Dunbar", "7", 27, team1, 3000);
        DBHelper.save(player1);
        Player player2 = new Player("Drogba", "9", 37, team1, 5000);
        DBHelper.save(player2);
        Management manager = new Manager("Head Coach", "Steven Gerrard", 10000, team1);
        DBHelper.save(manager);
        Management assistantManager = new AssistantManager("Assistant Manager", "Gary McAllister", 3000, team1);
        DBHelper.save(assistantManager);
        Management physio = new BackroomStaff("Physio", "Paul Thompson", 600, team1);
        DBHelper.save(physio);
    }
}
