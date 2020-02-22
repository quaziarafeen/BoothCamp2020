package homepage;

import org.openqa.selenium.chrome.ChromeDriver;
import webelements.WebElement;

public class Homepage extends WebElement {
    public static void setBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Quazi\\IdeaProjects\\Shuvro\\BootCampSelenium\\Generic\\BrowserDriver\\Windows\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }
}

