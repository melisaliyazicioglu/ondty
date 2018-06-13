package com.project.yasar.onduty.domain;

import java.util.Date;

public class TaskMessage {
    private long id;
    private String content;
    private Date enrtyDate;
    private Personal personal;
    private Task task;

    public TaskMessage(String content, Date enrtyDate, Personal personal, Task task) {

        this.content = content;
        this.enrtyDate = enrtyDate;
        this.personal = personal;
        this.task = task;
    }

    public TaskMessage() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getEnrtyDate() {
        return enrtyDate;
    }

    public void setEnrtyDate(Date enrtyDate) {
        this.enrtyDate = enrtyDate;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
