package com.floristeriamundoflor.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CategoriaCumpleaños.feature",
        glue = "com.floristeriamundoflor.stepDedinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
