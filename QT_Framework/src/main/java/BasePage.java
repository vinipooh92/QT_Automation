import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait webDriverWait;
    //private static final Duration TIMEOUT =5;
    //private static  final Duration POLLING = 500;
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5),Duration.ofSeconds(500));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,5),this);

    }

    protected void waitForElementToAppear(By locator)
    {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator)
    {
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void maximizeWindow()
    {
        driver.manage().window().maximize();
    }

    protected void minimizeWindow()
    {
        driver.manage().window().minimize();
    }

}
