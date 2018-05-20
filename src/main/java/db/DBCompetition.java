package db;

import models.Competition;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCompetition {

    private static Transaction transaction;
    private static Session session;

    public static List<Team> getAllTeamsInCompetition(Competition competition){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> teamList = null;

        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.createAlias("competitions", "individual_competition");
            cr.add(Restrictions.eq("individual_competition.id", competition.getId()));
            teamList = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return teamList;
    }
}
