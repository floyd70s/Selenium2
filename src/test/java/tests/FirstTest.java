package tests;

import browsers.Browsers;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.GoogleLandingPage;

public class FirstTest {

    @BeforeTest
    public void beforeExecuteTestÇ(){
        Browsers.localChrome();
    }

    @Test
    public void firstTest(){
        GoogleLandingPage p = new GoogleLandingPage();
        p.writeInGoogleBar();
    }
    @AfterTest
    public void closeDriver()
    {
        Browsers.getDriver().close();
        Browsers.getDriver().quit();
    }

}
