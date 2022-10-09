package ru.yandex.praktikum.Samokat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import ru.yandex.praktikum.Samokat.PO.MainPage;





public class TestsAccordion {
    private WebDriver driver;

    @Before

    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test

    public void TestAnswerAboutCost() {

        WebDriver driver = new ChromeDriver();
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        // mainPage.scrollToAccordion();
        objMainPage.clickQuestionsCost();
        objMainPage.getAnswerAboutCost();
    }

    @Test
    public void TestAnswerAboutMany() {
        WebDriver driver = new ChromeDriver();
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        //mainPage.scrollToAccordion();
        objMainPage.clickQuestionsMany();
        objMainPage.getAnswerAboutMany();
    }

    @After
    public void teardown() {

        driver.quit();
    }
}

