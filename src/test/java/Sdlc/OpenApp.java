package Sdlc;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenApp {



@Test
	  public void testNG_Oprnapp() {
		  
		  
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	            
			   
	        driver.get("http://10.248.69.137:6080/ELibrary-Dev/index.html");
	        driver.manage().window().maximize();
	        driver.close();
	   
	  }
	}