package com.exito.steps;

import com.exito.pageObject.ExitoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExitoSteps {
    @Page
    ExitoPage exitoPage;
    @Step("Abrir el navegador")
    public void abrirNavegador(){
        exitoPage.openUrl("https://www.exito.com/");
    }
    @Step("Cerrar publicidad")
    public void cerrarPublicidad(){
        exitoPage.getDriver().findElement(exitoPage.getBtnPublicidad()).click();
    }
    @Step("Abre categorias consolas")
    public void abrirCategoria() {
        // Usar Duration.ofSeconds para crear un objeto de tipo Duration
        WebDriverWait wait = new WebDriverWait(exitoPage.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(exitoPage.getBtnCategory())).click();
    }

    @Step("Extiende SubCategorias")
    public void extenderSubcategoria() {
        // Usar Duration.ofSeconds para crear un objeto de tipo Duration
        WebDriverWait wait = new WebDriverWait(exitoPage.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(exitoPage.getDriver().findElement(exitoPage.getBtnSubCategoria())));

        Actions actions = new Actions(exitoPage.getDriver());
        actions.moveToElement(exitoPage.getDriver().findElement(exitoPage.getBtnSubCategoria())).perform();
    }
    @Step("Selecciona subcategoria Consolas")
    public void abrirCatConsolas(){
        exitoPage.getDriver().findElement(exitoPage.getBtnConsolas()).click();
    }
}
