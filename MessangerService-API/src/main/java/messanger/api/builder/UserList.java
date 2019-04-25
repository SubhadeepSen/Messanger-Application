package messanger.api.builder;

import java.util.List;

import messanger.api.model.User;

/**
 * This class is used for retrieving the list of users from YAML file
 * @author Subhadeep Sen
 */
public class UserList {

	private List<User> users;

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
