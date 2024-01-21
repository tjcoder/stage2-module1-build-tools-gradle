package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean broken = false;

        if (args == null || args.isEmpty()) {
            broken = true;
        } else {
            for (String arg : args) {
                if (!StringUtils.isPositiveNumber(arg)) {
                    broken = true;
                    break;
                }
            }
        }

        return !broken;
    }
}