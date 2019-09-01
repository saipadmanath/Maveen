import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E://Selinium//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		
		driver.get("https://tnstc.in/home.html");
 		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
 		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[1]/td/a/img")).click();
 		driver.findElement(By.xpath("//input[@name=\\\"username\\\"]")).sendKeys("a");
 		
	}

}
