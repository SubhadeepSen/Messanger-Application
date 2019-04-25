package messanger.api.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import messanger.api.ui.exception.NoDataFoundException;
import messanger.api.ui.model.Comment;
import messanger.api.ui.model.Post;
import messanger.api.ui.model.User;
import messanger.api.ui.rest.client.MessangerRestClient;

@Component
public class MessangerService {

	@Autowired
	private MessangerRestClient messangerRestClient;

	public List<User> getUsers() {
		List<User> users = null;
		try {
			users = messangerRestClient.getUsers();
		} catch (NoDataFoundException e) {
			users = new ArrayList<>();
			System.out.println("exception occured: " + e.getMessage());
		}
		return users;
	}

	public List<Post> getPosts() {
		List<Post> posts = null;
		try {
			posts = messangerRestClient.getPosts();
		} catch (NoDataFoundException e) {
			posts = new ArrayList<>();
			System.out.println("exception occured: " + e.getMessage());
		}
		return posts;
	}

	public List<Comment> getComments() {
		List<Comment> comments = null;
		try {
			comments = messangerRestClient.getComments();
		} catch (NoDataFoundException e) {
			comments = new ArrayList<>();
			System.out.println("exception occured: " + e.getMessage());
		}
		return comments;
	}

}
