package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class AssistantManager extends Management {


    public AssistantManager() {
    }

    public AssistantManager(String title, String name, double salary, Team team) {
        super(title, name, salary, team);
    }


}
