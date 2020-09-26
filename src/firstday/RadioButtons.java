package firstday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("http://www.demo.guru99.com/selenium/newtours");
		  driver.findElement(By.linkText("Flights")).click();
		  Thread.sleep(5000);
		  
		  
		  List<WebElement> trip_radios=driver.findElements(By.name("tripType"));
		  int count=trip_radios.size();
		  System.out.println("No. of radio buttons is"+count);
		  for(int i=0;i<count;i++) {
			  if(trip_radios.get(i).isSelected()) {
				  System.out.println("Default radio button is "+trip_radios.get(i).getAttribute("value"));
			  }
		  }
		  Thread.sleep(7000);
		  driver.close();
	}

}
