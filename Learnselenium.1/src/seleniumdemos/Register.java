package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/Register");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Hima");
        driver.findElement(By.name("LastName")).sendKeys("bathala");
        driver.findElement(By.id("Email")).sendKeys("himabindubathala26@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("siribathala");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("siribathala");
        
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        driver.close();
	}

}
