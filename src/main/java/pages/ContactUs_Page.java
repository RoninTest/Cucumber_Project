package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;
import utilities.ReusableMethods;

public class ContactUs_Page extends ReusableMethods {
    public ContactUs_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }
    @FindBy (id = "contact-link")
    public WebElement contactlink;

    public void clickContactUsButton(){
        click(contactlink);
    }

    @FindBy (xpath = "//select[@id='id_contact']")
    public WebElement idcontact;


    @FindBy (id = "email")
    public  WebElement email;

    @FindBy (id="message")
    public WebElement message;

    @FindBy (id = "submitMessage")
    public WebElement submitMessage;

    @FindBy (xpath = "alert alert-success")
    public WebElement alertsuccess;


}
