package praticwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class img {
	 static WebDriver driver;
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "E:/Selinium/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://facebook.com");
			validation();
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}

	public static void validation()
	{
	WebElement ImageFile = driver.findElement(By.tagName("title"));
    
    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
    if (!ImagePresent)
    {
         System.out.println("Image not displayed.");
    }
    else
    {
        System.out.println("Image displayed.");
    }
    driver.close();
}
	
	
}
