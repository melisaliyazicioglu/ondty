package com.project.yasar.onduty.domain;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Conversation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;  //conversation_id
	
	@Column
	private Date conversationDate;

	public Conversation(Date conversationDate) {
		super();
		this.conversationDate = conversationDate;
	}

	public Conversation() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getConversationDate() {
		return conversationDate;
	}

	public void setConversationDate(Date conversationDate) {
		this.conversationDate = conversationDate;
	}

	
	
	//foreign key yok
	
	
	//COMPLETED!
	
	
	

	
}
