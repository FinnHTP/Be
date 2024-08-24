package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class testAutomationtest {
    WebDriver webDriver;
    WebDriverWait wait;
    JavascriptExecutor js;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://websitegamemanagement.vercel.app/login");
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) webDriver;
    }

    @Test
    public void testAutomation() {
        try {
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            usernameField.sendKeys("phat");
            System.out.println("Username field is visible.");



            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            passwordField.sendKeys("1234");
            System.out.println("Password field is visible.");
            waitFor(1000);


            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.text-yellow-500")));
            loginButton.click();
            System.out.println("Login button clicked.");
            waitFor(1000);



            wait.until(ExpectedConditions.urlContains("/profile"));
            System.out.println("Successfully navigated to profile page.");
            waitFor(3000);

            long windowHeight = (long) js.executeScript("return window.innerHeight");
            for (int i = 0; i < 3; i++) {
                js.executeScript("window.scrollBy(0, arguments[0]);", windowHeight/3);
                Thread.sleep(300);
            }
            for (int i = 0; i < 3; i++) {
                js.executeScript("window.scrollBy(0, -arguments[0]);", windowHeight/3);
                Thread.sleep(300);
            }


            WebElement storeLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.store")));
            storeLink.click();
            System.out.println("Đã điều hướng đến trang store.");
            wait.until(ExpectedConditions.urlContains("/store"));
            System.out.println("Successfully navigated to store page.");
            waitFor(5000);

            for (int i = 0; i < 12; i++) {
                js.executeScript("window.scrollBy(0, arguments[0]);", windowHeight/3);
                Thread.sleep(300);
            }
            for (int i = 0; i < 12; i++) {
                js.executeScript("window.scrollBy(0, -arguments[0]);", windowHeight/3);
                Thread.sleep(300);
            }


            WebElement detailLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img.image-game")));
            detailLink.click();
            System.out.println("Đã điều hướng đến trang Detail");
            wait.until(ExpectedConditions.urlContains("/detail/1"));
            System.out.println("Successfully navigated to detail = page.");
            waitFor(3000);
            for (int i = 0; i < 3; i++) {
                js.executeScript("window.scrollBy(0, arguments[0]);", windowHeight/3);
                Thread.sleep(300);
            }
            for (int i = 0; i < 3; i++) {
                js.executeScript("window.scrollBy(0, -arguments[0]);", windowHeight/3);
                Thread.sleep(300);
            }


            WebElement buygame = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.buttonbuygame")));
            buygame.click();
            System.out.println("Đã điều hướng đến trang buygame");
            wait.until(ExpectedConditions.urlContains("/confirm-purchase/1"));
            System.out.println("Successfully navigated to buygame");
            waitFor(5000);




        } catch (Exception e) {
            System.out.println("Lỗi khi thực hiện thao tác: " + e.getMessage());
            try {
                WebElement loginButton = webDriver.findElement(By.cssSelector("button.text-yellow-500"));
                JavascriptExecutor js = (JavascriptExecutor) webDriver;
                js.executeScript("arguments[0].click();", loginButton);
                System.out.println("Login button clicked using JavaScript.");
                waitFor(1000);


                wait.until(ExpectedConditions.urlContains("/profile"));
                System.out.println("Successfully navigated to profile page using JavaScript.");
                waitFor(3000);


                WebElement storeLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.store")));
                JavascriptExecutor Storejs = (JavascriptExecutor) webDriver;
                Storejs.executeScript("arguments[0].click();", storeLink);
                System.out.println("Login button clicked using JavaScript.");
                wait.until(ExpectedConditions.urlContains("/store"));
                System.out.println("Successfully navigated to store page using JavaScript.");
                waitFor(10000);



                WebElement detailLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img.image-game")));
                JavascriptExecutor detailjs = (JavascriptExecutor) webDriver;
                detailjs.executeScript("arguments[0].click();", detailLink);
                System.out.println("Login button clicked using JavaScript.");
                wait.until(ExpectedConditions.urlContains("/detail/1"));
                System.out.println("Successfully navigated to store page using JavaScript.");
                waitFor(3000);


                WebElement buygamelink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.buttonbuygame")));
                JavascriptExecutor buygamejs = (JavascriptExecutor) webDriver;
                buygamejs.executeScript("arguments[0].click();", buygamelink);
                System.out.println("Login button clicked using JavaScript.");
                wait.until(ExpectedConditions.urlContains("/confirm-purchase/1"));
                System.out.println("Successfully navigated to store page using JavaScript.");
                waitFor(3000);

            } catch (Exception jsException) {
                System.out.println("Lỗi khi thực hiện thao tác bằng JavaScript: " + jsException.getMessage());
            }
        }
    }

    // Hàm đợi thay thế Thread.sleep
    private void waitFor(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

    @AfterTest
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
