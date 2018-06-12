package onduty;

public class Message {
	
	private long messsageid;  //bigint--> long
	private int messagestate;  // mesajýn alýnýp alýnmadýðý

	private String messagecontent;  // text veri tipi nasýl tanýmlanýr?
	private long conversationid;  //foreign key

//	@Column(name="messagestate")
	private MessageState messageState;
	
	
	private State state;   //annotation

}
