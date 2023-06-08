package FirstmethodResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
WebDriver driver;

//By User_Name=By.id("user-name");
//By Password=By.id("password");
//By Login=By.xpath("//input[@id='login-button']");


//This style also we can use 
//@FindBy(how = How.ID, using = "user-name")
//WebElement User_Name;

@FindBy(id = "user-name")
WebElement User_Name;

@FindBy(id = "password")
WebElement Password;

@FindBy(xpath = "//input[@id='login-button']")
WebElement Login;

public Loginpage2(WebDriver d) 
{
  driver=d;	
  PageFactory.initElements(d, this);//Additional Method
}

public void UserName(String Uname) {
	User_Name.sendKeys(Uname);
}

public void UserPassword(String Upassword) {
	Password.sendKeys(Upassword);
}

public void LoginClick() {
	Login.click();
}
}
