// filepath: /workspaces/automation-testing/automation-testing/src/main/java/com/seleniumtesting/Main.java
package com.seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}