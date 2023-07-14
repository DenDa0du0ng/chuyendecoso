import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import webtest.pages.webdangkypage;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver driver;
    webdangkypage webdangkypage;
    @Given("mo trang")
    public void moTrang() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);
        webdangkypage = new webdangkypage(driver);
        this.driver.get("https://1bdd-117-4-244-93.ngrok-free.app/PHP/web-login/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webdangkypage.visitsite.click();
    }
}
