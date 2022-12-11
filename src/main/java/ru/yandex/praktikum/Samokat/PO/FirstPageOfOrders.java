package ru.yandex.praktikum.Samokat.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FirstPageOfOrders {

//ЭЛЕМЕНТЫ

    //инпут Имя

    private final WebDriver driver;
    private final By nameInput = By.xpath("(//input[@placeholder ='* Имя'])");

    //инпут Фамилия
    private final By lastNameInput = By.xpath("(//input[@placeholder ='* Фамилия'])");

    //инпут Адрес
    private final By adressInput = By.xpath("(//input[@placeholder ='* Адрес: куда привезти заказ'])");
    //инпут Метро
    private final By metroInput = By.xpath("(//input[@placeholder ='* Станция метро'])");

    //выбор метро в выпадашке- Лубянка
    private final By metroSudgestLubyanka = By.className("Order_Text__2broi");

    //выбор метро в выпадашке - Аэропорт
    private final By metroSudgestAeroport = By.className("Order_Text__2broi");

    //инпут Телефон
    private final By phoneInput = By.xpath("(//input[@placeholder ='* Телефон: на него позвонит курьер'])");

    //кнопка Далее
    private final By continueButton = By.xpath("//button[text()='Далее']");


    public FirstPageOfOrders(WebDriver driver) {
        this.driver = driver;

    }

    //МЕТОДЫ
    //клик в имя
    public void clickNameInput() {
        driver.findElement(nameInput).click();
    }

    //метод для заполнения поля имя
    public void setNameInput(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    //метод для заполнения поля фамилия
    public void setLastNameInput(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    //метод для заполнения поля адрес
    public void setAdressInput(String adress) {
        driver.findElement(adressInput).sendKeys(adress);
    }

    //метод для заполнения выпадашки метро. один раз - Лубянка, второй - Аэропорт

    public void setMetroInput(String metro) {
        driver.findElement(metroInput).sendKeys(metro);
    }

    //метод клик для Лубянки
    public void clickMetroSudgestLubyanka() {
        driver.findElement(metroSudgestLubyanka).click();
    }

    //метод клик для Аэропорт
    public void clickMetroSudgestAeroport() {
        driver.findElement(metroSudgestAeroport).click();
    }

    //метод для заполнения номера телефона
    public void setPhoneInput(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    //метод клик по кнопке далее
    public void clickForContinueButton() {
        driver.findElement(continueButton).click();

    }
}

