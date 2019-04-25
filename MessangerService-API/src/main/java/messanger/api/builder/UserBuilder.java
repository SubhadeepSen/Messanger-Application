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

import messanger.api.model.User;

/**
 * User builder
 * @author Subhadeep Sen
 */
@Component
public class UserBuilder {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserBuilder.class);

	/**
	 * This method builds list of users from YAML file
	 * @return List<User>
	 */
	public List<User> buildUsers() {
		List<User> users = new ArrayList<>();
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			UserList userList = mapper.readValue(new File("src/main/resources/users.yaml"), UserList.class);
			for (User user : userList.getUsers()) {
				users.add(user);
			}
		} catch (IOException e) {
			LOGGER.info("---> " + "Unable to build user list: " + e.getMessage());
		}
		return users;
	}
}
