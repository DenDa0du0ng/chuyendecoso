package webtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webdangnhappage {
    @FindBy(xpath = "//span[normalize-space()='Visit Site']")
    public WebElement visitsite;
    @FindBy(xpath = "//button[normalize-space()='Sign off']")
    public WebElement signoff;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement pass;
    @FindBy(xpath = "//input[@name='login']")
    public WebElement login;
    @FindBy(xpath = "//div[@id='error-message']")
    public WebElement loi;
    public webdangnhappage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
