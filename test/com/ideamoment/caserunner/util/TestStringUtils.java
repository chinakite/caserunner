package com.ideamoment.caserunner.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangzhonghua on 2016/7/27.
 */
public class TestStringUtils {
    @Test
    public void testIsNumeric() {
        assertFalse(StringUtils.isNumeric("aaa"));
        assertTrue(StringUtils.isNumeric("111"));
    }
}
