package com.ideamoment.caserunner.util;

/**
 * Created by zhangzhonghua on 2016/6/8.
 */
public class StringUtils {
    public static boolean isEmpty(String input) {
        if(input == null) {
            return true;
        }
        if(input.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String input) {
        return !isEmpty(input);
    }

    public static boolean isNumeric(String input) {
        String regex = "^-?[0-9]+.?[0-9]+";
        if(regex.matches(regex)) {
            return true;
        }else{
            return false;
        }
    }

    public static String extractRealString(String input) {
        if(isNotEmpty(input)
                && input.startsWith("\"")
                && input.endsWith("\"")
                && input.trim().length() > 2) {
            return input.substring(1, input.length()-1);
        }
        return null;
    }
}
