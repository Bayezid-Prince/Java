package social_media_App;

public abstract class user {
	private String Username;
	private String Password;
	
	public user(String username, String password) {
		this.Username = username;
		this.Password = password;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}

	public abstract void displayProfile();
}
