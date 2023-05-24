package social_media_App;

public class post implements likeable {
	private String content;
	private int numberOfLikes;
	
	
	public post(String content) {
		this.content = content;
		this.numberOfLikes = 0;
	}
	
	public String getContent() {
		return content;
	}
	
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	
	public void like() {
		numberOfLikes++;		
	}

	public void unlike() {
		if(numberOfLikes > 0) {
			numberOfLikes--;
		}				
	}
}