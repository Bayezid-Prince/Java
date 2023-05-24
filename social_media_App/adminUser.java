package social_media_App;

public class adminUser extends user {
	private String role;

	public adminUser(String username, String password, String role) {
		super(username, password);
		this.role = role;
	}

	public void displayProfile() {
		System.out.println("Username: " + getUsername());
		System.out.println("Role: " + role);
	}
}

