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

    @FindBy(xpath = "/html/body/app-root/cx-storefront/cx-page-slot/eb-breadcrumb/div/div/nav/div/span[2]/span/a/span/a")
    public WebElement searchResultHeader;

    @FindBy(xpath = "//div[@class=\"product-item\"]")
    public List<WebElement> searchResults;

//    @FindBy(xpath = "//p/span")
//    public WebElement productListCount;

//    @FindBy(xpath = "//a/div/h2/span")
//    public List<WebElement> productList;

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
