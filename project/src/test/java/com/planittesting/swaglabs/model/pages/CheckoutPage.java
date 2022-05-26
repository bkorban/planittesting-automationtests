package com.planittesting.swaglabs.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
  public CheckoutPage(WebDriver driver) {
    super(driver);
  }

  public CheckoutPage clickCheckoutButton() {
    driver.findElement(By.id("checkout")).click();
    return this;
  }

  public CheckoutPage enterFirstName(String fname) {
    var forenameForm = driver.findElement(By.id("first-name"));
    forenameForm.sendKeys(fname);
    return this;
  }

  public CheckoutPage enterLastName(String lname) {
    var forenameForm = driver.findElement(By.id("last-name"));
    forenameForm.sendKeys(lname);
    return this;
  }

  public CheckoutPage enterPostalCode(String postcode) {
    var forenameForm = driver.findElement(By.id("postal-code"));
    forenameForm.sendKeys(postcode);
    return this;
  }

  public CheckoutPage fillUpCheckoutForm(String fname, String lname, String postcode) {
    enterFirstName(fname);
    enterLastName(lname);
    enterPostalCode(postcode);
    return this;
  }

  public CheckoutPage clickContinueButton() {
    driver.findElement(By.id("continue")).click();
    return this;
  }

  public CheckoutPage clickFinishButton() {
    driver.findElement(By.id("finish")).click();
    return this;
  }

  public String getThankYouMessage() {
    return driver.findElement(By.className("complete-header")).getText();
  }
}
