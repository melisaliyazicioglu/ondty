package onduty;

public class User {
  private long Userid;
  private String Name;
  private String Surname;
  private String Email;
  


public User(long userid, String name, String surname, String email) {
	super();
	Userid = userid;
	Name = name;
	Surname = surname;
	Email = email;
}
public long getUserid() {
	return Userid;
}
public void setUserid(long userid) {
	Userid = userid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
  
  
}
