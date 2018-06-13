package com.project.yasar.onduty.domain;

public class Group {
    private long id;
    private String groupName;

    public Group(String groupName) {

        this.groupName = groupName;
    }

    public Group() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
