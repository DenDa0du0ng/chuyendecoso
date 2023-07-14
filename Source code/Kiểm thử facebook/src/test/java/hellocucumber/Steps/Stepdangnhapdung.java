package hellocucumber.Steps;

import hellocucumber.pages.DANGNHAPpage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class Stepdangnhapdung {
    WebDriver driver;
    DANGNHAPpage dangnhapPage;

    @Given("mo trang fbook")
    public void moTrangFbook() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);

        dangnhapPage = new DANGNHAPpage(driver);
        this.driver.get("https://www.facebook.com/");
    }

    @When("dien thong tin voi {string} va {string}")
    public void dienThongTinVoiVa(String arg0, String arg1) {
        dangnhapPage.txtemail.sendKeys(arg0);
        dangnhapPage.txtpass.sendKeys(arg1);
    }

    @And("dangnhap")
    public void dangnhap() {
        dangnhapPage.btnRegister.click();
    }

    @And("kiem tra")
    public void kiemTra() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        dangnhapPage.avatar.click();
        Assert.assertTrue(dangnhapPage.btnlogout.isDisplayed());
    }
}
