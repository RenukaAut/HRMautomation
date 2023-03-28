package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pomPackage.A_LoginPage;
import testUtility.Readfile;
import testUtility.StaticBrowser;

	public class TestNGClass {

		WebDriver driver;
		@Parameters({"browser"})
		
		@BeforeTest
		public void beforeTest(String browser)
		{
			driver = StaticBrowser.launchBrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", 10);
		}
		
		@BeforeClass
		public void beforeClass() 
		{
			System.out.println("before Class");
		}
		
		@BeforeMethod
		public void beforeMethod() 
		{
			System.out.println("before Method");
		}
	
		
		@Test()
		public void VerifyLoginfunctinality() throws IOException, EncryptedDocumentException
		
		{ 
			A_LoginPage log= new A_LoginPage(driver);
			log.sendusername(Readfile.FetchDataFromExcel(6, 0));
			log.sendpassword(Readfile.FetchDataFromExcel(6, 1));
			log.clickonloginbutton();	
			
		}		
			
		@AfterMethod
		public void afterMethod() 
		{
			System.out.println("after Method");
		}
		
		@AfterClass
		public void afterClass() 
		{
			System.out.println("after Class");
		}
		
		
		@AfterTest
		public void afterTest()
		{
			System.out.println("after Test");
			//driver.close();
		}
		
}