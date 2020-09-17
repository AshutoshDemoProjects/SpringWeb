package edu.iet.springMvcDemo.bean;

public class User {
	private final int userId;
	private String userName;
	private String pass;
	private long contact;
	private String roll;
	private static int count=1000;
	public User(){
		super();
		this.userId = count++;
	}
	public User( String userName, String pass) {
		super();
		this.userId = count++;
		this.userName = userName;
		this.pass = pass;
	}
	public User( String userName, String pass, long contact,String roll) {
		super();
		this.userId = count++;
		this.userName = userName;
		this.pass = pass;
		this.contact = contact;
		this.roll = roll;
	}
	public User(int userId, String userName, String pass, long contact,String roll) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pass = pass;
		this.contact = contact;
		this.roll = roll;
	}
	public int getUserId() {
		return userId;
	}

	/*
	 * public void setUserId(int userId) { this.userId = userId; }
	 */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", pass=" + pass + ", contact=" + contact + "]";
	}
	
}
