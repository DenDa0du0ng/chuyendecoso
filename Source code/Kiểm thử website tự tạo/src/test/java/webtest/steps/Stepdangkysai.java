package webtest.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import webtest.pages.webdangkypage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class Stepdangkysai {
    WebDriver driver;
    webdangkypage webdangkypage;
    @Given("mo trang web")
    public void moTrangWeb() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);
        webdangkypage = new webdangkypage(driver);
        this.driver.get("https://69f2-117-4-244-93.ngrok-free.app/PHP/web-login/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webdangkypage.visitsite.click();
    }

    @When("dang ky")
    public void dangKy() {
        webdangkypage.signoff.click();
        webdangkypage.signup.click();
    }

    @And("dien thong tin voi {string} va {string} va {string}")
    public void dienThongTinVoiVaVa(String arg0, String arg1, String arg2) {
        webdangkypage.username.sendKeys("Tien Dat");
        webdangkypage.email.sendKeys(arg0);
        webdangkypage.reemail.sendKeys(arg1);
        webdangkypage.pass.sendKeys(arg2);
        Select sl1 = new Select(webdangkypage.day);
            sl1.selectByValue("25");
        Select sl2 = new Select(webdangkypage.month);
            sl2.selectByValue("3");
        Select sl3 = new Select(webdangkypage.year);
            sl3.selectByValue("2002");
        webdangkypage.male.click();
        webdangkypage.btnsignup.click();
    }

    @Then("kiem tra voi {string}")
    public void kiemTraVoi(String arg3) {
        Assert.assertEquals(webdangkypage.loi.getText(),arg3);
    }
}
