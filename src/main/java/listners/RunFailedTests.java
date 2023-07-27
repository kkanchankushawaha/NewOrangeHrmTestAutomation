package listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunFailedTests implements IRetryAnalyzer {

    int minRetryCount = 0;
    int maxRetryCount = 2;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (minRetryCount<maxRetryCount && !iTestResult.isSuccess()){
            minRetryCount++;
            return true;
        }
System.out.println("test");
        return false;
    }
}
