package webtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webdangkypage {
    @FindBy(xpath = "//span[normalize-space()='Visit Site']")
    public WebElement visitsite;
    @FindBy(xpath = "//a[normalize-space()='Sign up']")
    public  WebElement signup;
    @FindBy(xpath = "//button[normalize-space()='Sign off']")
    public WebElement signoff;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='re_email']")
    public WebElement reemail;
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement pass;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement day;
    @FindBy(xpath = "//select[@id='month']")
    public WebElement month;
    @FindBy(xpath = "//select[@id='year']")
    public WebElement year;
    @FindBy(xpath = "//input[@id='male']")
    public WebElement male;
    @FindBy(xpath = "//input[@id='female']")
    public WebElement female;
    @FindBy(xpath = "//input[@id='custom']")
    public WebElement custom;
    @FindBy(xpath = "//input[@name='btn']")
    public WebElement btnsignup;
    @FindBy(xpath = "//div[@id='error-message']")
    public WebElement loi;
    public webdangkypage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
