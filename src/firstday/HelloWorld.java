package firstday;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWorld {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("HDFC Bank");
		searchfield.click();
		Thread.sleep(200000);
		driver.close();
	}

}
