package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {
    private final By btnAgregarProducto =
            By.xpath("(//*[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 '])[1]");
    private final By btnCarrito = By.xpath("//*[@class='exito-header-3-x-minicartLink']");
    private final By txtCorreo = By.xpath("//input[@name='email']");
    private final By btnCorreo = By.xpath("//button[@class='exito-checkout-io-0-x-preLoginActiveButton']");
    private final By txtSeleccion = By.xpath("(//span[@class='vtex-store-components-3-x-productBrand '])[1]");

    private final By txtComparacion =By.xpath("//span[contains(@data-molecule-product-detail-name-span, 'true')]");

    public By getTxtComparacion() {
        return txtComparacion;
    }

    public By getTxtSeleccion() {
        return txtSeleccion;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getBtnCorreo() {
        return btnCorreo;
    }

    public By getBtnCarrito() {
        return btnCarrito;
    }

    public By getBtnAgregarProducto() {
        return btnAgregarProducto;
    }
}
