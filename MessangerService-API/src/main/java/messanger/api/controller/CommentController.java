package messanger.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import messanger.api.endpoint.CommentEndpoint;
import messanger.api.exception.NoDataFoundException;
import messanger.api.model.Comment;
import messanger.api.service.CommentService;

@Controller
public class CommentController implements CommentEndpoint {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

	@Autowired
	private CommentService commentService;

	public ResponseEntity<List<Comment>> getComments() {
		try {
			return new ResponseEntity<List<Comment>>(commentService.getComments(), HttpStatus.OK);
		} catch (NoDataFoundException e) {
			LOGGER.info("Comments ---> " + e.getMessage());
		}
		return new ResponseEntity<List<Comment>>(new ArrayList<>(), HttpStatus.NOT_FOUND);
	}
}
