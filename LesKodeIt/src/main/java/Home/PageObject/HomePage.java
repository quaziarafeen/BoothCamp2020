package Home.PageObject;

import Home.WebElementPage.WebElementPage;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends WebElementPage {

    @FindBy(xpath = webElemetRadioButton)
    public static WebElement radioButton;

    public static WebElement getRadioButton() {
        return radioButton;
    }

    public static void clickRadioButton() {
        getRadioButton().click();
    }

    @FindBy(xpath = webElemetSelectButton)
    public static WebElement selectButton;

    public static WebElement getSelectButtonButton() {
        return selectButton;
    }

    public static void clickSelectButton() {
        getRadioButton().click();
    }

    @FindBy(xpath = webElemetSelectCheckBox)
    public static WebElement selectCheckButton;

    public static WebElement selectCheck() {
        return selectCheckButton;
    }

    public static void checkButton() {
        selectCheck().click();
    }
    public static void screenShot() throws IOException, InterruptedException {
        searchBox.getScreenshotAs(OutputType.FILE);
    }

    @FindBy(xpath = webElemetOpenNewTab)
    public static WebElement openTab;

    public static WebElement newTab() {
        return openTab;
    }

    public static void newTabOpen() {
        newTab().click();
    }

    @FindBy(xpath = webElemetOpenNewTab1)
    public static WebElement openTab1;

    public static WebElement newTab1() {
        return openTab1;
    }

    public static void newTabOpen1() {
        newTab1().click();
    }

    @FindBy(xpath = webElemetAlertHandle)
    public static WebElement alertHandle;

    public static WebElement alertHandleButton() {
        return alertHandle;
    }

    public static void alertNewHandle() {
        alertHandleButton().click();
    }

    @FindBy(xpath = webElemetSearchBox)
    public static WebElement searchBox;

    public static WebElement searchBoxSend() {
        return searchBox;
    }

    public static void searchBoxSendValue(List<String> list) {
        for (String ele: list) {
            searchBox.sendKeys(ele);
        }

    }

    public static List<String> namelist() {
        List<String> list = new ArrayList<>();
        list.add("Quazi");
        list.add("Shuvro");
        list.add("Zahid");
        return list;
    }
//    @FindBy(xpath = "//div[@id='navbar']")
//    public static WebElement iFrame;

    @FindBy(xpath = webElemetIframeSearchBar)
    WebElement iFrameSearchBar;

    @FindBy(xpath = webElemetIframeName)
    public static WebElement iFrameName;
    public void useSearchbar(String info)  {
        iFrameSearchBar.sendKeys( info, Keys.ENTER);
    }
    public void clearSearchbar()  {
        iFrameSearchBar.clear();
    }


    public static void writeInXl() throws IOException {
    DataReader.writeBack("C:\\Users\\Quazi\\IdeaProjects\\All project\\Team5_WebAutomationFramework_Weekdays_Selinium_December2019\\Generic\\src\\main\\java\\fileReader\\FileReader3.xls","Java");
}
}