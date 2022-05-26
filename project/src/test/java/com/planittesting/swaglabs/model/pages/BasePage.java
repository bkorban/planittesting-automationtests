package com.planittesting.swaglabs.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
  protected WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public String getActualUrl() {
    return driver.getCurrentUrl();
  }

  public LoginPage loginAs(String username, String password) {
    driver.findElement(By.id("user-name")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    return new LoginPage(driver);
  }

  public LoginPage clickLoginButton() {
    driver.findElement(By.id("login-button")).click();
    return new LoginPage(driver);
  }
}
