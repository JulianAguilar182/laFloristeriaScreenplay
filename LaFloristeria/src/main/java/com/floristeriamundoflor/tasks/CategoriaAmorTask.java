package com.floristeriamundoflor.tasks;

import com.floristeriamundoflor.ui.CategoriaAmorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CategoriaAmorTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CategoriaAmorUI.BOTON_AMOR),
                Click.on(CategoriaAmorUI.SELECCION_PRODUCTO),
                Click.on(CategoriaAmorUI.BOTON_AGREGARCARRITO),
                Click.on(CategoriaAmorUI.BOTON_AMOR),
                Click.on(CategoriaAmorUI.SELECCIONA_PRODUCTODOS),
                Click.on(CategoriaAmorUI.BOTON_CARRITO)

        );
    }

    public static Performable CategoriaAmor(){
        return instrumented(CategoriaAmorTask.class);
    }
}
