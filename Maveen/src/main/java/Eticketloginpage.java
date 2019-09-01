import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Eticketloginpage {

	WebDriver driver;
	
	
	
	By loginpage =By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[1]/td/a/img");
	
	
	public Eticketloginpage(WebDriver driver)
	{
		this.driver=driver;
		
		
		
	}
	

	public void  eticketlogin() {
		
		driver.findElement(loginpage).click();
		
	}


}
	
	
	
	

