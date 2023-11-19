package com.exito.steps;

import com.exito.pageObject.CarritoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CarritoSteps {
    @Page
    CarritoPage carritoPage;
    @Step("Selecciona el producto")
    public void seleccionaProducto(){
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
}
