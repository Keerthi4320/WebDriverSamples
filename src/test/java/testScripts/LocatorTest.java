package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		driver.manage().window().maximize();
//		String str = driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
//		System.out.println("Salary of Wagner =  "+ str);
		
		List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td"));
		System.out.println("Number of items = "+items.size());
		for(WebElement cell : items) {
			System.out.println(cell);
		}
	}

}
