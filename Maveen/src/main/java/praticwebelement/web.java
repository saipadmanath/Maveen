package praticwebelement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class web {
	
	 static WebDriver driver;
	public static void main (String []args) throws IOException, InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","E:/Selinium/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("http://facebook.com");
		takescreenshoot("shoot");
	}
	
	public static void takescreenshoot(String filename) throws IOException, InterruptedException
	{
		

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("E:/Selinium/SCREEN SHOOT/"+filename+".png"));
			
			Thread.sleep(5000);
			driver.close();
		
	}

}
