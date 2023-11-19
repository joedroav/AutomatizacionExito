package com.exito.stepdefinitions;

import com.exito.steps.CarritoSteps;
import com.exito.steps.ExitoSteps;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.es.*;

public class ExitoStepsDefinitions {
    @Steps
    ExitoSteps exitoSteps;
    @Steps
    CarritoSteps carritoSteps;
    @Dado("que el usuario ingresa al navegador")
    public void queElUsuarioIngresaAlNavegador() {
        exitoSteps.abrirNavegador();
        exitoSteps.cerrarPublicidad();
    }
    @Dado("selecciona la categoria de consolas")
    public void seleccionaLaCategoriaDeConsolas() {
        exitoSteps.abrirCategoria();
        exitoSteps.extenderSubcategoria();
        exitoSteps.abrirCatConsolas();
    }
    @Cuando("el usuario selecciona el producto")
    public void elUsuarioSeleccionaElProducto() {


    }
    @Cuando("de clic en el boton agregar al carrito de compras")
    public void deClicEnElBotonAgregarAlCarritoDeCompras() {
        carritoSteps.seleccionaProducto();
    }
    @Entonces("el usuario podra visaulizar el producto agregado")
    public void elUsuarioPodraVisaulizarElProductoAgregado() {
        carritoSteps.abreElCarrito();
        carritoSteps.ingresaCorreo();
        carritoSteps.clicBotonPreRegistro();
        carritoSteps.verificaProductoSeleccionado();
    }
}
