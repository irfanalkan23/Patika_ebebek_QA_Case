package com.ebebek.pages;

import com.ebebek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2/span[text()=\"Mama Kaşığı 2’li Aqua Green- Mellow Yellow\"]")
    public WebElement searchResultLastItem;

    @FindBy(xpath = "//div/h1/b[@id=\"txtProductTitle\"]")
    public WebElement productPage_ProductName;

    @FindBy(id="addToCartBtn")
    public WebElement addToCartButton;

    @FindBy(xpath = "//p[text()=' Ürün Sepetinizde ']")
    public WebElement productAddedToCartMessage;

    @FindBy(id="btnShowCart")
    public WebElement showCartButton;

}
