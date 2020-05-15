/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.io.dao;

import com.boundingtech.app.ws.shared.dto.UserDTO;
import java.util.List;

/**
 *
 * @author sergeykargopolov
 */
public interface DAO {
    void openConnection();
    UserDTO getUserByUserName(String userName);
    UserDTO saveUser(UserDTO user);
    UserDTO getUser(String id);
    List<UserDTO> getUsers(int start, int limit);
    void updateUser(UserDTO userProfile);
    void deleteUser(UserDTO userProfile);
    UserDTO getUserByEmailToken(String token);
    void closeConnection();
}
