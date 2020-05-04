package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        Thread.sleep(10000);

        Ocular.config()
                .resultPath(Paths.get("c:\\Selenium-drivers\\results"))
                .snapshotPath(Paths.get("c:\\Selenium-drivers\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);
        page.open();
        page.close();
        page.compare();

    }

}
