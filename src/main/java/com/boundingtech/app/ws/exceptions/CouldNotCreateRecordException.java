/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.exceptions;

/**
 *
 * @author sergeykargopolov
 */
public class CouldNotCreateRecordException extends RuntimeException{

    private static final long serialVersionUID = -5865565853821170976L;
   
    public CouldNotCreateRecordException(String message)
    {
        super(message);
    }
}
