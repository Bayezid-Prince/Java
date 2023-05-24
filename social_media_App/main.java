package social_media_App;

public class main {

	public static void main(String[] args) {
		
		regularUser regularUser = new regularUser("Bayezid26", "IIT123");
		adminUser adminUser = new adminUser("Huma", "Huma12", "Admin");
		socialMediaApp socialMediaApp = new socialMediaApp();
		
		socialMediaApp.addUser(regularUser);
		socialMediaApp.addUser(adminUser);
		
		socialMediaApp.removeUser(adminUser);

		socialMediaApp.displayAllUsers();
		
		regularUser.addPost("Hello, welcome");
		
		socialMediaApp.displayUserPosts(regularUser.getUsername());
		
		if(regularUser.getPosts().size() > 0) {
			post post = new post(regularUser.getPosts().get(0));
			post.like();
			post.like();
			post.unlike();
			System.out.println("Number of likes in the post: " + post.getNumberOfLikes());
		}
	}
}
