package com.floristeriamundoflor.stepDedinitions;

import com.floristeriamundoflor.questions.ValidacionNombreCategoriaAmor;
import com.floristeriamundoflor.questions.ValidacionNombreCategoriaCumple;
import com.floristeriamundoflor.tasks.CategoriaCumpleañosTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CategoriaCumpleañosStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario ingresa a la pagina floristeriamundoflor.com y le da click en la categoria cumpleaños")
    public void queElUsuarioIngresaALaPaginaFloristeriamundoflorComYLeDaClickEnLaCategoriaCumpleaños() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @Cuando("el usuario seleccione un producto cualquiera")
    public void elUsuarioSeleccioneUnProductoCualquiera() {
        theActorInTheSpotlight().attemptsTo(
                CategoriaCumpleañosTask.CategoriaCumpleaños()

        );
    }
    @Entonces("el usuario lo puede visualizar en el carrito de compras para eliminarlo.")
    public void elUsuarioLoPuedeVisualizarEnElCarritoDeComprasParaEliminarlo() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionNombreCategoriaCumple.Validacion(), Matchers.equalTo(true)
                )

        );
    }
}
