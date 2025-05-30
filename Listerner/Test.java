package qa; 
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Ended");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        System.out.println("visit: https://www.xbox.com/en-IN/");
    }
}
