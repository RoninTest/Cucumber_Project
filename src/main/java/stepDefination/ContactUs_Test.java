package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUs_Page;
import utilities.ConfigReader;
import utilities.Drivers;
import utilities.ReusableMethods;

public class ContactUs_Test extends ContactUs_Page {

    @Given("navigate to WebSite")
    public void navigateToWebSite() {
        Drivers.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("click ContactUs element")
    public void clickContactUsElement() {
        clickContactUsButton();
    }

    @And("choose subject heading")
    public void chooseSubjectHeading() {
    }

    @And("enter your email")
    public void enterYourEmail() {
    }

    @And("type a message")
    public void typeAMessage() {
    }

    @When("click send button")
    public void clickSendButton() {
    }

    @Then("verify your message has been sent")
    public void verifyYourMessageHasBeenSent() {
    }
}
