package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		driver.manage().window().maximize();
		String str = driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary of Wagner =  "+ str);
	}

}
