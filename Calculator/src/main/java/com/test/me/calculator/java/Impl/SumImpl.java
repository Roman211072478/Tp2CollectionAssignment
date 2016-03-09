package com.test.me.calculator.java.Impl;

import com.test.me.calculator.java.interfaces.MathLabInterface;

/**
 * Created by 211072478 on 3/7/2016.
 */
public class SumImpl implements MathLabInterface {
     @Override
    public int calculate(int LHS, int RHS) {
        return LHS + RHS;
    }
}
