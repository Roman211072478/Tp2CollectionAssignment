
package com.test.me.calculator.java.Impl;
/**
 * Created by 211072478 on 3/7/2016.
 */
import com.test.me.calculator.java.interfaces.MathLabInterface;

public class AreaImpl implements MathLabInterface {
    public int calculate(int LHS, int RHS) {
        return LHS * RHS;
    }
}
