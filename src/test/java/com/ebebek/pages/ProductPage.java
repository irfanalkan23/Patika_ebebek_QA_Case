package com.ebebek.pages;

import com.ebebek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class=\"description plist-desc\"]")
    public List<WebElement> listOfAddToCartItems_ProductName;

    @FindBy(xpath = "//button[.=\"Sepete Ekle\"]")
    public List<WebElement> listOfAddToCartItems_AddToCartButton;

    @FindBy(xpath = "//div/h1/b[@id=\"txtProductTitle\"]")
    public WebElement productPage_ProductName;

    @FindBy(id="addToCartBtn")
    public WebElement addToCartButton;

    @FindBy(id="btnShowCart")
    public WebElement showCartButton;

}
