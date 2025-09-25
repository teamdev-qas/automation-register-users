package com.AECODE.steps;


import com.AECODE.page.Page;
import org.openqa.selenium.WebDriver;


public class Step {

    WebDriver driver;
    Page page;

    public Step(WebDriver driver) {
        this.driver = driver;
        this.page = new Page(driver);
    }

    public void navegarA(String url) {
        driver.get(url);
    }

//--------------------------------------------------------------------------------------------
    public void ClickBtnAcceder() {
        page.ClickAcceder();
    }

    public void ClickBtnIniciarSesion() {
        page.ClickIniciarSesion();
    }

    public void IngresarCorreoElectronico(String correoElectronico) {
        page.CompletarCorreoElectronico(correoElectronico);
    }

    public void IngresarContrasena(String contrasena) {
        page.CompletarContrasena(contrasena);
    }

    public void ClickEnContinuar() {
        page.ClickBotonContinuar();
    }

    public void ValidarPerfil() {
        page.ClickPerfil();
    }

    public void ClickEnMiPerfil() {
        page.ClickMiPerfil();
    }

    public void ClickEditarInformacion() {
        page.ClickEnEditarInformacion();
    }

    public void ClickBtnMisCursos() {page.ClickMisCursos();
    }

    public void ValidarVistaCursos() {page.ValidarVistaMisCursos();
    }
}

