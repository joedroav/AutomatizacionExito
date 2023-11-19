package com.exito.steps;

import com.exito.pageObject.CarritoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.jupiter.api.Assertions;

public class CarritoSteps {
    String contenido="";
    @Page
    CarritoPage carritoPage;
    @Step("Selecciona el producto")
    public void seleccionaProducto(){
        contenido = carritoPage.getDriver().findElement(carritoPage.getTxtSeleccion()).getText();
        carritoPage.getDriver().findElement(carritoPage.getBtnAgregarProducto()).click();
    }
    @Step("Va al carrito de compras")
    public void abreElCarrito(){
        carritoPage.getDriver().findElement((carritoPage.getBtnCarrito())).click();
    }
    @Step("Ingresa correo")
    public void ingresaCorreo(){
        carritoPage.getDriver().findElement(carritoPage.getTxtCorreo()).sendKeys("joedroavprueba@hotmail.com");
    }
    @Step("clic boton pre-registro")
    public void clicBotonPreRegistro(){
        carritoPage.getDriver().findElement(carritoPage.getBtnCorreo()).click();
    }
    @Step("Verifica producto")
    public void verificaProductoSeleccionado(){
        // Utilizando assertEquals
        String textoEncontrado="";
        textoEncontrado=carritoPage.getDriver().findElement(carritoPage.getTxtComparacion()).getText();
        Assertions.assertEquals(contenido, textoEncontrado, "Los productos seleccionados no son iguales!!");
    }
}