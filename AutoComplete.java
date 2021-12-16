package december16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement auto = driver.findElement(By.xpath("//input[@id='tags']"));
		auto.sendKeys("s");
		WebElement element = driver.findElement(By.xpath("//div[text()='Selenium']"));
		
		Actions builder = new Actions(driver);
		builder.click(element).perform();
		
				
	}

}
