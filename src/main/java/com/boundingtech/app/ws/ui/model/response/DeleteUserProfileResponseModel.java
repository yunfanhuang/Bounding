/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.ui.model.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sergeykargopolov
 */
@XmlRootElement
public class DeleteUserProfileResponseModel {
    private RequestOperation requestOperation;
    private ResponseStatus responseStatus;

    /**
     * @return the requestOperation
     */
    public RequestOperation getRequestOperation() {
        return requestOperation;
    }

    /**
     * @param requestOperation the requestOperation to set
     */
    public void setRequestOperation(RequestOperation requestOperation) {
        this.requestOperation = requestOperation;
    }

    /**
     * @return the responseStatus
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * @param responseStatus the responseStatus to set
     */
    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
    
}