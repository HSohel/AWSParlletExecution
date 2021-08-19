package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGrid_chrome2 {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeINAwsDocker(){
        ChromeOptions chromeOptions=new ChromeOptions();
        try{
            gridUrl=new URL("http:18.219.169.58:4444/wd/hub");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        driver= new RemoteWebDriver(gridUrl,chromeOptions);
        driver.get("www.yahoo.com");
        driver.getTitle();
        driver.close();
    }

}
