package testhomepage;

import Home.PageObject.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomepage extends HomePage {
    static HomePage hp;

    public static void getInElement() {
        hp=PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public static void clickOnRadioButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);

    }

     @Test(priority = 2)
    public static void clickOnSelectButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        selectFromDropByValue(webElemetSelectButton, "benz");
        sleepFor(3);

    }

    @Test(priority = 3)
    public static void clickOnSelectMultiButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "apple", "orange");
        sleepFor(3);

    }

    @Test(priority = 4)
    public static void clickOnCheckButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        checkButton();
        sleepFor(3);

    }
    @Test(priority = 5)
    public static void takeScreenShotTaken() throws InterruptedException, IOException {
        getInElement();
        sleepFor(2);
        screenShot();
        sleepFor(3);

    }

    @Test(priority = 6)
    public static void newWindowOpen() throws InterruptedException {
        getInElement();
        sleepFor(2);
        newTabOpen();
        handleNewTab(driver).close();
        sleepFor(3);
    }

    @Test(priority = 7)
    public static void newWindowOpen1() throws InterruptedException {
        getInElement();
        sleepFor(2);
        newTabOpen1();
        handleNewTab(driver).close();
        sleepFor(3);

    }
    @Test(priority = 8)
    public static void alertHandleAccept() throws InterruptedException {
        getInElement();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        okAlert();

    }

    @Test(priority = 9)
    public static void alertHandleCancle() throws InterruptedException {
        getInElement();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        cancelAlert();
    }
    @Test(priority = 10)
    public static void getTable() throws InterruptedException {
        getInElement();
        sleepFor(2);
        scrollUpDown(2500);
        getListOfWebElementsByXpath(webElemetTable);
        sleepFor(2);

    }
    @Test(priority = 11)
    public static void mouseHover() throws InterruptedException {
        getInElement();
        sleepFor(2);
        mouseHoverByXpath(webElemetMouseHover);
        sleepFor(2);

    }
   @Test(priority = 12)
    public void testiFrame() throws IOException, InterruptedException {
        getInElement();
        scrollUpDown(4000);
        iframeHandle(hp.iFrameName);
        sleepFor(2);
        hp.useSearchbar("pHYTHON");
        sleepFor(2);
        hp.clearSearchbar();
    }

}
