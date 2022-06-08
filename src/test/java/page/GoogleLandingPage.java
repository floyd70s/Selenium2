package page;

import browsers.Browsers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Generic;

public class GoogleLandingPage {
    @FindBy(name = "q")
    WebElement googleBar;

    public GoogleLandingPage() {
        PageFactory.initElements(Browsers.getDriver(), this);
    }

    public void writeInGoogleBar() {
        Generic g = new Generic();
        boolean bResult = g.waitForElementVisible(googleBar);
        if (bResult) {
            googleBar.sendKeys("Hello World");
            g.staticWait(300);
        }
    }
}
