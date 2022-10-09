package ru.yandex.praktikum.Samokat.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Разобраться со скроллосм, нужен ли он вообще(сейчас его нет)


public class MainPage {


    //элементы
    private WebDriver driver;
    private By buttonOrderUp = By.xpath("(//*[@class='Button_Button__ra12g' and text()='Заказать'])");
    private By buttonOrderDown = By.className("Button_Middle__1CSJM");
    private By accordionButtonCost = By.id("accordion__heading-0");
    private By accordionButtonMany = By.id("accordion__heading-1");
    private By accordionPanelCost = By.id("accordion__panel-0");
    private By accordionPanelMany = By.id("accordion__panel-1");


    public MainPage(WebDriver driver) {
        this.driver = driver;
        //public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    }

    //методы

    //клик по верхней кнопке заказать
    public void clickForOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }

    //скролл к нижней кнопке Заказать
    //WebElement element = driver.findElement(buttonOrderDown);
    //((JavascriptExecutor)driver).executeScript ("arguments[0].scrollIntoView();",element);

    //метод для клика по Заказать нижней
    public void clickForOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    //скролл до блока аккордеона

    //клик по вопросу про стоимость
    public void clickQuestionsCost() {
        driver.findElement(accordionButtonCost).click();
    }

    //клик по вопросу про несколько самокатов
    public void clickQuestionsMany() {
        driver.findElement(accordionButtonMany).click();
    }

    //получение текста из первого ответа
    public void getAnswerAboutCost() {
        driver.findElement(accordionPanelCost).getText();
    }

    //получение текста из второго ответа
    public void getAnswerAboutMany() {
        driver.findElement(accordionPanelMany).getText();
    }
}

