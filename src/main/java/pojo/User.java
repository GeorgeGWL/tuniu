package pojo;

public class User {
	Integer id;
	String username;
	String password;
	Integer mobilephone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(Integer mobilephone) {
		this.mobilephone = mobilephone;
	}
	public User(Integer id, String username, String password, Integer mobilephone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobilephone = mobilephone;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", mobilephone=" + mobilephone
				+ "]";
	}
	
	

}
