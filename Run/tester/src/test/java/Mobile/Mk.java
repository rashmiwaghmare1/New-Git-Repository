 package Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mk{
public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9834545136");
      Thread.sleep(2000);
     driver.navigate().to("https://www.gmail.com");
     driver.findElement(By.id("identifierId")).sendKeys("rashmiwaghmare1@gmail.com");
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
     String g=driver.getTitle();
     System.out.println(g);
     
}
 }