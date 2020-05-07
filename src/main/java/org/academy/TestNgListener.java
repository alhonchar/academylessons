package org.academy;

import org.testng.IClassListener;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.TestListenerAdapter;

public class TestNgListener extends TestListenerAdapter implements IInvokedMethodListener, IClassListener, ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("On Start Listener");
    }

    @Override
    public void onBeforeClass(ITestClass itestClass) {
        System.out.println("On Before Class Listener");
    }
}
