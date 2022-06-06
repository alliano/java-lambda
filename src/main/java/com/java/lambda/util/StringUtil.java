package com.java.lambda.util;

public class StringUtil {

    public static boolean isLowerCase(String str) {
        for (char car : str.toCharArray()) {
            if (!Character.isLowerCase(car)){
                return true;
            }
        }
        return false;
    }
    
    public boolean bool(){
        return true;
    }
}
