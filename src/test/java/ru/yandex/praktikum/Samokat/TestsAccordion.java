package ru.yandex.praktikum.Samokat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import ru.yandex.praktikum.Samokat.PO.MainPage;
import static org.hamcrest.CoreMatchers.containsString;
import org.openqa.selenium.chrome.ChromeOptions;






public class TestsAccordion {
    private WebDriver driver;

    @Before

    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test

    public void TestAnswerAboutCost() {

        //WebDriver driver = new ChromeDriver();
        // переход на страницу тестового приложения
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsCost();
        objMainPage.getAnswerAboutCost();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutCost(), containsString("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    @Test
    public void TestAnswerAboutMany() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsMany();
        objMainPage.getAnswerAboutMany();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutMany(), containsString("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }
    @Test

    public void TestAnswerAboutTime() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsTime();
        objMainPage.getAnswerAboutTime();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutTime(), containsString("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }


    @Test

    public void TestAnswerAboutToday() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsToday();
        objMainPage.getAnswerAboutToday();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutToday(), containsString("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));

    }

    @Test

    public void TestAnswerAboutEarlier() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsEarlier();
        objMainPage.getAnswerAboutEarlier();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutEarlier(), containsString("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));

    }

    @Test

    public void TestAnswerAboutCharger() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsCharger();
        objMainPage.getAnswerAboutCharger();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutCharger(), containsString("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    @Test

    public void TestAnswerAboutCancel() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsCancel();
        objMainPage.getAnswerAboutCancel();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutCancel(), containsString("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    @Test

    public void TestAnswerAboutMKAD() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get("https://qa-scooter.praktikum-services.ru");

        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickForCookies();
        objMainPage.clickQuestionsMKAD();
        objMainPage.getAnswerAboutMKAD();
        MatcherAssert.assertThat(objMainPage.getAnswerAboutMKAD(), containsString("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

    @After
    public void teardown() {

        driver.quit();
    }
}

