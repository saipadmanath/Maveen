package praticwebelement;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;



public class download {
	           static WebDriver driver;
	           static FirefoxOptions options;

	 public void Profile () {
		
		FirefoxProfile  fox =new FirefoxProfile();
		fox.setPreference("browser.download.folderlist",2);
		fox.setPreference("browser.download.manage.showwhenstart",false);
		fox.setPreference("browser.download.dir","E:/Selinium");
		fox.setPreference("browser.helpapps.neverask.savetodisk.","E:/Selinium");
		fox.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		options = new FirefoxOptions();
		options.setProfile(fox);
	 	 
	  
	 }
	 
	 	public static void main(String[] args) throws InterruptedException 
	 	{	
	 		
        String path =System.getProperty("E:/Selinium/geckodriver.exe");
		System.setProperty("Webdriver.gecko.dirver",path);
		
		driver= new FirefoxDriver(options);
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.name("username")).sendKeys("natrajan0907@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("nat@852906");
        driver.findElement(By.name("Sent")).click();
        driver.findElement(By.name("q")).sendKeys("Vignesh.S2cf847@cognizant.com ");
        driver.findElement(By.xpath("//*[@id=\":8g\"]")).click();
        Actions action =new  Actions (driver);
        WebElement E = driver.findElement(By.xpath("//*[@id=\":au\"]"));
        action.moveToElement(E).click().build().perform();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 		
	 	
        driver.close();
         
	 	}   
        
       
         
	

}
