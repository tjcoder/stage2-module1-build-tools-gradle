package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isPositive = true;
        for (String arg : args) {
            if (!StringUtils.isPositiveNumber(arg)) {
                isPositive = false;
                break;
            }
        }

        return isPositive;
    }
}