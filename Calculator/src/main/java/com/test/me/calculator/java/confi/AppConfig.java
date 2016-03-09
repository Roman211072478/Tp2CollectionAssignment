/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.me.calculator.java.confi;

import com.test.me.calculator.java.Impl.AreaOfRectangleImpl;
import com.test.me.calculator.java.Impl.ExponentsImpl;
import com.test.me.calculator.java.Impl.SubtractionImpl;
import com.test.me.calculator.java.Impl.SumImpl;

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
        return new AreaOfRectangleImpl();
    }

    @Bean(name = "sumClass")
    public MathLabInterface getSumService() {
        return new SumImpl();
    }
    
     @Bean(name = "subtractionClass")
    public MathLabInterface getSubtractService() {
        return new SubtractionImpl();
    }
    
    
     @Bean(name = "ExponentsClass")
    public MathLabInterface getExponentService() {
        return new ExponentsImpl();
    }
}
