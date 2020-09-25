package firstday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formpage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("file:///C:/Users/DEVESH%20SHARMA/Desktop/formpage.html");
		  Thread.sleep(5000);
		  driver.close();
	}

}
