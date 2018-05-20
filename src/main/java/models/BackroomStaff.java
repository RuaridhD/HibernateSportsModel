package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BackroomStaff extends Management {


    public BackroomStaff() {
    }

    public BackroomStaff(String title, String name, double salary, Team team) {
        super(title, name, salary, team);
    }

}
