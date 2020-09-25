package firstday;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWorld {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.close();
	}

}
