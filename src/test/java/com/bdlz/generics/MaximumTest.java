package com.bdlz.generics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class MaximumTest {
    @Test
    public void integerMax_AtFirstPosition() {
        float actualResult = Maximum.findMaximum(9.657f,3.257f,7.123f);
        Assert.assertEquals(9.657f,actualResult,0.0);
    }

    @Test
    public void integerMax_AtSecondPosition() {
        float actualResult = Maximum.findMaximum(3.257f, 9.657f,7.123f);
        Assert.assertEquals(9.657f,actualResult,0.0);
    }

    @Test
    public void integerMax_AtThirdPosition() {
        float actualResult = Maximum.findMaximum(7.123f, 3.257f,9.657f);
        Assert.assertEquals(9.657f,actualResult,0.0);
    }
}