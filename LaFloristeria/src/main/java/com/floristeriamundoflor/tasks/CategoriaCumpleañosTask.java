package com.floristeriamundoflor.tasks;

import com.floristeriamundoflor.ui.CategoriaAmorUI;
import com.floristeriamundoflor.ui.CategoriaCumpleañosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CategoriaCumpleañosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CategoriaCumpleañosUI.BOTON_CUMPLEAÑOS),
                Click.on(CategoriaCumpleañosUI.SELECCION_PRODUCTO),
                Click.on(CategoriaCumpleañosUI.BOTON_AGREGARCARRITO),
                Click.on(CategoriaCumpleañosUI.BOTON_BORRARPRODUCTO)
        );
    }

    public static Performable CategoriaCumpleaños(){
        return instrumented(CategoriaCumpleañosTask.class);
    }
}
