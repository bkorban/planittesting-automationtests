package com.planittesting.swaglabs.tests;

import com.planittesting.swaglabs.model.pages.InventoryPage;
import com.planittesting.swaglabs.model.pages.LoginPage;
import com.planittesting.swaglabs.model.pages.CheckoutPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTests extends BaseTestSuite {

  @Test
  public void verifySuccessfulOrder() {
    new LoginPage(driver)
        .loginAs("standard_user", "secret_sauce")
        .clickLoginButton();
    new InventoryPage(driver)
        .addItemToShoppingCart()
        .clickShoppingCartIcon();

    var checkoutPage = new CheckoutPage(driver)
        .clickCheckoutButton()
        .fillUpCheckoutForm("James", "Smith", "2016")
        .clickContinueButton()
        .clickFinishButton();

    assertEquals("THANK YOU FOR YOUR ORDER", checkoutPage.getThankYouMessage());
  }
}
