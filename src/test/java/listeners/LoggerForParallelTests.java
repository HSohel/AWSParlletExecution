package listeners;

import command_provider.ActOn;
import org.apache.logging.log4j.ThreadContext;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.GetData;
import utilities.TestEnvironment;

import java.io.IOException;


public class LoggerForParallelTests {
    public static WebDriver driver;

    @BeforeClass

    public void addThread(){
        ThreadContext.put("threadName", this.getClass().getName());

    }

    @BeforeMethod

    public void BrowserInitialization() throws IOException {
        String URL= GetData.getPropertyValue("url");
        driver= TestEnvironment.selectTestExecutionEnvironment();
        //LOGGER.info("Invoke URL "+URL);
        ActOn.browser(driver).OPenBrowser(URL);
    }

    @AfterMethod
    public void closeBrowser(){
        ActOn.browser(driver).CloseBrowser();
        //LOGGER.info("<------Test Case CalculateApr Ends");
    }



}
