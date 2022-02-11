package org.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {

	public static WebDriver driver;
	public Actions a= new Actions(driver);
	public void startChrome(String url)
	{ 

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}


	public void mouseClick(WebElement ele) throws InterruptedException
	{
		ele.click();
		Thread.sleep(1000);


	}

	public void insertText(WebElement ele, String value)
	{
		ele.sendKeys("value");
	}

	public void mouseOver(WebElement ele, String value)
	{

		a.moveToElement(ele).build().perform();
	}

	public void goToChildWindow()
	{
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window name  :  " +parentwindow);

		Set<String> allwindowname = driver.getWindowHandles();
		for (String onebyonewindow : allwindowname) //2
		{
			System.out.println(onebyonewindow);
			//switching to child window
			if(!parentwindow.equals(onebyonewindow))
			{
				driver.switchTo().window(onebyonewindow);

			}
		}
	}

public void frameSwitchUsingId(String Id)
{
	driver.switchTo().frame(Id);
}
public void frameSwitchUsingName(String name)
{
	driver.switchTo().frame(name);
}
public void frameSwitchUsingIndex(int num)
{
driver.switchTo().frame(num);	
}

}
