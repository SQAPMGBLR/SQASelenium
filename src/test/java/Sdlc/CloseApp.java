package Sdlc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseApp {


		  @Test
		  public void Close_App() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		            
		            driver.get("http://10.248.69.137:6080/ELibrary-Dev/index.html");
		           
		            //driver.findElement(By.xpath("//a[.='Logout']")).click();
		            
		            
		            driver.quit();
			  
		  }
		}



