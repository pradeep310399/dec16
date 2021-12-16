package december16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
         public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://www.leafground.com/pages/tooltip.html");
			WebElement element = driver.findElement(By.xpath("//input[@id='age']"));
			Actions builder = new Actions(driver);
			builder.click(element).sendKeys("name").build().perform();
		}
}
