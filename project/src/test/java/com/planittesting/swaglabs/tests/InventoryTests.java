package com.planittesting.swaglabs.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planittesting.swaglabs.model.pages.InventoryPage;
import com.planittesting.swaglabs.model.pages.LoginPage;

import org.junit.jupiter.api.Test;

public class InventoryTests extends BaseTestSuite {

  @Test
  public void verifyShoppingCartStoresItemInformation() {

    new LoginPage(driver)
        .loginAs("standard_user", "secret_sauce")
        .clickLoginButton();
    var inventoryPage = new InventoryPage(driver)
        .addItemToShoppingCart()
        .clickShoppingCartIcon();

    assertEquals("1", inventoryPage.getItemQuantity());
    assertEquals("Sauce Labs Backpack", inventoryPage.getItemName());
    assertEquals("$29.99", inventoryPage.getItemPrice());
    assertEquals(
        "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
        inventoryPage.getItemDescription());
  }

}
