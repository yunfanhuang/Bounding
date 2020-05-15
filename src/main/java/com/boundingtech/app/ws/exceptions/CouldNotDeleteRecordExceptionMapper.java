/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.exceptions;

import com.boundingtech.app.ws.ui.model.response.ErrorMessage;
import com.boundingtech.app.ws.ui.model.response.ErrorMessages;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author sergeykargopolov
 */
public class CouldNotDeleteRecordExceptionMapper implements ExceptionMapper<CouldNotDeleteRecordException>{

    public Response toResponse(CouldNotDeleteRecordException exception) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(),
                ErrorMessages.COULD_NOT_DELETE_RECORD.name(), "http://boundingtech.com");
        
      return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
}

