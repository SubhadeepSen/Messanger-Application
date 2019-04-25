package messanger.api.ui.model;

public class Comment {

	private Number id;
	private Number postId;
	private String name;
	private String email;
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
	 * @return the postId
	 */
	public Number getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Number postId) {
		this.postId = postId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
