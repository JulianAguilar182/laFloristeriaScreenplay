package com.floristeriamundoflor.questions;

import com.floristeriamundoflor.ui.CategoriaAmorValidacion;
import com.floristeriamundoflor.ui.CategoriaCumpleañosValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionNombreCategoriaCumple implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CategoriaCumpleañosValidacion.NOMBRE_PRODUCTO.resolveFor(actor).isVisible();
    }

    public static Question Validacion(){
        return new ValidacionNombreCategoriaCumple();
    }
}
