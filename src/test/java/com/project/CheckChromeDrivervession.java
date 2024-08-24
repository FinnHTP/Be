package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CheckChromeDrivervession {
    public static void main(String[] args) {
        // Khởi tạo ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Lấy thông tin về phiên bản của ChromeDriver
        String chromeDriverVersion = ((org.openqa.selenium.remote.RemoteWebDriver) driver).getCapabilities().getBrowserVersion();

        // In phiên bản của ChromeDriver ra console
        System.out.println("ChromeDriver Version: " + chromeDriverVersion);

        // Đóng driver
        driver.quit();
    }
}