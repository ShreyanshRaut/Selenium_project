package Assignment4;
//Shreyansh Raut (c0913472)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) throws InterruptedException {
        // Importing ChromeDriver
        System.setProperty("webdriver.chrome.driver", "D:\\Program\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Navigating to gmail
        driver.get("https://www.gmail.com");
        Thread.sleep(4000); 

        // Maximizing the screen size
        driver.manage().window().maximize();
        Thread.sleep(3000); 
        //Inputting the email address
        driver.findElement(By.id("identifierId")).sendKeys("crayancraut@gmail.com");
        Thread.sleep(3000); 
        //Clicking the Next button
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000); 
        //Checking whether the title matches to get successful result
        String at = driver.getTitle();
        String et = "Gmail";
        driver.close();
        
        if(at.equalsIgnoreCase(et)) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
    }
}
