package com.AECODE.stepsdefinitions;
import com.AECODE.steps.Step;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class StepsDef {
    private Step AECODE;
    private Step InterSeguros;
    private WebDriver driver;
    private Scenario scenario;

    @Before(order=0)
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Escritorio\\auto\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private  void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

//--------------------------------------------------------------------------------------------
    @Given("que estoy en la pagina de Aecode")
    public void queEstoyEnLaPaginaDeAecode() {
        AECODE = new Step(driver);
        AECODE.navegarA("https://aecode.ai/");
        screenShot();
    }


    @And("doy click en Acceder")
    public void doyClickEnAcceder() {
        AECODE.ClickBtnAcceder();
        screenShot();
    }

    @And("doy click en Iniciar Sesion")
    public void doyClickEnIniciarSesion() {
        AECODE.ClickBtnIniciarSesion();
        screenShot();
    }

    @And("ingreso el {string} y {string}")
    public void ingresoElY(String CorreoElectronico, String Contrasena) {
        AECODE.IngresarCorreoElectronico(CorreoElectronico);
        AECODE.IngresarContrasena(Contrasena);
        screenShot();
    }


    @When("hago clic en Continuar")
    public void hagoClicEnContinuar() {
        AECODE.ClickEnContinuar();
        screenShot();
    }

    @And("hago clic en el perfil")
    public void hagoClicEnElPerfil() {
        AECODE.ValidarPerfil();
        screenShot();
    }

    @And("hago clic en Mi Perfil")
    public void hagoClicEnMiPerfil() {
        AECODE.ClickEnMiPerfil();
    }

    @And("hago clic en Editar Informacion")
    public void hagoClicEnEditarInformacion() {
        AECODE.ClickEditarInformacion();
        screenShot();
    }

    @And("hago clic en mis cursos")
    public void hagoClicEnMisCursos() {
        AECODE.ClickBtnMisCursos();
        screenShot();
        AECODE.ValidarVistaCursos();
        screenShot();
    }
}


