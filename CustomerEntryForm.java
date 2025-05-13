package entryForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CustomerEntryForm {

	@Test
	void customerEntryform_TC_01(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/VerizonCustomerForm.html");
		WebElement heading = driver.findElement(By.tagName("h2"));
		String text = heading.getText();
		//System.out.println(text);
		//driver.findElement(By.id("customerId")).sendKeys("1234");
		driver.findElement(By.xpath("//*[starts-with(@id, 'cust')]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[contains(@name, 'lln')]")).sendKeys("ABCD");
		driver.findElement(By.id("dob")).sendKeys("20-02-1990");
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.xpath("/html/body/form/fieldset[2]/input[1]")).sendKeys("0123456789");
		driver.findElement(By.cssSelector("#email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("address")).sendKeys("This is address field under legend 'Contact & Address'.");
		
		WebElement setPlan = driver.findElement(By.id("plan"));
		setPlan.click();
		Select select = new Select(setPlan);
		select.selectByVisibleText("5G Start");
		driver.findElement(By.id("simNumber")).sendKeys("123131456456");
		driver.findElement(By.name("deviceIMEI")).sendKeys("123456789123");
		driver.findElement(By.xpath("//*[@id='activationDate']")).sendKeys("02-03-1990");
		WebElement checkbox = driver.findElement(By.id("porting"));
		if(!checkbox.isSelected()) 
			checkbox.click();
		driver.findElement(By.xpath("//*[@id = 'prevCarrier']")).sendKeys("Yes");
		driver.findElement(By.xpath("/html/body/form/fieldset[4]/input[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\Tester.jpg");
		driver.findElement(By.id("signature")).sendKeys("C:\\\\Users\\\\Admin\\\\Downloads\\\\Tester.jpg");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("#submitBtn")).click();
	}
}


