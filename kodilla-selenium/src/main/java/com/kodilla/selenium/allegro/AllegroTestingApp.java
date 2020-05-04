package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement img = driver.findElement(By.xpath("//*[@aria-labelledby=\"dialog-title\"]/button/img"));
        img.click();

        WebElement inputF = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        inputF.sendKeys("Mavic mini");
        inputF.submit();

//        WebElement comboAlle = driver.findElement(By.xpath("//*[@class=\"_d25gb_3KhYP _1sy4e _1mfty _1fwki _18vat\"]/span/div/select"));
//        Select eleSelect = new Select(comboAlle);
//        eleSelect.selectByValue("/kategoria/elektronika");

        WebElement enter = driver.findElement(By.xpath("//*[@class=\"_1t7v4 _475cu _7qi4 _fee54_02svT\"]/div/div/form/button"));
        enter.click();




    }
}
