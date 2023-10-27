package com.floristeriamundoflor.stepDedinitions;

import com.floristeriamundoflor.questions.ValidacionNombreCategoriaAmor;
import com.floristeriamundoflor.tasks.CategoriaAmorTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CategoriaAmorStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la pagina floristeriamundoflor.com y le da click en la categoria amor")
    public void queElUsuarioIngresaALaPaginaFloristeriamundoflorComYLeDaClickEnLaCategoriaAmor() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    @Cuando("el usuario seleccione dos productos")
    public void elUsuarioSeleccioneDosProductos() {
        theActorInTheSpotlight().attemptsTo(
                CategoriaAmorTask.CategoriaAmor()

        );
    }
    @Entonces("los puede visualizar en el carrito de compras")
    public void losPuedeVisualizarEnElCarritoDeCompras() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionNombreCategoriaAmor.Validacion(), Matchers.equalTo(false)
                )

        );
    }

}
