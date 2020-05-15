/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.service;

import com.boundingtech.app.ws.exceptions.AuthenticationException;
import com.boundingtech.app.ws.shared.dto.UserDTO;

/**
 *
 * @author sergeykargopolov
 */
public interface AuthenticationService {
    UserDTO authenticate(String userName, String password) throws AuthenticationException;
    String issueAccessToken(UserDTO userProfile) throws AuthenticationException;
    public void resetSecurityCridentials(String password, UserDTO userProfile);
}
