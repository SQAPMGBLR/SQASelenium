package Sdlc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddBook {


	@Test
	 public void Add_book() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	            
       
              driver.get("http://10.248.69.137:6080/ELibrary-Dev/index.html");
              Thread.sleep(2000);
       driver.findElement(By.xpath("//form[@action='LibrarianLogin']/div/input[@id='email1']")).sendKeys("vanam.surendra@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//form[@action='LibrarianLogin']/div/input[@id='password1']")).sendKeys("Apr2017");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//form[@action='LibrarianLogin']//*[text()='Login']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[.='Add Book']")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("callno1")).sendKeys("123");
       Thread.sleep(2000);
       driver.findElement(By.id("name1")).sendKeys("Java");
       Thread.sleep(2000);
       driver.findElement(By.id("author1")).sendKeys("Surendra");
       Thread.sleep(2000);
       driver.findElement(By.id("publisher1")).sendKeys("Sun Micro");
       Thread.sleep(2000);
       driver.findElement(By.id("quantity1")).sendKeys("5");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[.='Save Book']")).click();
       driver.close();
       
       
       
       
       }

}


