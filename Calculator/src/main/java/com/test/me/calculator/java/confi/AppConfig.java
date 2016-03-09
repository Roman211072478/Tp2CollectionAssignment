/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.me.calculator.java.confi;

import com.test.me.calculator.java.Impl.AreaImpl;
import com.test.me.calculator.java.Impl.PerimeterImpl;

import com.test.me.calculator.java.interfaces.MathLabInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Roman
 */

@Configuration
public class AppConfig {
    
  
    
     @Bean(name = "areaClass")
    public MathLabInterface getAreaService() {
        return new AreaImpl();
    }

    @Bean(name = "perimeterClass")
    public MathLabInterface getPerimeterService() {
        return new PerimeterImpl();
    }
    
}
