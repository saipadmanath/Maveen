import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class java {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","E://Selinium//geckodriver.exe");
	//WebDriver driver =new ChromeDriver();
	//WebDriver driver = new OperaDriver();
	WebDriver driver =new FirefoxDriver();
	//WebDriver driver = new EdgeDriver();
	driver.get("https://justattach.com/justattach/downloads.php");
}

}
