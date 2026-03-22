package org.example.banco.selenium.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeEach
    public void start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @AfterEach
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}