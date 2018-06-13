package com.project.yasar.onduty.domain;
public class Message {
	
	private long Messageid;
	//private int Messagestate;
	private String Messagecontent;
	private long Conversationid;

 // @Column(name="messagestate")

	private MessageState messagestate;
	
	private State state;  



public long getMessageid() {
	return Messageid;
}


public void setMessageid(long messageid) {
	Messageid = messageid;
}


public String getMessagecontent() {
	return Messagecontent;
}


public void setMessagecontent(String messagecontent) {
	Messagecontent = messagecontent;
}


public long getConversationid() {
	return Conversationid;
}


public void setConversationid(long conversationid) {
	Conversationid = conversationid;
}


public MessageState getMessagestate() {
	return messagestate;
}


public void setMessagestate(MessageState messagestate) {
	this.messagestate = messagestate;
}


public State getState() {
	return state;
}


public void setState(State state) {
	this.state = state;
}

}
