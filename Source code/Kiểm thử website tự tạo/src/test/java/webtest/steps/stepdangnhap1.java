package webtest.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import webtest.pages.webdangnhappage;

import java.util.concurrent.TimeUnit;

public class stepdangnhap1 {
    WebDriver driver;
    webdangnhappage webdangnhappage;
    @Given("motrangweb")
    public void motrangweb() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);
        webdangnhappage = new webdangnhappage(driver);
        this.driver.get("https://69f2-117-4-244-93.ngrok-free.app/PHP/web-login/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webdangnhappage.visitsite.click();
        webdangnhappage.signoff.click();
    }

    @When("dienthongtin voi {string} va {string}")
    public void dienthongtinVoiVa(String arg0, String arg1) {
        webdangnhappage.email.sendKeys(arg0);
        webdangnhappage.pass.sendKeys(arg1);
        webdangnhappage.login.click();
    }

    @Then("Kiem tra")
    public void kiemTra() {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Assert.assertTrue(webdangnhappage.signoff.isDisplayed());
    }
}
