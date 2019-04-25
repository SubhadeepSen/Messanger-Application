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

import messanger.api.model.Post;

/**
 * Post builder
 * @author Subhadeep Sen
 */
@Component
public class PostBuilder {

	private static final Logger LOGGER = LoggerFactory.getLogger(PostBuilder.class);
	
	/**
	 * This method builds list of posts from YAML file
	 * @return List<Post>
	 */
	public List<Post> buildPosts() {
		List<Post> posts = new ArrayList<>();
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			PostList postList = mapper.readValue(new File("src/main/resources/posts.yaml"), PostList.class);
			for (Post post : postList.getPosts()) {
				posts.add(post);
			}
		} catch (IOException e) {
			LOGGER.info("---> " + "Unable to build post list " + e.getMessage());
		}
		return posts;
	}
}
