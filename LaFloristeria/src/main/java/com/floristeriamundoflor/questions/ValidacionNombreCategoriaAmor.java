package com.floristeriamundoflor.questions;

import com.floristeriamundoflor.ui.CategoriaAmorValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionNombreCategoriaAmor implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CategoriaAmorValidacion.NOMBRE_PRODUCTO.resolveFor(actor).isVisible();
    }

    public static Question Validacion(){
        return new ValidacionNombreCategoriaAmor();
    }
}
