package Test;

import databases.ConnectToSqlDB;
import homepage.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.DataReader;
import webelements.WebElement;

import java.io.IOException;

public class TestPage extends Homepage {


   @Test
    public static void searchFromDatabase() throws Exception {
        setBrowser();
        //System.out.println(ConnectToSqlDB.readDataBase("shuvro","search").get(0));
        for (int i = 0; i< ConnectToSqlDB.readDataBase("quazi","search").size(); i++) {
            driver.findElement(By.xpath(searchBox)).sendKeys(ConnectToSqlDB.readDataBase("quazi","search").get(i), Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }


    }

@Test
    public static void searchFromTable() throws IOException, InterruptedException {
//public static void main(String[] args) throws IOException {


        setBrowser();
        //System.out.println(ConnectToSqlDB.readDataBase("shuvro","search").get(0));
        String[] [] file = DataReader.fileReader1("C:\\Users\\Quazi\\IdeaProjects\\All project\\Team5_WebAutomationFramework_Weekdays_Selinium_December2019\\Generic\\src\\main\\java\\fileReader\\FileReader.xls",0) ;
        for (int i = 0; i< file.length; i++) {
            System.out.println(file[i] [0] +" ");
            driver.findElement(By.xpath(searchBox)).sendKeys(file[i] [0], Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);

        }


    }

}
