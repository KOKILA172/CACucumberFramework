package utility;


import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;


public class BaseClass<TakeScreenshot> {
public static Logger log; 
public static WebDriver driver;


public void getScreenshot(String result) throws IOException {
	// TODO Auto-generated method stub
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D://CA//CACucumberFramework//Screenshot"+result+"screenshot.png"));
}



}
