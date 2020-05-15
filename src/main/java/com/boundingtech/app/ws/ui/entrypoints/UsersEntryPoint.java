/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.ui.entrypoints;

import com.boundingtech.app.ws.annotations.Secured;
import com.boundingtech.app.ws.service.UsersService;
import com.boundingtech.app.ws.service.impl.UsersServiceImpl;
import com.boundingtech.app.ws.shared.dto.UserDTO;
import com.boundingtech.app.ws.ui.model.request.CreateUserRequestModel;
import com.boundingtech.app.ws.ui.model.response.UserProfileRest;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author sergeykargopolov
 */
@Path("/users")
public class UsersEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {
        UserProfileRest returnValue = new UserProfileRest();

        // Prepare UserDTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDto);

        // Create new user 
        UsersService userService = new UsersServiceImpl();
        UserDTO createdUserProfile = userService.createUser(userDto);

        //Prepare response
        BeanUtils.copyProperties(createdUserProfile, returnValue);

        return returnValue;
    }

    @Secured
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON,  MediaType.APPLICATION_XML} )
    public UserProfileRest getUserProfile(@PathParam("id") String id)
    {
        UserProfileRest returnValue = null;
        
        UsersService userService = new UsersServiceImpl();
        UserDTO userProfile = userService.getUser(id);
                
        returnValue = new UserProfileRest();
        BeanUtils.copyProperties(userProfile, returnValue);
        
        return returnValue;
    }

}
