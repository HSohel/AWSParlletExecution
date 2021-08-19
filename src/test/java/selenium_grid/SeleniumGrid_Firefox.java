package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGrid_Firefox {
    WebDriver driver;
    URL gridURL;

    @Test
    public void executeINAwsDocker(){

        FirefoxOptions firefoxOptions=new FirefoxOptions();
        try {
            gridURL=new URL("http:18.219.169.58:4444/wd/hub");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        driver=new RemoteWebDriver(gridURL,firefoxOptions);
        driver.get("www.amazon.com");
        System.out.println("Amazon title is :"+driver.getTitle());
        driver.close();

    }

}
