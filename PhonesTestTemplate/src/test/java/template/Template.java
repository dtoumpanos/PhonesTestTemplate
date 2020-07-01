package template;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Template {
	  private WebDriver driver;
	  JavascriptExecutor js;
		  
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	  }
		  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
		  
	  @Test
	  public <WebElement> void test() throws InterruptedException {
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
	    driver.findElement(By.name("q")).click();
	    driver.findElement(By.name("q")).sendKeys("unify.com");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);	
	   }
	  			
}
