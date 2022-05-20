package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class screenshot implements ITestListener {

	BaseClass b = new BaseClass();

	public void onTestFailure(ITestResult result) {
		
	
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
