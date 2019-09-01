package version;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.xml.internal.ws.wsdl.writer.document.Definitions;

public class TEST {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:/Selinium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Redmi K20 Pro Vs K20");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"video-title\"]"));
		action.moveToElement(element).build().perform();
		driver.close();
	}
}
