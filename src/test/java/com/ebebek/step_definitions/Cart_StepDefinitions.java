package com.ebebek.step_definitions;

import com.ebebek.pages.BasePage;
import com.ebebek.pages.CartPage;
import com.ebebek.pages.ProductPage;
import com.ebebek.utilities.BrowserUtils;
import com.ebebek.utilities.ConfigurationReader;
import com.ebebek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Cart_StepDefinitions {
    BasePage basePage = new BasePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("user is at the ebebek home page")
    public void user_is_at_the_ebebek_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user types {string} in the search box and clicks Enter")
    public void user_types_in_the_search_box_and_clicks_enter(String string) {
        basePage.searchBox.sendKeys(string,Keys.ENTER);
        BrowserUtils.waitFor(5);
    }

    @And("user clicks the last product and sees the selected product in the product page")
    public void userClicksTheLastProductAndSeesTheSelectedProductInTheProductPage() {
        BrowserUtils.scrollPageBottom();
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollPageBottom();
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollPageBottom();
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollPageBottom();

        int indexOfLastAvailableItem = productPage.listOfAddToCartItems_AddToCartButton.size();
        WebElement lastItem = productPage.listOfAddToCartItems_ProductName.get(indexOfLastAvailableItem-1);     //index of item = size()-1

        String expectedName = lastItem.getText();
        BrowserUtils.verifyElementDisplayed(lastItem);

        BrowserUtils.clickWithJS(lastItem);

        String actualName = productPage.productPage_ProductName.getText();
        Assert.assertEquals(expectedName, actualName);
    }

    @When("user clicks Sepete Ekle button")
    public void user_clicks_sepete_ekle_button() {
        productPage.addToCartButton.click();
    }

    @Then("user clicks Sepeti Gör button")
    public void user_clicks_sepeti_gör_button() {
        productPage.showCartButton.click();
    }

    @And("user clicks Alışverişi Tamamla button")
    public void userClicksAlışverişiTamamlaButton() {
        BrowserUtils.waitForClickablility(cartPage.checkoutButton,3);
        BrowserUtils.clickWithJS(cartPage.checkoutButton);
    }

    @Then("user is directed to User Login page")
    public void userIsDirectedToUserLoginPage() {
        BrowserUtils.waitFor(3);
        BrowserUtils.verifyTitle("Giriş Yap");
    }

}
