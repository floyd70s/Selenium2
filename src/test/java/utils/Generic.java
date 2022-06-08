package utils;
import browsers.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Generic {
    private final int explicitWait=10;
    public void staticWait(long millis){
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
            System.out.println("time to wait:" +millis);
        }
        catch (Exception e){
            e.getMessage();
        }
    }
    public boolean waitForElementInvisible(WebElement ele){
        boolean bElement = new WebDriverWait(Browsers.getDriver(), Duration.ofSeconds(explicitWait).getSeconds())
                .until(ExpectedConditions.invisibilityOf(ele));
        if(bElement){
           System.out.println("element" +ele.toString());
       }else {
           System.out.println("item not detected" +ele.toString());
       }
       return bElement;
    }

    public boolean waitForElementPresent(WebElement ele){
        WebElement wElement = new WebDriverWait(Browsers.getDriver(), Duration.ofSeconds(explicitWait).getSeconds())
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(ele.toString())));
        if(wElement != null){
            System.out.println("element" +ele);
            return  true;
        }else {
            System.out.println("item not detected" +ele);
            return false;
        }
    }

    public boolean waitForElementVisible(WebElement element){
        WebElement wElement = new WebDriverWait(Browsers.getDriver(), Duration.ofSeconds(explicitWait).getSeconds())
                .until(ExpectedConditions.visibilityOf(element));
        if(wElement != null){
            System.out.println("element" +element.toString());
            return  true;
        }else {
            System.out.println("item not detected" +element.toString());
            return false;
        }
    }
}
