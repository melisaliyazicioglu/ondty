package onduty;

public class Message {
	
	private long messsageid;  //bigint--> long
	private int messagestate;  // mesaj�n al�n�p al�nmad���

	private String messagecontent;  // text veri tipi nas�l tan�mlan�r?
	private long conversationid;  //foreign key

//	@Column(name="messagestate")
	private MessageState messageState;
	
	
	private State state;   //annotation

}
