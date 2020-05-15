/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundingtech.app.ws.io.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author sergeykargopolov
 */
@Entity(name="Users")
public class UserEntity implements Serializable {

    private static long serialVersionUID = 4865903039190150223L;
    @Id
    @GeneratedValue
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String usersID;
    private String birthYear;
    private String birthMonth;
    private String birthDay;
    private String phone;
    private String email;
    private String company;
    private String companyID;
    private String salt;
    private String encryptedPassword;
    private String token;
    private String emailVerificationToken;
    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean emailVerificationStatus;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the usersID
     */
    public String getUsersID() {
        return usersID;
    }

    /**
     * @param usersID the usersID to set
     */
    public void setUsersID(String usersID) {
        this.usersID = usersID;
    }

    /**
     * @return the birthYear
     */
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the birthMonth
     */
    public String getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the birthDay
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the companyID
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * @param companyID the companyID to set
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /**
     * @return the salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt the salt to set
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return the encryptedPassword
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * @param encryptedPassword the encryptedPassword to set
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the emailVerificationToken
     */
    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    /**
     * @param emailVerificationToken the emailVerificationToken to set
     */
    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    /**
     * @return the emailVerificationStatus
     */
    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    /**
     * @param emailVerificationStatus the emailVerificationStatus to set
     */
    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }
    
    
}
