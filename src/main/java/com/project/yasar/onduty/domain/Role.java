package com.project.yasar.onduty.domain;

public class Role {
    private long id;
    private String roleName;
    private State state;

    public Role(String roleName, State state) {

        this.roleName = roleName;
        this.state = state;
    }

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
