package config;

import model.UserEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Path("user")

public class Users {
    @GET
    @Path("connect")
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity squareRoot(@QueryParam("name") String name, @QueryParam("password") String password){
        UserEntity result = new UserEntity();
        result.setName(name);
        result.setPassword(password);
        return result;
    }
}
