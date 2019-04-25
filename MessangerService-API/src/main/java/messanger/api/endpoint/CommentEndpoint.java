package messanger.api.endpoint;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import messanger.api.model.Comment;

/**
 * Service endpoint for comment service
 * @author Subhadeep Sen
 */
@Api(value = "comments", description = "Comments")
public interface CommentEndpoint {

    @ApiOperation(value = "comments", response = Comment.class, responseContainer = "List")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "Content-Type", value = "application/json", required = true, dataType = "string", paramType = "header")
      })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Comment.class, responseContainer = "List") })
    @RequestMapping(value = "/comments", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<List<Comment>> getComments();

}
