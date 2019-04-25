package messanger.api.builder;

import java.util.List;

import messanger.api.model.Comment;


/**
 * This class is used for retrieving list of comments from YAML file
 * @author Subhadeep Sen
 */
public class CommentList {
	
	private List<Comment> comments;

	/**
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
