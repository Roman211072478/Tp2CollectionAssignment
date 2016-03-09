/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.me.members.java.Impl;

import com.test.me.members.java.interfaces.Person;

/**
 *
 * @author Roman
 */
public class PersonImpl implements Person{

    @Override
    public String newName() {
        return "awesome";
    }
    
}
