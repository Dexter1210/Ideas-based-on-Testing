package firstday;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Multipleobjs {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\3dplmtraining\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> linkobjs=driver.findElements(By.tagName("a"));
		System.out.println("number of links is  "+ linkobjs.size());
		for(int i=0;i<=linkobjs.size()-1;i++) {
			System.out.println("Link Name is ="+linkobjs.get(i).getText());
			if (linkobjs.get(i).getText().equals("Destinations")) {
				linkobjs.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
