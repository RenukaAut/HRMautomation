package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_LoginPage {
 //data member
@FindBy(xpath="//input[@name='username']")
private WebElement username;
		
	@FindBy(xpath="//input[@name='password']")
			
	private WebElement password;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	private WebElement login;
	
	
	//constructor
public A_LoginPage (WebDriver driver)
{
  PageFactory.initElements(driver, this);	
}	


//method
public void sendusername (String uname)		
{		
	 username.sendKeys(uname);
}		
		
public void sendpassword(String pass)		
{		
	password.sendKeys(pass);	
}

public void clickonloginbutton()
{	
	login.click();
}		
	
		
		
		

	}


