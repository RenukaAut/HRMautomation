package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomPackage.A_LoginPage;

public class TestClass {

	public static void main(String[] args)
	{

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option); 
							
 	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
 	//driver.get("https://www.facebook.com/");
 	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       A_LoginPage login = new A_LoginPage(driver);
      
       login.sendusername("Admin");
       
       login.sendpassword("admin123");
       
       login.clickonloginbutton();
	}

}
