package com.ideamoment.caserunner.util;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhangzhonghua on 2016/7/27.
 */
public class TestNumericUtils {
    @Test
    public void testIsNumeric() {
        assertFalse(NumericUtils.isNumeric("aaa"));
        assertTrue(NumericUtils.isNumeric("111"));
    }
}
