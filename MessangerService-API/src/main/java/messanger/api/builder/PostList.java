package messanger.api.builder;

import java.util.List;

import messanger.api.model.Post;

/**
 * This class is used for retrieving the list of posts from YAML file
 * @author Subhadeep Sen
 */
public class PostList {

	private List<Post> posts;

	/**
	 * @return the posts
	 */
	public List<Post> getPosts() {
		return posts;
	}

	/**
	 * @param posts the posts to set
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
}
