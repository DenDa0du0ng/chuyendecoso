package hellocucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DANGNHAPpage {
    @FindBy(xpath = "//input[@id='email']")
    public WebElement txtemail;
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement txtpass;
    @FindBy(name="login")
    public WebElement btnRegister;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement loifb;
    @FindBy(xpath = "//button[@id='loginbutton']")
    public WebElement btnLogin;
    @FindBy(xpath = "//*[name()='g' and contains(@mask,'url(#:rm:)')]//*[name()='image' and contains(@x,'0')]")
    public WebElement avatar;
    @FindBy(xpath = "//span[normalize-space()='Log Out']")
    public WebElement btnlogout;
    public DANGNHAPpage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
