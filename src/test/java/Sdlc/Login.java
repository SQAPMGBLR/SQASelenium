package Sdlc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void Login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
          
     driver.get("http://10.248.69.137:6080/ELibrary-Dev/index.html");
     Thread.sleep(2000);
      driver.findElement(By.id("email1")).sendKeys("admin@nttdata.com");
      Thread.sleep(2000);
      driver.findElement(By.id("password1")).sendKeys("admin123");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[text()='Login']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[.='Add Librarian']")).click();
    
      driver.close();
  }
}
