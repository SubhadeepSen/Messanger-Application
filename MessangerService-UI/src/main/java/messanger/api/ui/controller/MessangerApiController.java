package messanger.api.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import messanger.api.ui.model.Comment;
import messanger.api.ui.model.Post;
import messanger.api.ui.model.User;
import messanger.api.ui.service.MessangerService;

@Controller
public class MessangerApiController {

	@Autowired
	private MessangerService messangerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/getusers", method = RequestMethod.POST)
	public String getUsers(Model model) {
		List<User> users = messangerService.getUsers();
		model.addAttribute("users", users);
		return "index";
	}

	@RequestMapping(value = "/getposts", method = RequestMethod.POST)
	public String getPosts(Model model) {
		List<Post> posts = messangerService.getPosts();
		model.addAttribute("posts", posts);
		return "index";
	}

	@RequestMapping(value = "/getcomments", method = RequestMethod.POST)
	public String getComments(Model model) {
		List<Comment> comments = messangerService.getComments();
		model.addAttribute("comments", comments);
		return "index";
	}
}
