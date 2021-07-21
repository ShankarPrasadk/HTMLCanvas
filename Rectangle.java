package canvasStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Rectangle {

	public static void main(String[] args) {System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Desktop\\eclipse\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://htmlcanvasstudio.com/");
	WebElement rect = driver.findElement(By.xpath("//div[@class='toolbar']/input[contains(@class,'rectangle')]"));
	int z1=0, z2=327, z3=354, z4=106;	
	Actions action = new Actions(driver);
	rect.click();
	Action rectangle =action.moveToElement(rect,z1,z2).clickAndHold().moveByOffset(z3, z4).release().click().build();
	rectangle.perform();
	}

}
