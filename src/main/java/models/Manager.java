package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Manager extends Management {


    public Manager() {
    }

    public Manager(String title, String name, double salary, Team team) {
        super(title, name, salary, team);
    }

}
