public class User {
	public String UserName;
	public String password;

	public User(String UserName, String password) {
		this.UserName = UserName;
		this.password = password;
	}

	public String GetData() {
		return this.UserName + " " + this.password;
	}

}
