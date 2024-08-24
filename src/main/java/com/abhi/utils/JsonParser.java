package com.abhi.utils;

import java.io.File;

import com.abhi.constants.Constants;
import com.jayway.jsonpath.JsonPath;

public class JsonParser {
    public static String getValue(String path) {
        String temp="";
        try {
            File file = new File(Constants.JSONFILEPATH);
            temp= JsonPath.read(file, "$."+path);
        }
        catch(Exception e) {

        }
        return temp;
    }

}
