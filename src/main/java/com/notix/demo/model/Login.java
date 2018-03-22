/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.demo.model;

/**
 *
 * @author apple
 */
public class Login {
  private String id;
  private String employeeId;
  private String password;
  private String statusId;
  
    public Login() {
    }

    public Login(String id, String employeeId, String password, String statusId) {
        this.id = id;
        this.employeeId = employeeId;
        this.password = password;
        this.statusId = statusId;
    }
    
    

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
  
    public Login withId(String id){
    this.setId( id );
    return this;
  }

  public Login withEmployeeId(String employeeId){
    this.setEmployeeId( employeeId );
    return this;
  }

  public Login withPassword(String password){
    this.setPassword( password );
    return this;
  }
  
  public Login withStatusId(String statusId){
    this.setStatusId( statusId );
    return this;
  }


    
}
