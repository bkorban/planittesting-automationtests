package com.planittesting.swaglabs.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public LoginPage setUsername(String username) {
    driver.findElement(By.id("user-name")).sendKeys(username);
    return this;
  }

  public LoginPage setPassword(String password) {
    driver.findElement(By.id("password")).sendKeys(password);
    return this;
  }
}
