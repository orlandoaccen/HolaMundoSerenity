package com.accenture.HolaMundoSerenity.features.search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.accenture.HolaMundoSerenity.steps.Pasos;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class HolaMundo {

    @Managed(driver = "chrome")
    public WebDriver driver;

    @Steps
    public Pasos ana;

    @Before
    public void cargaDriver() {
        ana.setDriver(driver);
    }

    @Test
    public void busquedaDeHolaMundoEnGoogle() {
        ana.abreElNavegador();
        ana.escribeEnLaBarraDeBusqueda();
    }

}

