package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaAmorUI {

    public static final Target BOTON_AMOR = Target.the("Boton Categoria Amor")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/amor/'])[4]"));



    public static final Target SELECCION_PRODUCTO = Target.the("Selecciona primer producto")
            .located(By.xpath("//a[@title='MDF 0001']"));

    //button[@name='add-to-cart']

    public static final Target BOTON_AGREGARCARRITO = Target.the("Agregar carrito")
            .located(By.xpath("//button[@name='add-to-cart']"));

    //span[@class='sub-title']


    public static final Target SELECCIONA_PRODUCTODOS = Target.the("Selecciona  producto dos")
            .located(By.xpath("//a[@title='MDF 00010']"));

    public static final Target BOTON_CARRITO = Target.the("Agregar al carrito")
            .located(By.xpath("//span[@class='sub-title']"));
}
