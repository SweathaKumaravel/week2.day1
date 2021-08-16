package week2.day1assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//login page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.close();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRMSFA page
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//home page
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		//create lead page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HTC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sweatha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("k");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn=new Select(drop1);
		drpDwn.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sweath");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("ms");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("create leadform");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("15LPA");
		WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn2=new Select(drop2);
		drpDwn2.selectByValue("IND_SOFTWARE");
		WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn3=new Select(drop3);
		drpDwn3.selectByValue("OWN_PARTNERSHIP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("60000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("enter the values");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("fill the form");
		WebElement drop4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn4=new Select(drop4);
		drpDwn4.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("abc");
		WebElement drop5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn5=new Select(drop5);
		drpDwn5.selectByVisibleText("ALL - Albanian Lek");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yes");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/05/1999");
		//contact information
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600564479");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		//prmary address
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600107");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
		

	}

}
