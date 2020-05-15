/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.ui.model.response;

/**
 *
 * @author sergeykargopolov
 */
public enum ErrorMessages {

    MISSING_REQUIRED_FIELD("缺少必填字段。"),
    RECORD_ALREADY_EXISTS("帳號已存在!"),
    INTERNAL_SERVER_ERROR("內部服務器錯誤!"),
    NO_RECORD_FOUND("找不到ID的記錄!"),
    AUTHENTICATION_FAILED("驗證失敗!"),
    COULD_NOT_UPDATE_RECORD("無法更新!"),
    COULD_NOT_DELETE_RECORD("無法刪除!"),
    EMAIL_ADDRESS_NOT_VERIFIED("電子郵件地址無法驗證!");
    

    private String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
