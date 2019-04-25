package messanger.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import messanger.api.builder.CommentBuilder;
import messanger.api.exception.NoDataFoundException;
import messanger.api.model.Comment;

@Service
public class CommentService {

	@Autowired
	private CommentBuilder commentBuilder;

	public List<Comment> getComments() throws NoDataFoundException {
		List<Comment> comments = commentBuilder.buildComments();
		if(!comments.isEmpty())
			return comments;
		throw new NoDataFoundException("No data found!");
	}
}
