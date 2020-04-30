package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver ebay = new ChromeDriver();
        ebay.get("https://www.ebay.com");

        WebElement findField = ebay.findElement(By.name("_nkw"));
        findField.sendKeys("Laptop");
        findField.submit();
    }
}
