/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.ui.entrypoints;

import com.boundingtech.app.ws.service.AuthenticationService;
import com.boundingtech.app.ws.service.impl.AuthenticationServiceImpl;
import com.boundingtech.app.ws.shared.dto.UserDTO;
import com.boundingtech.app.ws.ui.model.request.LoginCredentials;
import com.boundingtech.app.ws.ui.model.response.AuthenticationDetails;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sergeykargopolov
 */
@Path("/authentication")
public class AuthenticationEntryPoint {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public AuthenticationDetails userLogin(LoginCredentials loginCredentials)
    {
        AuthenticationDetails returnValue = new AuthenticationDetails();
        
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        UserDTO authenticatedUser = authenticationService.authenticate(loginCredentials.getUserName(), loginCredentials.getUserPassword());

       // Reset Access Token
        authenticationService.resetSecurityCridentials(loginCredentials.getUserPassword(), 
                 authenticatedUser);
        
        String accessToken = authenticationService.issueAccessToken(authenticatedUser);
        
        returnValue.setId(authenticatedUser.getUserId());
        returnValue.setToken(accessToken);
        
        return returnValue;
    }
}
