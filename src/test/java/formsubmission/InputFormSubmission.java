package formsubmission;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InputFormSubmission {
	WebDriver driver = null;
	@Test (priority = 0)
	public static void chromeBrowser() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String sessionId = ((ChromeDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("-----------ChromeBrowser----------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Input Form Submit")).click();
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("inputEmail4")).sendKeys("srinisha.kottee2001@gmail.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("169349");
		driver.findElement(By.id("company")).sendKeys("Rage");
		driver.findElement(By.name("website")).sendKeys("Example");
		driver.findElement(By.name("country")).click();
		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_U);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("inputCity")).sendKeys("America");
		driver.findElement(By.id("inputAddress1")).sendKeys("America");
		driver.findElement(By.id("inputAddress2")).sendKeys("America");
		driver.findElement(By.id("inputState")).sendKeys("America");
		driver.findElement(By.id("inputZip")).sendKeys("12346");
		driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
		String successmessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")).getText();
		System.out.println(successmessage);
		String ExpectedMessage = "Thanks for contacting us, we will get back to you shortly.";
		assertEquals(ExpectedMessage,successmessage);
		System.out.println("Success Message Matched (Chrome)");
		driver.quit();
		
	}
	
	@Test (priority = 1)
	public static void FirefoxBrowser() throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String sessionId = ((FirefoxDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("-----------FireFoxBrowser----------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Input Form Submit")).click();
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("inputEmail4")).sendKeys("srinisha.kottee2001@gmail.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("169349");
		driver.findElement(By.id("company")).sendKeys("Rage");
		driver.findElement(By.name("website")).sendKeys("Example");
		driver.findElement(By.name("country")).click();
		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_U);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("inputCity")).sendKeys("America");
		driver.findElement(By.id("inputAddress1")).sendKeys("America");
		driver.findElement(By.id("inputAddress2")).sendKeys("America");
		driver.findElement(By.id("inputState")).sendKeys("America");
		driver.findElement(By.id("inputZip")).sendKeys("12346");
		driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
		String successmessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")).getText();
		System.out.println(successmessage);
		String ExpectedMessage = "Thanks for contacting us, we will get back to you shortly.";
		assertEquals(ExpectedMessage,successmessage);
		System.out.println("Success Message Matched (FireFox)");
		driver.quit();
	}

	@Test (priority = 2)
	public static void EdgeBrowser() throws AWTException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String sessionId = ((EdgeDriver)driver).getSessionId().toString();
		System.out.println(sessionId);
		System.out.println("-----------EdgeBrowser----------");
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.findElement(By.linkText("Input Form Submit")).click();
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("inputEmail4")).sendKeys("srinisha.kottee2001@gmail.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("169349");
		driver.findElement(By.id("company")).sendKeys("Rage");
		driver.findElement(By.name("website")).sendKeys("Example");
		driver.findElement(By.name("country")).click();
		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_U);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("inputCity")).sendKeys("America");
		driver.findElement(By.id("inputAddress1")).sendKeys("America");
		driver.findElement(By.id("inputAddress2")).sendKeys("America");
		driver.findElement(By.id("inputState")).sendKeys("America");
		driver.findElement(By.id("inputZip")).sendKeys("12346");
		driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
		String successmessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p")).getText();
		System.out.println(successmessage);
		String ExpectedMessage = "Thanks for contacting us, we will get back to you shortly.";
		assertEquals(ExpectedMessage,successmessage);
		System.out.println("Success Message Matched (Edge)");
		driver.quit();
	}
}
