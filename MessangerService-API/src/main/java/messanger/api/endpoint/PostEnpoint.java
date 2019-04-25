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
import messanger.api.model.Post;

/**
 * Service endpoint for post service
 * @author Subhadeep Sen
 */
@Api(value = "posts", description = "Posts")
public interface PostEnpoint {

    @ApiOperation(value = "posts", response = Post.class, responseContainer = "List")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "Content-Type", value = "application/json", required = true, dataType = "string", paramType = "header")
      })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Post.class, responseContainer = "List") })
    @RequestMapping(value = "/posts", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<List<Post>> getPosts();

}
