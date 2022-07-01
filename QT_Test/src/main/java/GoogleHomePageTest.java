import org.testng.annotations.Test;

public class GoogleHomePageTest extends BaseTest {

@Test
public void homePageTest()
{
    GoogleHomePage googleHomePage = new GoogleHomePage(getWebDriver());
    ExtentReportClass.testInfo("Starting the url");
    googleHomePage.getUrl();

}

}
