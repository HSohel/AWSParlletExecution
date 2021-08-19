package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGrid_edge {
    WebDriver driver;
    URL gridURL;

    @Test
    public void executeINAwsDocker(){
        EdgeOptions edgeOptions=new EdgeOptions();
        try {
            gridURL = new URL("http:18.219.169.58:4444/wd/hub");
           }catch(Exception e){
            System.out.println(e.getMessage());
        }

       driver=new RemoteWebDriver(gridURL,edgeOptions);
        driver.get("www.Facebook.com");
        driver.getTitle();
        System.out.println("Facebook title is :"+driver.getTitle());
        driver.close();
    }
}
