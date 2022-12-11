package ru.yandex.praktikum.Samokat.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {


    //элементы
    private final WebDriver driver;
    private final By buttonCookies = By.className("App_CookieButton__3cvqF");
    private final By buttonOrderUp = By.xpath("(//*[@class='Button_Button__ra12g' and text()='Заказать'])");
    private final By buttonOrderDown = By.className("Button_Middle__1CSJM");
    private final By accordionButtonCost = By.id("accordion__heading-0");
    private final By accordionButtonMany = By.id("accordion__heading-1");
    private final By accordionButtonTime = By.id("accordion__heading-2");
    private final By accordionButtonToday = By.id("accordion__heading-3");
    private final By accordionButtonEarlier = By.id("accordion__heading-4");
    private final By accordionButtonCharger = By.id("accordion__heading-5");
    private final By accordionButtonCancel = By.id("accordion__heading-6");
    private final By accordionButtonMKAD = By.id("accordion__heading-7");
    private final By accordionPanelCost = By.id("accordion__panel-0");
    private final By accordionPanelMany = By.id("accordion__panel-1");

    private final By accordionPanelTime = By.id("accordion__panel-2");
    private final By accordionPanelToday = By.id("accordion__panel-3");
    private final By accordionPanelEarlier = By.id("accordion__panel-4");
    private final By accordionPanelCharger = By.id("accordion__panel-5");
    private final By accordionPanelCancel = By.id("accordion__panel-6");
    private final By accordionPanelMKAD = By.id("accordion__panel-7");


    public MainPage(WebDriver driver) {
        this.driver = driver;

    }

    //методы
    //убрать сообщение про куки
    public void clickForCookies() {driver.findElement(buttonCookies).click();}

    //клик по верхней кнопке заказать
    public void clickForOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }


    //метод для клика по Заказать нижней
    public void clickForOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    //клик по вопросу про стоимость
    public void clickQuestionsCost() {
        driver.findElement(accordionButtonCost).click();
    }

    //клик по вопросу про несколько самокатов
    public void clickQuestionsMany() {
        driver.findElement(accordionButtonMany).click();
    }

    public void clickQuestionsTime() {
        driver.findElement(accordionButtonTime).click();
    }

    public void clickQuestionsToday() {
        driver.findElement(accordionButtonToday).click();
    }

    public void clickQuestionsEarlier() {
        driver.findElement(accordionButtonEarlier).click();
    }

    public void clickQuestionsCharger() {
        driver.findElement(accordionButtonCharger).click();
    }

    public void clickQuestionsCancel() {
        driver.findElement(accordionButtonCancel).click();
    }

    public void clickQuestionsMKAD() {
        driver.findElement(accordionButtonMKAD).click();
    }


    //получение текста из первого ответа

    public String getAnswerAboutCost() {
        String answerCost = driver.findElement(accordionPanelCost).getText();
        return answerCost;
    }

    //получение текста из второго ответа
    public String getAnswerAboutMany() {
        String answerMany = driver.findElement(accordionPanelMany).getText();
        return answerMany;
    }

    public String getAnswerAboutTime() {
        String answerTime = driver.findElement(accordionPanelTime).getText();
        return answerTime;
    }

    public String getAnswerAboutToday() {
        String answerToday = driver.findElement(accordionPanelToday).getText();
        return answerToday;
    }

    public String getAnswerAboutEarlier() {
        String answerEarlier = driver.findElement(accordionPanelEarlier).getText();
        return answerEarlier;
    }

    public String getAnswerAboutCharger() {
        String answerCharger = driver.findElement(accordionPanelCharger).getText();
        return answerCharger;
    }

    public String getAnswerAboutCancel() {
        String answerCancel = driver.findElement(accordionPanelCancel).getText();
        return answerCancel;
    }

    public String getAnswerAboutMKAD() {
        String answerMKAD = driver.findElement(accordionPanelMKAD).getText();
        return answerMKAD;
    }
}