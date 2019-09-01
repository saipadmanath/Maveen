import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	
	By username = By.xpath("//*[@id=\"email\"]");
	By password =By.xpath("//*[@id=\"pass\"]");
	By click = By.xpath("//*[@id=\"loginbutton\"]");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
		
		
	}
	
	
	
	
	public void enterpassword(String password1) {
		
	driver.findElement(password).sendKeys(password1);
	}
		
	
	
	public void enterusername(String username3) {
		driver.findElement(username).sendKeys(username3);
	}
	
	
	
	
		
		public void click1() {
			
			driver.findElement(click).click();
			
			
		}
		
		
	public void secondpage(String password1, String username3) {
	
	
	this.enterusername(username3);
	this.enterpassword(password1);
	this.click1();
		
	
	}
	
		
		
		
		
		
		
	}
	
	
		
		
	
	
	


