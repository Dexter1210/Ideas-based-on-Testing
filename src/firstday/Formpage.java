package firstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formpage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("file:///C:/Users/DEVESH%20SHARMA/Desktop/formpage.html");
		  WebElement searchField=driver.findElement(By.name("Username"));
		  WebElement searchField1=driver.findElement(By.name("Password"));
		  WebElement searchField2=driver.findElement(By.name("Submit"));
		  searchField.sendKeys("mercury");
		  searchField1.sendKeys("mercury");
		  searchField2.click();
		  Thread.sleep(5000);
		  driver.close();
	}

}
