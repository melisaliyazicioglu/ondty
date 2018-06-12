package onduty;
public class Message {
	
	private long messsageid;  //bigint--> long
	private int messagestate;  // mesajýn alýnýp alýnmadýðýprivate String messagecontent;  // text veri tipi nasýl tanýmlanýr?

	private String messagecontent;  // text veri tipi nasï¿½l tanï¿½mlanï¿½r?
	private long conversationid;  //foreign key

//	@Column(name="messagestate")
	private MessageState messageState;
	
	private State state;   //annotation

}
