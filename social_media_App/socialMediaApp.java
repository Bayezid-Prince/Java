package social_media_App;

import java.util.ArrayList;

public class socialMediaApp {
	private ArrayList<user> users;

	public socialMediaApp() {
		this.users = new ArrayList<>();
	}
	
	public void addUser(user user) {
		try {
            if (user == null) {
                throw new IllegalArgumentException("User cannot be null.");
            }
            users.add(user);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
	}
	
	public void removeUser(user user) {
		try {
            if (user == null) {
                throw new IllegalArgumentException("User cannot be null.");
            }
            if (!users.contains(user)) {
                throw new IllegalArgumentException("User not found.");
            }
            users.remove(user);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
	}
	
	public void displayAllUsers() {
		for(user user : users) {
			user.displayProfile();
			System.out.println();
		}
	}
	
	public void displayUserPosts(String username) {
		try {
            boolean userFound = false;
            for (user user : users) {
                if (user.getUsername().equals(username)) {
                    if (user instanceof regularUser) {
                        regularUser regularUser = (regularUser) user;
                        regularUser.displayProfile();
                        userFound = true;
                        break;
                    } else {
                        throw new IllegalArgumentException("User is not a regular user.");
                    }
                }
            }
            if (!userFound) {
                throw new IllegalArgumentException("User not found.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
