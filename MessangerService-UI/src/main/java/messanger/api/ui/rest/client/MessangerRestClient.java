package messanger.api.ui.rest.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import messanger.api.ui.exception.NoDataFoundException;
import messanger.api.ui.model.Comment;
import messanger.api.ui.model.Post;
import messanger.api.ui.model.User;

@Component
public class MessangerRestClient {

	private RestTemplate restTemplate = new RestTemplate();

	@Value("${messanger.api.base.url}")
	private String baseUrl;

	public List<User> getUsers() throws NoDataFoundException {
		String url = baseUrl + "/" + "users";
		List<User> users = null;
		ResponseEntity<List<User>> response = restTemplate.exchange(url, HttpMethod.GET, buildHttpEntity(),
				new ParameterizedTypeReference<List<User>>() {
				});
		if (response.getStatusCode() == HttpStatus.OK) {
			users = response.getBody();
		} else if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
			throw new NoDataFoundException("No data found!");
		}
		return users;
	}

	public List<Post> getPosts() throws NoDataFoundException {
		String url = baseUrl + "/" + "posts";
		List<Post> posts = null;
		ResponseEntity<List<Post>> response = restTemplate.exchange(url, HttpMethod.GET, buildHttpEntity(),
				new ParameterizedTypeReference<List<Post>>() {
				});
		if (response.getStatusCode() == HttpStatus.OK) {
			posts = response.getBody();
		} else if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
			throw new NoDataFoundException("No data found!");
		}
		return posts;
	}

	public List<Comment> getComments() throws NoDataFoundException {
		String url = baseUrl + "/" + "comments";
		List<Comment> comments = null;
		ResponseEntity<List<Comment>> response = restTemplate.exchange(url, HttpMethod.GET, buildHttpEntity(),
				new ParameterizedTypeReference<List<Comment>>() {
				});
		if (response.getStatusCode() == HttpStatus.OK) {
			comments = response.getBody();
		} else if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
			throw new NoDataFoundException("No data found!");
		}
		return comments;
	}

	private HttpEntity<String> buildHttpEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return entity;
	}
}
