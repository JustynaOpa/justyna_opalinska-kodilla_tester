package com.kodilla.selenium.allegro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        while (!driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
        }

        WebElement img = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button"));
        img.click();

        WebElement comboAlle = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/div[2]/div/select"));
        Select eleSelect = new Select(comboAlle);
        eleSelect.selectByIndex(3);

        WebElement inputF = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/input"));
        inputF.sendKeys("Mavic mini");
        inputF.sendKeys(Keys.DOWN, Keys.RETURN);


    }
}
