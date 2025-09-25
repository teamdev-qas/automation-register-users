package com.AECODE.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Page {
    private final WebDriverWait wait;
    private WebDriver driver;

    //-------------------------------------------------------------------------------
    private static By BotonAcceder=By.xpath("//button[normalize-space()='Acceder']");
    private static By BotonTextIniciarSesion=By.cssSelector("aside[class='hidden md:block w-[360px] py-[30px] px-[24px] h-[100vh] fixed right-0 top-0 bg-[#0D0F1F] transform transition-transform duration-300 ease-out z-100 translate-x-0'] button[type='button']");
    private static By InputCorreoElectronico = By.cssSelector("aside[class='hidden md:block w-[360px] py-[30px] px-[24px] h-[100vh] fixed right-0 top-0 bg-[#0D0F1F] transform transition-transform duration-300 ease-out z-100 translate-x-0'] input[name='identifier']");
    private static By InputContrasena = By.cssSelector("aside[class='hidden md:block w-[360px] py-[30px] px-[24px] h-[100vh] fixed right-0 top-0 bg-[#0D0F1F] transform transition-transform duration-300 ease-out z-100 translate-x-0'] input[name='password']");
    private static By BotonContinuar = By.cssSelector("aside[class='hidden md:block w-[360px] py-[30px] px-[24px] h-[100vh] fixed right-0 top-0 bg-[#0D0F1F] transform transition-transform duration-300 ease-out z-100 translate-x-0'] button[type='submit']");
    private static By IconoPerfil = By.cssSelector("body > header:nth-child(1) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > span:nth-child(2)");
    private static By MiPerfil = By.xpath("//span[normalize-space()='Mi perfil']");
    private static By EditarInformacion = By.xpath("//span[normalize-space()='Editar información']");
    private static By MisCursos = By.xpath("//span[normalize-space()='Mis cursos']");
    private static By VistaMisCursos = By.xpath("//h1[normalize-space()='Mis cursos']");


    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ClickAcceder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BotonAcceder));
        WebElement ClickBotonAcceder = driver.findElement(BotonAcceder);
        ClickBotonAcceder.click();
    }

    public void ClickIniciarSesion() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BotonTextIniciarSesion));
        WebElement ClickBotonIniciarSesion = driver.findElement(BotonTextIniciarSesion);
        ClickBotonIniciarSesion.click();
    }

    public void CompletarContrasena(String contrasena) {
        WebElement campContrasena = driver.findElement(InputContrasena);
        campContrasena.sendKeys(contrasena);

    }

    public void CompletarCorreoElectronico(String correoElectronico) {
        WebElement campCorreo = driver.findElement(InputCorreoElectronico);
        campCorreo.sendKeys(correoElectronico);
    }

    public void ClickBotonContinuar() {
        WebElement ClickBtnContinuar = driver.findElement(BotonContinuar);
        ClickBtnContinuar.click();
    }

    public void ClickPerfil() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(IconoPerfil));
        WebElement ClickPerfil = driver.findElement(IconoPerfil);
        ClickPerfil.click();
    }

    public void ClickMiPerfil() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MiPerfil));
        WebElement ClickListaMiPerfil = driver.findElement(MiPerfil);
        ClickListaMiPerfil.click();
    }


    public void ClickEnEditarInformacion() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EditarInformacion));
        WebElement ClickEditarInformacion = driver.findElement(EditarInformacion);
        ClickEditarInformacion.click();
    }

    public void ClickMisCursos() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MisCursos));
        WebElement ClickEnMisCursos = driver.findElement(MisCursos);
        ClickEnMisCursos.click();
    }

    public void ValidarVistaMisCursos() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VistaMisCursos));
    }
}

