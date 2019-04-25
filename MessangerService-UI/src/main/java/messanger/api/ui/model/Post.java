package messanger.api.ui.model;

public class Post {

	private Number id;
	private Number userId;
	private String title;
	private String body;
	
	/**
	 * @return the id
	 */
	public Number getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Number id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public Number getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Number userId) {
		this.userId = userId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
