package SwaglabPackege.stepdef;

import SwaglabPackege.SwaglabClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class swagstepdefs {
    SwaglabClass swaglabClass=new SwaglabClass();
    @Given("Username and Password")
    public void usernameAndPassword()  {
        swaglabClass.openUrl();
        swaglabClass.loginpage();
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
}
