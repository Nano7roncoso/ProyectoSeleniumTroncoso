package Utilidades;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class claseBase {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public claseBase(WebDriver driver) {
        this.driver = driver;
    }
    //Accesadores y mutadores

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Elementos propios
    public WebElement buscarElementoWeb(By localizador){
        return driver.findElement(localizador);
    }
    public List<WebElement> buscarElementosWeb(By localizador){
        return driver.findElements(localizador);
        }
    //Obtener texto
    public String obtenerTexto (By localizador){

        return this.driver.findElement(localizador).getText();
    }
    public String obtenerTexto (WebElement elemento){

        return elemento.getText();
    }
    //Agregar texto
    public void agregarTexto (WebElement elemento, String texto){
        wait.until(ExpectedConditions.visibilityOf(elemento));
        elemento.sendKeys(texto);
    }
    public void agregarCombinacionTeclas (By localizador, Keys key){
        this.driver.findElement(localizador).sendKeys(key);
    }
    //Click
    public void click (By localizador){

        this.driver.findElement(localizador).click();
    }
    public void click (WebElement elemento){

        elemento.click();
    }

    public boolean estaDesplegado (By localizador){
        try {
            return driver.findElement(localizador).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public boolean estaDesplegado (WebElement element){
        try {
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }

    //Cargar pagina
    public void cargarPagina(String url){
        this.driver.get(url);
    }
    //Espera fija
    public void esperarXSegundos (int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //Espera Explicita
    public WebElement esperaPorPresenciaElemento (By localizador){
        wait = new WebDriverWait(this.driver, 60);

        return wait.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    //Espera Explicita a clickear
    public WebElement esperaClick(By localizador){
        wait = new WebDriverWait(this.driver,60);
        return wait.until(ExpectedConditions.elementToBeClickable(localizador));
    }
    //Conectar con el WebDriver
    public WebDriver conexionDriver (String ruta, String property, String browser){
        switch (browser){
            case "chrome":
                System.setProperty(property,ruta);
                this.driver = new ChromeDriver();
                return driver;
            case "firefox":
                System.setProperty(property,ruta);
                this.driver = new FirefoxDriver();
                return driver;
            case "iexplore":
                System.setProperty(property,ruta);
                this.driver = new EdgeDriver();
                return driver;
            default:
                return driver;
        }
    }
    //Maximizar ventana
    public void maximizarVentana(){
        this.driver.manage().window().maximize();
    }
    //Cerrar Browser
    public void cerrarBrowser(){
        this.driver.close();
    }
    //Seleccionar una opción en lista despegable
    public void selectOptionFromDropdown(By dropdownLocator, String option) {
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(option);
    }

    }
