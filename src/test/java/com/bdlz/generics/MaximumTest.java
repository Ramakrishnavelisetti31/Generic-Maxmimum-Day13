package com.bdlz.generics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class MaximumTest {
    @Test
    public void integerMax_AtFirstPosition() {
        int actualResult = Maximum.findMaximum(9,3,7);
        Assert.assertEquals(9,actualResult);
    }
}