package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ExitoPage extends PageObject {
    private WebDriver driver;
    private WebElement elementToHover;
    public ExitoPage(WebDriver driver) {this.driver = driver;}
    private final By btnCategory = By.id("category-menu");
    private final By btnPublicidad = By.id("wps-overlay-close-button");
    private final By btnSubCategoria = By.xpath("(//*[@class='exito-category-menu-3-x-contentCategory'])[4]");
    //este funciono //*[@class='exito-category-menu-3-x-contentCategory'][1]
    private final By btnConsolas = By.xpath("//p[contains(text(), 'Consolas')]");
    public By getBtnSubCategoria() {return btnSubCategoria;}
    public By getBtnCategory() {
        return btnCategory;
    }
    public By getBtnPublicidad() {
        return btnPublicidad;
    }
    public By getBtnConsolas() {
        return btnConsolas;
    }
}
