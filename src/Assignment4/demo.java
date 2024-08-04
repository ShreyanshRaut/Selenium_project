package Assignment4;
// Shreyansh Raut (c0913472)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

    public static void main(String[] args) throws InterruptedException {
        // Importing ChromeDriver
        System.setProperty("webdriver.chrome.driver","D:\\Program\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigating to Yahoo.com to sign-up page
        driver.get("https://login.yahoo.com/");
        Thread.sleep(4000);
        // Maximizing the screen size
        driver.manage().window().maximize();
        Thread.sleep(4000);
        //Clicking create account button
        driver.findElement(By.id("createacc")).click();
        Thread.sleep(4000);
        //Filling out the form fields
        //Filling out first name
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("Shreyansh");
        Thread.sleep(4000);
        //Filling out last name
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("Raut");
        Thread.sleep(4000);
        //Filling out email 
        driver.findElement(By.id("usernamereg-userId")).sendKeys("fakemail0169");
        Thread.sleep(4000);
        //Filling out password
        driver.findElement(By.id("usernamereg-password")).sendKeys("fakemaiL@01");
        Thread.sleep(4000);
        //Choosing month
        driver.findElement(By.id("usernamereg-month")).sendKeys("Dec");
        Thread.sleep(4000);
        //Choosing day
        driver.findElement(By.id("usernamereg-day")).sendKeys("10");
        Thread.sleep(4000);
        //Choosing year
        driver.findElement(By.id("usernamereg-year")).sendKeys("1999");
        Thread.sleep(4000);
        //Clicking Next button
        driver.findElement(By.xpath("//button[contains(text(), 'Next')]")).click();
        //Adding a delay to wait for the next page to load
        Thread.sleep(5000);

        // You can continue automating further steps if needed
        // For demonstration, we will stop here and print the title of the page
        //Checking whether the test case was successful or not by comparing with title of the page
        String at = driver.getTitle();
        String et = "Yahoo";
        driver.close();
        
        if(at.equalsIgnoreCase(et)) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
    }
}
