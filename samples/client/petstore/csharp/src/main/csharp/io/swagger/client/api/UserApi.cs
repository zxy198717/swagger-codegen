  using System;
  using System.Collections.Generic;
  using io.swagger.client;
  using io.swagger.client.model;
  
  
  

  namespace io.swagger.client.api {
    
    public class UserApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public UserApi(String basePath = "http://petstore.swagger.io/v2")
      {
        this.basePath = basePath;
      }

      public ApiInvoker getInvoker() {
        return apiInvoker;
      }

      // Sets the endpoint base url for the services being accessed
      public void setBasePath(string basePath) {
        this.basePath = basePath;
      }

      // Gets the endpoint base url for the services being accessed
      public String getBasePath() {
        return basePath;
      }

      

      /// <summary>
      /// Create user This can only be done by the logged in user.
      /// </summary>
      /// <param name="body">Created user object</param>
      
      /// <returns></returns>
      public void  createUser (User body) {
        // create path and map variables
        var path = "/user".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, com.wordnik.swagger.codegen.CodegenParameter@3f1dd29a, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Creates list of users with given input array 
      /// </summary>
      /// <param name="body">List of user object</param>
      
      /// <returns></returns>
      public void  createUsersWithArrayInput (List<User> body) {
        // create path and map variables
        var path = "/user/createWithArray".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, com.wordnik.swagger.codegen.CodegenParameter@3eed9cd5, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Creates list of users with given input array 
      /// </summary>
      /// <param name="body">List of user object</param>
      
      /// <returns></returns>
      public void  createUsersWithListInput (List<User> body) {
        // create path and map variables
        var path = "/user/createWithList".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, com.wordnik.swagger.codegen.CodegenParameter@61d38439, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Logs user into the system 
      /// </summary>
      /// <param name="username">The user name for login</param>
       /// <param name="password">The password for login in clear text</param>
      
      /// <returns></returns>
      public String  loginUser (String username, String password) {
        // create path and map variables
        var path = "/user/login".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        if (username != null){
          string paramStr = (username is DateTime) ? ((DateTime)(object)username).ToString("u") : Convert.ToString(username);
          queryParams.Add("username", paramStr);
		}
        if (password != null){
          string paramStr = (password is DateTime) ? ((DateTime)(object)password).ToString("u") : Convert.ToString(password);
          queryParams.Add("password", paramStr);
		}
        

        

        

        try {
          if (typeof(String) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as String;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (String) ApiInvoker.deserialize(response, typeof(String));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Logs out current logged in user session 
      /// </summary>
      
      /// <returns></returns>
      public void  logoutUser () {
        // create path and map variables
        var path = "/user/logout".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Get user by user name 
      /// </summary>
      /// <param name="username">The name that needs to be fetched. Use user1 for testing. </param>
      
      /// <returns></returns>
      public User  getUserByName (String username) {
        // create path and map variables
        var path = "/user/{username}".Replace("{format}","json").Replace("{" + "username" + "}", apiInvoker.escapeString(username.ToString()));

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(User) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as User;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (User) ApiInvoker.deserialize(response, typeof(User));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Updated user This can only be done by the logged in user.
      /// </summary>
      /// <param name="username">name that need to be deleted</param>
       /// <param name="body">Updated user object</param>
      
      /// <returns></returns>
      public void  updateUser (String username, User body) {
        // create path and map variables
        var path = "/user/{username}".Replace("{format}","json").Replace("{" + "username" + "}", apiInvoker.escapeString(username.ToString()));

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, com.wordnik.swagger.codegen.CodegenParameter@58dec5c, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      

      /// <summary>
      /// Delete user This can only be done by the logged in user.
      /// </summary>
      /// <param name="username">The name that needs to be deleted</param>
      
      /// <returns></returns>
      public void  deleteUser (String username) {
        // create path and map variables
        var path = "/user/{username}".Replace("{format}","json").Replace("{" + "username" + "}", apiInvoker.escapeString(username.ToString()));

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        

        

        

        

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      
    }
    
  }