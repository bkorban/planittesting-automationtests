package com.planittesting.swaglabs.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

  public InventoryPage(WebDriver driver) {
    super(driver);
  }

  public InventoryPage addItemToShoppingCart() {
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    return this;
  }

  public InventoryPage clickShoppingCartIcon() {
    driver.findElement(By.className("shopping_cart_link")).click();
    return this;
  }

  public String getItemQuantity() {
    var itemQuantity = driver.findElement(By.className("cart_quantity"));
    return itemQuantity.getText();
  }

  public String getItemName() {
    var itemName = driver.findElement(By.className("inventory_item_name"));
    return itemName.getText();
  }

  public String getItemPrice() {
    var itemPrice = driver.findElement(By.className("inventory_item_price"));
    return itemPrice.getText();
  }

  public String getItemDescription() {
    var itemDescription = driver.findElement(By.className("inventory_item_desc")).getText();
    return itemDescription;
  }

}
