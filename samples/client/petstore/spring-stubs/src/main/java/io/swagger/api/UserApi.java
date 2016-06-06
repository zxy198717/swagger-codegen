package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.User;
import java.util.List;

import io.swagger.annotations.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@RequestMapping(value = "/user", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/user", description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-06T10:53:41.429+02:00")
public interface UserApi {

  @ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
  @RequestMapping(value = "",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.POST)
  ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true ) @RequestBody User body);


  @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
  @RequestMapping(value = "/createWithArray",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.POST)
  ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true ) @RequestBody List<User> body);


  @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
  @RequestMapping(value = "/createWithList",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.POST)
  ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true ) @RequestBody List<User> body);


  @ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
    @ApiResponse(code = 404, message = "User not found", response = Void.class) })
  @RequestMapping(value = "/{username}",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.DELETE)
  ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("username") String username);


  @ApiOperation(value = "Get user by user name", notes = "", response = User.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = User.class),
    @ApiResponse(code = 400, message = "Invalid username supplied", response = User.class),
    @ApiResponse(code = 404, message = "User not found", response = User.class) })
  @RequestMapping(value = "/{username}",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.GET)
  ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true ) @PathVariable("username") String username);


  @ApiOperation(value = "Logs user into the system", notes = "", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = String.class),
    @ApiResponse(code = 400, message = "Invalid username/password supplied", response = String.class) })
  @RequestMapping(value = "/login",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.GET)
  ResponseEntity<String> loginUser(@ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
    @ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password);


  @ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
  @RequestMapping(value = "/logout",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.GET)
  ResponseEntity<Void> logoutUser();


  @ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
    @ApiResponse(code = 404, message = "User not found", response = Void.class) })
  @RequestMapping(value = "/{username}",
    produces = "application/json",
    consumes = "application/json",
    method = RequestMethod.PUT)
  ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be deleted",required=true ) @PathVariable("username") String username,
    @ApiParam(value = "Updated user object" ,required=true ) @RequestBody User body);

}
