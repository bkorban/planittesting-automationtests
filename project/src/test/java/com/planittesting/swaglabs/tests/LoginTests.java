package com.planittesting.swaglabs.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planittesting.swaglabs.model.pages.LoginPage;

import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTestSuite {

  @Test
  public void verifyLoginWithValidCredentials() {
    var loginPage = new LoginPage(driver)
        .loginAs("standard_user", "secret_sauce")
        .clickLoginButton();

    String expectedUrl = "https://www.saucedemo.com/inventory.html";
    assertEquals(expectedUrl, loginPage.getActualUrl());
  }

}
