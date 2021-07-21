package canvasStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sketch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Desktop\\eclipse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://htmlcanvasstudio.com/");
		WebElement line = driver.findElement(By.xpath("//div[@class='toolbar']/input[contains(@class,'line')]"));
		WebElement rect = driver.findElement(By.xpath("//div[@class='toolbar']/input[contains(@class,'rectangle')]"));
		WebElement canvas = driver.findElement(By.xpath("//div[@id='container']/canvas[@id='imageView']"));
		WebElement eraser =driver.findElement(By.xpath("//div[@class='toolbar']/input[contains(@class,'eraser')]"));
		line.click();
		int initialx = -299,initialy= -250;
		int h1=initialx+200;
		int h2=200;
		int v1=(h2-h1)/2;
		int y1=initialy+110;
		int y2=200;
		int z1=90;
		int z2=359;

		Actions action = new Actions(driver);
		
		Action horizontal = action.moveToElement(canvas, h1, y1).clickAndHold().moveByOffset(h2, 0).release().click().build();
		horizontal.perform();
		Thread.sleep(2000);
		Action vertical = action.moveToElement(canvas, 0, y1-90).clickAndHold().moveByOffset(0, y2).release().click().build();
		vertical.perform();
		Thread.sleep(2000);
		rect.click();
		Action rectangle =action.moveToElement(rect,z1,z2).clickAndHold().moveByOffset(326, 93).release().click().build();
		rectangle.perform();
		Thread.sleep(2000);
		eraser.click();
		Action erasehoriz = action.moveToElement(canvas, h1, y1).clickAndHold().moveByOffset(h2, 0).release().click().build();
		erasehoriz.perform();
		
	}
}
