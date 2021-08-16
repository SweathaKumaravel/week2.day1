package week2.day1assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.linkText("English (UK)"));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sweatha");
		driver.findElement(By.name("lastname")).sendKeys("sweath");
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sweath11");
		WebElement day = driver.findElement(By.id("day"));
		Select drop1=new Select(day);
		drop1.selectByVisibleText("11");
		WebElement month = driver.findElement(By.id("month"));
		Select drop2=new Select(month);
		drop2.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3=new Select(year);
		drop3.selectByValue("1999");
		WebElement check = driver.findElement(By.name("sex"));
		check.click();		
		

	}

}
