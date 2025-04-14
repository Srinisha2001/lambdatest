package simpleformdemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SimpleFormDemo {
	WebDriver driver = null;
	@Test (priority = 0)
	public static void chromeBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String sessionId = ((ChromeDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("----------Chrome Browser------------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Simple Form Demo")).click();
		String URl = "https://www.lambdatest.com/selenium-playground";
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		assertTrue(currentURL.contains("simple-form-demo"),"URL does not contain 'simple-form-demo'");
		System.out.println("URL displayed as expected");
		String message = "Welcome to LambdaTest";
		driver.findElement(By.id("user-message")).sendKeys(message);
		driver.findElement(By.id("showInput")).click();
		String ActualMessage = driver.findElement(By.id("message")).getText();
		assertEquals(message,ActualMessage);
		System.out.println("Message matched");
		driver.quit();
		}

	@Test (priority = 1)
	public static void firefoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String sessionId = ((FirefoxDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("-----------FireFox Browser-------------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Simple Form Demo")).click();
		String URl = "https://www.lambdatest.com/selenium-playground";
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		assertTrue(currentURL.contains("simple-form-demo"),"URL does not contain 'simple-form-demo'");
		System.out.println("URL displayed as expected");
		String message = "Welcome to LambdaTest";
		driver.findElement(By.id("user-message")).sendKeys(message);
		driver.findElement(By.id("showInput")).click();
		String ActualMessage = driver.findElement(By.id("message")).getText();
		assertEquals(message,ActualMessage);
		System.out.println("Message matched");
		driver.quit();
	}
	
	@Test (priority = 2)
	public static void edgeBrowser() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String sessionId = ((EdgeDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("-----------Edge Browser-------------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Simple Form Demo")).click();
		String URl = "https://www.lambdatest.com/selenium-playground";
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		assertTrue(currentURL.contains("simple-form-demo"),"URL does not contain 'simple-form-demo'");
		System.out.println("URL displayed as expected");
		String message = "Welcome to LambdaTest";
		driver.findElement(By.id("user-message")).sendKeys(message);
		driver.findElement(By.id("showInput")).click();
		String ActualMessage = driver.findElement(By.id("message")).getText();
		assertEquals(message,ActualMessage);
		System.out.println("Message matched");
		driver.quit();
	}
}
