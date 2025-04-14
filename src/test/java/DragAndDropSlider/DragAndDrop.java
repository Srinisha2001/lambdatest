package DragAndDropSlider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test (priority = 0)
	public static void chromeBrowser() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String sessionId = ((ChromeDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("----------Chrome Browser------------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Drag & Drop Sliders")).click();
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider3\"]/div/input"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(213,15).release().perform(); 
		String SuccessPercent = driver.findElement(By.id("rangeSuccess")).getText();
		assertEquals("95",SuccessPercent);
		System.out.println("The range value shows 95 (Chrome)");
		driver.quit();
	}
	
	@Test (priority = 1)
	public static void firefoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String sessionId = ((FirefoxDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("----------FireFox Browser------------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Drag & Drop Sliders")).click();
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider3\"]/div/input"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(216,15).release().perform(); 
		String SuccessPercent = driver.findElement(By.id("rangeSuccess")).getText();
		assertEquals("95",SuccessPercent);
		System.out.println("The range value shows 95 (FireFox)");
		driver.quit();
	}
	
	@Test (priority = 2)
	public static void EdgeBrowser() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String sessionId = ((EdgeDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("----------Edge Browser------------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Drag & Drop Sliders")).click();
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider3\"]/div/input"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(213,15).release().perform(); 
		String SuccessPercent = driver.findElement(By.id("rangeSuccess")).getText();
		assertEquals("95",SuccessPercent);
		System.out.println("The range value shows 95 (Edge)");
		driver.quit();
	}

}
