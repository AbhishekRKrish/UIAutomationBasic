package com.abhi.reports;

import com.abhi.utils.JsonParser;

public class LogStatus {

    public static void pass(String message) {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.PASS, message);
    }

    public static void pass(String string, String addScreenCapture) {
        if(JsonParser.getValue("config.global.screenshotforpass").equalsIgnoreCase("yes")) {
//            ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.PASS, string, ExtentManager.getTest().addBase64ScreenShot("data:image/png;base64,"+TestUtils.getBase64Image(addScreenCapture)));
        }
    }

    public static void fail(String message) {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, message);
    }

    public static void skip(String message) {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.SKIP, message);
    }

    public static void info(String message)
    {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.INFO, message);
    }

    public static void error(String message)
    {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.ERROR, message);
    }

    public static void fatal(String message)
    {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.FATAL, message);
    }


    public static void unknown(String message)
    {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.UNKNOWN, message);
    }

    public static void warning(String message)
    {
        ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.WARNING, message);
    }



    public static void fail(String string, String addScreenCapture)
    {
        if(JsonParser.getValue("config.global.screenshotforfail").equalsIgnoreCase("yes")) {
            ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.FAIL, string,ExtentManager.getTest().addBase64ScreenShot("data:image/png;base64,"+addScreenCapture));
        }
    }

    public static void skip(String string, String addScreenCapture)
    {
        if(JsonParser.getValue("config.global.screenshotforskip").equalsIgnoreCase("yes")) {
            ExtentManager.getTest().log(com.relevantcodes.extentreports.LogStatus.SKIP, string,ExtentManager.getTest().addBase64ScreenShot("data:image/png;base64,"+addScreenCapture));
        }
    }
}
