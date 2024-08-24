package com.abhi.reports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
    public static ExtentReports report;

    public static void initializeReports() {
        if(report==null) {
            new ExtentReport();
        }
    }

    public static void closeReports() {
        report.flush();
        report.close();
    }
}
