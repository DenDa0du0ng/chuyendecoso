package hellocucumber.Steps;

import hellocucumber.pages.DANGNHAPpage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    WebDriver driver;
    DANGNHAPpage dangnhapPage;

    @Given("mo trang facebook")
    public void moTrangFacebook() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);

        dangnhapPage = new DANGNHAPpage(driver);
        this.driver.get("https://www.facebook.com/");
    }


    @When("dien thong tin dang nhap voi {string} va {string}")
    public void dienThongTinDangNhapVoiVa(String arg0, String arg1) {
        dangnhapPage.txtemail.sendKeys(arg0);
        dangnhapPage.txtpass.sendKeys(arg1);
    }

    @And("dang nhap")
    public void dangNhap() {
        dangnhapPage.btnRegister.click();
        dangnhapPage.btnLogin.click();
    }

    @And("kiem tra {string}")
    public void kiemTra(String arg2) {
        if(dangnhapPage.btnLogin.isDisplayed()==true) {
            Assert.assertEquals(dangnhapPage.loifb.getText(), arg2);
        }
    }


}
