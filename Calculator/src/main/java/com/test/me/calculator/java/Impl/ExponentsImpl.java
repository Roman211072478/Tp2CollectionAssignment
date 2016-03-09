/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.me.calculator.java.Impl;

import com.test.me.calculator.java.interfaces.MathLabInterface;

/**
 *
 * @author Roman
 */
public class ExponentsImpl implements MathLabInterface
{

    @Override
    public int calculate(int LHS, int RHS) {
        return (int)Math.pow(LHS,RHS);
    }
    
}
