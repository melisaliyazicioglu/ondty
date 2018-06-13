package com.project.yasar.onduty.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Personal {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
       private long id;
    @JoinColumn(name = "user_id")
    @OneToOne(cascade = CascadeType.DETACH)
      private User user;

    @JoinColumn(name = "task_id")
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Task> tasks = new ArrayList<Task>();

    @JoinColumn(name ="role_id")
    @OneToMany(cascade = CascadeType.DETACH)
    private List<Role> roles = new ArrayList<Role>();

    @JoinColumn(name = "group_id")
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Group> groups = new ArrayList<Group>();

    @JoinColumn(name = "department_id")
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Department> departments = new ArrayList<Department>();


    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Personal(User user, List<Task> tasks, List<Role> roles, List<Group> groups, List<Department> departments) {
        this.user = user;
        this.tasks = tasks;
        this.roles = roles;
        this.groups = groups;
        this.departments = departments;
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
