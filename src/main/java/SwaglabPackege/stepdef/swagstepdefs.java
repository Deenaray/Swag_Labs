package SwaglabPackege.stepdef;

import SwaglabPackege.SwaglabClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

import static SwaglabPackege.SwaglabClass.driver;

public class swagstepdefs {
    SwaglabClass swaglabClass=new SwaglabClass();
    @Given("Username {string} and Password {string}")
    public void usernameAndPassword(String un, String pwd) {


        swaglabClass.openUrl();
        swaglabClass.loginpage(un,pwd);
    }

    @Then("login to the website")
    public void loginToTheWebsite() {
        swaglabClass.clickLogin();
    }

    @Given("Add product to the cart")
    public void addProductToTheCart() throws InterruptedException {
        swaglabClass.addToCart();
        
    }

    @Then("Checkout the product")
    public void checkoutTheProduct() {
        swaglabClass.checkOut();
    }

    @Given("Enter address information")
    public void enterAddressInformation() {
        swaglabClass.AddressInfo();

    }

    @Then("Click Finish")
    public void clickFinish() {
        swaglabClass.finishbutton();
    }

    @Given("goto react button")
    public void gotoReactButton() throws InterruptedException {
        swaglabClass.logOut();
    }

    @Then("click logout")
    public void clickLogout() {
        swaglabClass.clickLogout();
    }

@After
    public void screenShot(Scenario screen)
{
    if (screen.isFailed()){
        byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Failed testcase",new ByteArrayInputStream(screenshot));
    }
}

}
