package template;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class Template {
		
		private void pause(double seconds) {
            try {
                  Thread.sleep((long) (seconds*1000));                 
            } catch(InterruptedException e) {
                  Thread.currentThread().interrupt();
            }
		}
		
		private WebDriver driver;
			JavascriptExecutor js;
		  
			@Before
				public void setUp() {
					DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--incognito");
					options.addArguments("--no-proxy-server");
					options.addArguments("start-maximized");
					capabilities.setCapability(ChromeOptions.CAPABILITY, options);
					driver = new ChromeDriver(capabilities);
					}
		  

			@After
				public void tearDown() {
					driver.quit();
					}
		  
			
			@Test
				public <WebElement> void test() throws InterruptedException {
				driver.get("http://10.12.137.252:8090/jhptGui/husimPhoneList.jsf");
				pause(5);
				}
		}
	  			

