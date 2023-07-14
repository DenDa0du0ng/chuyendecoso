package hellocucumber.Steps;

import hellocucumber.pages.DANGKYpage;
import hellocucumber.pages.DANGNHAPpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class Stepdangkysai {
    WebDriver driver;
    DANGKYpage dangkyPage;
    @Given("mo trang dang ky facebook")
    public void moTrangDangKyFacebook() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);

        this.driver.get("https://www.facebook.com/");
        dangkyPage = new DANGKYpage(driver);
    }
    @When("dienthong tin voi {string} va {string} va {string}")
    public void dienthongTinVoiVaVa(String arg0, String arg1, String arg3) {
        dangkyPage.creat.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dangkyPage.Firstname.sendKeys("Tien");
        dangkyPage.Surname.sendKeys("Dat");
        dangkyPage.email1.sendKeys(arg0);
        dangkyPage.password.sendKeys(arg1);
        if(dangkyPage.email2.isDisplayed()==true){
            dangkyPage.email2.sendKeys(arg3);
        }
        Select sl1 = new Select(dangkyPage.day);
        sl1.selectByValue("25");
        Select sl2 = new Select(dangkyPage.month);
        sl2.selectByValue("3");
        Select sl3 = new Select(dangkyPage.year);
        sl3.selectByValue("2002");
        dangkyPage.male.click();
    }
    @And("dang ky")
    public void dangKy() {
        dangkyPage.signup.click();
    }

    @And("kiemtra voi {string}")
    public void kiemtraVoi(String arg2) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertEquals(dangkyPage.Loi.getText(),arg2);
    }

}
