package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	private static String tester;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        
        Alert alert=driver.switchTo().alert();
        
        String alertmessage=driver.switchTo().alert().getText();
        System.out.println(alertmessage);
          alert.accept();
          
        driver.findElement(By.xpath("//button[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alertone=driver.switchTo().alert();
        
        String alertonemessage=driver.switchTo().alert().getText();
        System.out.println(alertonemessage);
        alertone.dismiss();
        
        driver.findElement(By.xpath("//button[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alerttwo=driver.switchTo().alert();
        
        String alerttwomessage=driver.switchTo().alert().getText();
        System.out.println(alerttwomessage);
        alerttwo.sendKeys(tester);
        alerttwo.accept();
        
        
        
        
		

	}

}
