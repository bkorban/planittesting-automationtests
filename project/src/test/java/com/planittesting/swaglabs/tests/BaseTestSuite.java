package com.planittesting.swaglabs.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTestSuite {
  protected WebDriver driver;

  @BeforeEach
  public void setupTest() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.manage().window().maximize();
    driver.navigate().to("https://www.saucedemo.com/");
  }

  @AfterEach
  public void teardownTest() {
    driver.quit();
    // driver.close();
  }
}
