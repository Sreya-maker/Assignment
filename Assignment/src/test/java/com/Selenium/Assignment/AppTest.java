package com.Selenium.Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
   	
	@Test
		public void test() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/revenue-calculator");
		Thread.sleep(3000);

		// Text content

		WebElement text = driver.findElement(By.id(":R57alklff9da:"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.click(text).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build()
				.perform();
		Thread.sleep(2000);
		act.sendKeys(text, "560").build().perform();
		Thread.sleep(2000);
		act.click();

		// checkbox content

		 driver.findElement(By.xpath("//div[1]/label/span[1]/input")).click();
		  System.out.println("CLicked Checkbox1");
		  
		  driver.findElement(By.xpath("//div[2]/label/span[1]/input")).click();
		  System.out.println("CLicked Checkbox2");
		  
		  driver.findElement(By.xpath("//div[3]/label/span[1]/input")).click();
		  System.out.println("CLicked Checkbox3"); 
		  driver.findElement(By.xpath("//div[8]/label/span[1]/input")).click();
		  System.out.println("CLicked Checkbox4");
		 
		driver.quit();
	}	
	}
	
