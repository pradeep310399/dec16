package december16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		WebElement course = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		course.getText();
		System.out.println(course.getText());
		System.out.println("***********************");
		Actions builder = new Actions(driver);
		builder.moveToElement(course).perform();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='TestLeaf Courses']//following::a"));
		
		for(int i=0;i<list.size();i++) {
		String text = list.get(i).getText();
		System.out.println(text);
		System.out.println("***********************");
		
	}
		builder.moveToElement(course).perform();
		driver.findElement(By.xpath("//a[text()='WebServices']")).click();
		Alert alert = driver.switchTo().alert();
	    String text = alert.getText();
	    System.out.println(text);
	    System.out.println("*******************");
	    alert.accept();


		System.out.println("Alert is handled");
		driver.quit();
		

}
}