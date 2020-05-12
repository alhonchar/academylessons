package org.academy.devHalimanEvgenii.listener;

import lombok.extern.slf4j.Slf4j;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.xml.transform.Result;

@Slf4j
public class AuthListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("The name of the testcase passed is :" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error("The name of the testcase failed is :" + result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        log.info(result.getName() + " test case started");
    }
}
