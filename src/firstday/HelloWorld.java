package firstday;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWorld {
	
	public static void main(String[] args) throws InterruptedException {

System.out.println("Hello World");
  System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  
  driver.get("http://www.demo.guru99.com/test/newtours/");
  WebElement searchField=driver.findElement(By.name("userName"));
  WebElement searchField1=driver.findElement(By.name("password"));
  WebElement searchField2=driver.findElement(By.name("submit"));
  searchField.sendKeys("mercury");
  searchField1.sendKeys("mercury");
  searchField2.click();
  Thread.sleep(5000);
  driver.close();

	}

}
