package week2.day1assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("sweatha");
		driver.findElement(By.name("UserLastName")).sendKeys("sweath");
		driver.findElement(By.name("UserEmail")).sendKeys("swe@gmail.com");
		WebElement usertitle = driver.findElement(By.name("UserTitle"));
		Select drop1=new Select(usertitle);
		drop1.selectByValue("Sales_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		WebElement companyemployees = driver.findElement(By.name("CompanyEmployees"));
		Select drop2=new Select(companyemployees);
		drop2.selectByValue("2");
		driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
		WebElement companycountry = driver.findElement(By.name("CompanyCountry"));
		Select drop3=new Select(companycountry);
		drop3.selectByValue("IN");
		WebElement check = driver.findElement(By.className("checkbox-ui"));
		check.click();
		
		
	}

}
