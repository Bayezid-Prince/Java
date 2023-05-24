package social_media_App;

import java.util.ArrayList;

public class regularUser extends user {
	private ArrayList<String> posts;

	public regularUser(String username, String password) {
		super(username, password);
		this.posts = new ArrayList<>();
	}
	
	public void addPost(String post) {
		posts.add(post);
	}
	
	public ArrayList<String> getPosts(){
		return posts;
	}
	
	public void displayProfile() {
		System.out.println("Username: " + getUsername());
		System.out.println("Post: ");
		for (String post : posts) {
			System.out.println(post);
		}
	}
}
