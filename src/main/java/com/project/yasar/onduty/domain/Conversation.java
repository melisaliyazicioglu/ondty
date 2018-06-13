package com.project.yasar.onduty.domain;

import java.util.Date;

import javax.persistence.*;

public class Conversation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;  //conversation_id
	
	@Column
	private Date conversationdate;

	public Conversation(Date conversationdate) {
		super();
		this.conversationdate = conversationdate;
	}
	
	//foreign key yok
	
	
	

	
}
