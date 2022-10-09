package ru.yandex.praktikum.Samokat.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SecondPageOfOrders {

    private WebDriver driver;



        //инпут когда

        private By dateInput = By.xpath("(//input[@placeholder ='* Когда привезти самокат'])");

        //инпут срок
        private By timeInput = By.className("Dropdown-placeholder");

        //локатор для срока сутки
        private By dropDown1days = By.xpath("(//*[@class='Dropdown-option' and text()='сутки'])");


        //локатор для срока 3 суток

        private By dropDown3days = By.xpath("(//*[@class='Dropdown-option' and text()='трое суток'])");


        //чек-бокс цвет серый

        private By greyCheckBox = By.id("grey");
//чек-бокс цвет черный
        private By blackCheckBox = By.id("black");


        //локатор для кнопки заказать на страничке Аренды

        private By orderButtonByOrder = By.xpath("//div/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


        //кнопка Да в поп-апе

        private By buttonYesByOrder = By.xpath("(//div/button[text()='Да'])");


        //поп-ап с оформленным заказом

        private By ordersPopup = By.xpath("//div[text()='Заказ оформлен']");

    public SecondPageOfOrders(WebDriver driver) {
        this.driver = driver;
    }
        //МЕТОДЫ

        // образец public void setNameInput (String name){
        //            driver.findElement(nameInput).sendKeys(name);

    //заполнить инпут когда
    public void setDateInput(String date) {
            driver.findElement(dateInput).sendKeys(date);

    }


    //метод клик в инпут срока для выпадашки
    public void clickTimeInput() {
            driver.findElement(timeInput).click();
    }


    //метод выбор срока сутки
    public void clickDropDown1days() {
            driver.findElement(dropDown1days).click();
    }


    //метод выбор срока 3 суток
    public void clickDropDown3days() {
            driver.findElement(dropDown3days).click();
    }


    //метод клик в чекбокс-серый
    public void clickGreyCheckBox() {
            driver.findElement(greyCheckBox).click();
    }


    //метод клик в чекбокс-черный
    public void clickBlackCheckBox() {
            driver.findElement(blackCheckBox).click();
    }


    //метод клик в Заказать
    public void clickOrderButtonByOrder() {
            driver.findElement(orderButtonByOrder).click();
    }


    //метод клик в Да в поп-апе
    public void clickButtonYesByOrder() {
            driver.findElement(buttonYesByOrder).click();
    }

        //метод для получения текста о совершенном заказе
        public String getTextAboutOrder () {
            String str = driver.findElement(ordersPopup).getText();
            return (str);
        }
}
