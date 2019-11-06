package org.prac;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\Practice\\driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File drc = new File("C:\\Users\\Barath\\Pictures\\screen\\face.png");
	FileUtils.copyFile(src, drc);
}
}