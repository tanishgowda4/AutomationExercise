package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Signup / Login")).click();

        driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("test123");

        driver.findElement(By.xpath("//button[text()='Login']")).click();

        try { Thread.sleep(5000); } catch(Exception e) {}

        driver.quit();
    }
}
