package canvasStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HtmlSketch {

	static WebDriver driver;
	static String canvaspage ="//div[@class='toolbar']/input[contains(@class,'line')]";
	static int initialx =-299, initialy = -250;
	static int h1=initialx+200;
	static int h2=200;
	static int v1=(h2-h1)/2;
	static int y1=initialy+110;
	static int y2=200;
	static int z1=-100;
	static int z2=100;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Desktop\\eclipse\\ChromeDriver\\ChromeDriver-90.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://htmlcanvasstudio.com/");
		CanvasLines(h1, y1, h2, 0);
		
	}
	
	
	@FindBy(xpath="//div[@class='toolbar']/input[contains(@class,'line')]")
	WebElement line;
	
	By linesymbol = By.xpath("//div[@class='toolbar']/input[contains(@class,'line')]");
	
	public void lineClickFn() {
		
		if(line.isDisplayed())
		{
			WebDriverwait 
		}
		
}
	
	@FindBy(xpath="//div[@id='container']/canvas[@id='imageView']")
	static
	WebElement canvas;	
	public static void CanvasLines(int x1, int y1, int x2, int y2) {
		driver.findElement(By.xpath(canvaspage)).click();
		Actions act = new Actions(driver);
		Action mouse = act.moveToElement(canvas, x1, y1).clickAndHold().moveByOffset(x2, y2).release().click().build();
		mouse.perform();
	}
	
	/*context.moveTo(259, 55);
	context.lineTo(261, 197);
	
	public static void drawShapeFn(int x1,int y1, int x2,int y2) {
		Actions act = new Actions(driver);
		Action mouse = act.moveToElement(canvas,x1,y1)
		mouse.perform();
	}
	*/
	
}
	