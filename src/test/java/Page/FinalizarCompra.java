package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Instant;

public class FinalizarCompra extends claseBase {
    public FinalizarCompra(WebDriver driver) {
        super(driver);
    }

    By locatorBntDireccion = By.xpath("//button[contains(text(),'Continuar')]");
    public void bntContinuar (){
        click(locatorBntDireccion);
    }
    By locatorBntEnvio = By.xpath("//button[contains(text(),'Continuar')]");
    public void bntEnvio (){
        click(locatorBntEnvio);
    }
    public void esperaCargaPagina (){
        esperarXSegundos(90);
    }

    By locatorNumTarjeta = By.id("//input[@id='cardNumber']");
    public void numTarjeta(String numTarjeta){
        agregarTexto(esperaPorPresenciaElemento(locatorNumTarjeta), numTarjeta);
    }
    By locatorMsjErrorTarjeta = By.xpath("//div[contains(text(),'E-mail o contraseña incorrectos.')]");
    public String obtenerMsjErrorTarjeta(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorTarjeta));
    }


}
