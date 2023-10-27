package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaCumpleañosValidacion {

    public static final Target NOMBRE_PRODUCTO = Target.the("Nombre del producto seleccionado")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product/mdf-0001/'])[7]"));
}
