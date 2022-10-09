package ru.yandex.praktikum.Samokat;

import static org.hamcrest.CoreMatchers.containsString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;
import ru.yandex.praktikum.Samokat.PO.MainPage;
import ru.yandex.praktikum.Samokat.PO.FirstPageOfOrders;
import ru.yandex.praktikum.Samokat.PO.SecondPageOfOrders;
import org.hamcrest.MatcherAssert;
import org.junit.Before;



    public class  TestsOrder {

        private WebDriver driver;

        @Before

        public void startUp() {
            WebDriverManager.chromedriver().setup();
        }

        @Test
        //сначала на первую кнопку
        public void TestOderUpPositive() {

            WebDriver driver = new ChromeDriver();
            // переход на страницу тестового приложения
            driver.get("https://qa-scooter.praktikum-services.ru");

            MainPage objMainPage = new MainPage(driver);
            objMainPage.clickForOrderUp();

            FirstPageOfOrders objFirstPageOfOrders = new FirstPageOfOrders(driver);

            objFirstPageOfOrders.setNameInput("Котик");
            objFirstPageOfOrders.setLastNameInput("Кокосик");
            objFirstPageOfOrders.setAdressInput("Домик на опушке");
            objFirstPageOfOrders.setMetroInput("Лубянка");
            objFirstPageOfOrders.clickMetroSudgestLubyanka();
            objFirstPageOfOrders.setPhoneInput("79811111111");
            objFirstPageOfOrders.clickForContinueButton();

            SecondPageOfOrders objSecondPageOfOrders = new SecondPageOfOrders(driver);

            objSecondPageOfOrders.setDateInput("22.10.2021");
            objSecondPageOfOrders.clickGreyCheckBox();
            objSecondPageOfOrders.clickTimeInput();
            objSecondPageOfOrders.clickDropDown1days();
            objSecondPageOfOrders.clickOrderButtonByOrder();
            objSecondPageOfOrders.clickButtonYesByOrder();
            objSecondPageOfOrders.getTextAboutOrder();

            MatcherAssert.assertThat(objSecondPageOfOrders.getTextAboutOrder(), containsString("Заказ оформлен"));


        }

        //теперь на вторую кнопку
        @Test
        public void TestOderDownPositive() {

            WebDriver driver = new ChromeDriver();
            // переход на страницу тестового приложения
            driver.get("https://qa-scooter.praktikum-services.ru");

            MainPage objMainPage = new MainPage(driver);
            objMainPage.clickForOrderDown();

            FirstPageOfOrders objFirstPageOfOrders = new FirstPageOfOrders(driver);

            objFirstPageOfOrders.setNameInput("Иван");
            objFirstPageOfOrders.setLastNameInput("Неиван");
            objFirstPageOfOrders.setAdressInput("мой адрес не дом и не улица");
            objFirstPageOfOrders.setMetroInput("Аэропорт");
            objFirstPageOfOrders.clickMetroSudgestAeroport();
            objFirstPageOfOrders.setPhoneInput("89818111111");
            objFirstPageOfOrders.clickForContinueButton();

            SecondPageOfOrders objSecondPageOfOrders = new SecondPageOfOrders(driver);

            objSecondPageOfOrders.setDateInput("15.12.2021");
            objSecondPageOfOrders.clickBlackCheckBox();
            objSecondPageOfOrders.clickTimeInput();
            objSecondPageOfOrders.clickDropDown3days();
            objSecondPageOfOrders.clickOrderButtonByOrder();
            objSecondPageOfOrders.clickButtonYesByOrder();
            objSecondPageOfOrders.getTextAboutOrder();

            MatcherAssert.assertThat(objSecondPageOfOrders.getTextAboutOrder(), containsString("Заказ оформлен"));

            }
        @After
        public void teardown () {

            driver.quit();
        }
    }


