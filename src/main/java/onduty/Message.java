package onduty;
public class Message {
	
	private long messsageid;  //bigint--> long
	private int messagestate;  // mesajýn alýnýp alýnmadýðýprivate String messagecontent;  // text veri tipi nasýl tanýmlanýr?

	private String messagecontent;  
	private long conversationid; 

//	@Column(name="messagestate")
	private MessageState messageState;
	
	private State state;  

}
