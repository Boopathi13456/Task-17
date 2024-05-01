package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.snapdeal.com");
		
		Thread.sleep(6000);
		
		WebElement element = driver.findElement(By.className("accountInner"));
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		WebElement element2 = driver.findElement(By.linkText("Your Account"));
		element2.click();
		
		driver.findElement(By.id("userName")).sendKeys("9688806196");
		driver.findElement(By.id("checkUser")).click();
		System.out.print("Snapdeal Login Is Sucessfull");
		
		
		driver.close();
		
	}

}
