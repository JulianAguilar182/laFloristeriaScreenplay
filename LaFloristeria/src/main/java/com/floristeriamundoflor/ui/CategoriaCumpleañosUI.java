package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaCumpleañosUI {

    public static final Target BOTON_CUMPLEAÑOS = Target.the("Categoria cumpleaños")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/cumpleanos/'])[4]"));

    public static final Target SELECCION_PRODUCTO = Target.the("Seleccion de producto")
            .located(By.xpath("//a[@title='MDF 0001']"));

    public static final Target BOTON_AGREGARCARRITO  = Target.the("Agregar al carrito")
            .located(By.xpath("//button[@name='add-to-cart']"));

    public static final Target BOTON_BORRARPRODUCTO = Target.the("Eliminar del carrito")
            .located(By.xpath("(//a[@class='remove'])[3]"));
}
