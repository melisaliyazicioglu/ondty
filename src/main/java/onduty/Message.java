package onduty;
public class Message {
	
	private long messsageid;  
	private int messagestate;  
	private String messagecontent;  
	private long conversationid; 

   // @Column(name="messagestate")
	private MessageState messageState;
	
	private State state;  

}
