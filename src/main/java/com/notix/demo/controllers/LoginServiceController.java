/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.demo.controllers;


import com.notix.demo.model.Login;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apple
 */
@RestController
@RequestMapping(value="/v1/employee/{employeeId}/organizations/{organizationId}/login")
public class LoginServiceController {
    
    @RequestMapping(value="", method=RequestMethod.GET)
    public Login getLogin(@PathVariable("employeeId") String employeeId){
    return new Login()
            .withId("10")
            .withEmployeeId(employeeId)
            .withPassword("hello")
            .withStatusId("new");
    
    }
    
}
