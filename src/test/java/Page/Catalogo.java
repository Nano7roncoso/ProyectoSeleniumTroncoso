package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Catalogo extends claseBase {
    public Catalogo(WebDriver driver) {
        super(driver);
    }
    By locatorErrorBusqueda = By.xpath("//p[contains(text(),'No hemos encontrado resultados para tu búsqueda')]");
    public String obtenerErrorBusqueda(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorErrorBusqueda));
    }
    By locatorBusquedaOk = By.xpath("//body/div[@id='page']/div[@id='content']/div[2]/div[3]/div[2]/div[1]/span[2]");
    public String obtenerBusqueda() {return obtenerTexto(esperaPorPresenciaElemento(locatorBusquedaOk));}
    By locatorProducto = By.className("card-description");
    public void producto(){
        click(esperaPorPresenciaElemento(locatorProducto));
    }

}
