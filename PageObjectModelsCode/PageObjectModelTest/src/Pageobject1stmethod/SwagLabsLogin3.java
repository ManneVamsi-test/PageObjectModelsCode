package Pageobject1stmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FirstmethodResources.Loginpage;
import FirstmethodResources.Loginpage2;

public class SwagLabsLogin3 {
@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome drivers\\Chrome 114\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		Loginpage2 login=new Loginpage2(driver);
		login.UserName("problem_user");
		login.UserPassword("secret_sauce");
		login.LoginClick();
		//driver.close();
	}

}
