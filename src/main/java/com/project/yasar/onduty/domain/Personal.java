package com.project.yasar.onduty.domain;

import javax.persistence.*;

@Entity
public class Personal {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
       private long id;
    @JoinColumn(name = "user_id")
    @OneToOne(cascade = CascadeType.DETACH)
      private User user;

    public Personal(User user) {

        this.user = user;
    }

    public Personal() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
