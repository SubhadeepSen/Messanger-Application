package messanger.api.builder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import messanger.api.model.Comment;

/**
 * Comment builder
 * @author Subhadeep Sen
 */
@Component
public class CommentBuilder {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommentBuilder.class);
			
	/**
	 * This method builds list of comments from YAML file
	 * @return List<Comment>
	 */
	public List<Comment> buildComments() {
		List<Comment> comments = new ArrayList<>();
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			CommentList commentList = mapper.readValue(new File("src/main/resources/comments.yaml"), CommentList.class);
			for (Comment comment : commentList.getComments()) {
				comments.add(comment);
			}
		} catch (IOException e) {
			LOGGER.info("---> " + "Unable to build comment list " + e.getMessage());
		}
		return comments;
	}
}
