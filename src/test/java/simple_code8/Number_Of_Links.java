package simple_code8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number_Of_Links {
public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Rediff.com");
		
	
		List<WebElement> RediffLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links  in this page: " +RediffLinks.size());	

	}

}
