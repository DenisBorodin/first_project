package com.Google;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void start() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
        driver = null;
    }
}


