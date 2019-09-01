package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.java.After;

public class login {

  WebDriver driver;
	
	
@Test(dataProvider="testdata")
	public  void main(String username,String password) throws InterruptedException  
	{
	    //System.setProperty("webdriver.firefox.driver","C:\\Users\\Natrajan\\Downloads\\geckodriver.exe");
	    ///driver=new FirefoxDriver();
	//System.setProperty("webdriver.Chrome.driver","E:/NInja download/Compressed/chromedriver.exe");
	  ///driver=new ChromeDriver();
	System.setProperty("webdriver.gecko.driver","E://Selinium//geckodriver.exe");
	 driver =new FirefoxDriver();
	
	
		driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		Thread.sleep(500);
		
		Assert.assertTrue(driver.getTitle().contains("Newsfeed"));
		System.out.println("pagetitleis verified ");
	}
@After 
public void closes() {
	driver.close();
}

@DataProvider(name="testdata")
public Object [][]  testdatafeed() throws Exception 
	{
	maintest config =new maintest ("E:\\ECLIPS\\Github\\MAVENNEW\\MavenWebApp1\\Inputfile\\TNSTCIMPORT.xlsx");

	int row =config.getrowcount(0);
	
	Object [][]data =new Object[row][2];
	
	for(int i=1;i<=row;i++)
	{			
	try {
		data[i][0] = config.getcelldata(0, i, 0);
		data[i][1] = config.getcelldata(0, i, 1);
	} catch (NullPointerException e)
	{
	
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	
	}
	}
	
	return data;
	}
}

