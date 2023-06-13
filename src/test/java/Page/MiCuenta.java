package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiCuenta extends claseBase {
    public MiCuenta(WebDriver driver) {
        super(driver);
    }



    By locatorClickBuscador = By.id("searchInput");
    public void clickBuscador (){
        click(esperaClick(locatorClickBuscador));
    }
    By locatorBuscador = By.id("searchInput");
    public void buscador (String Buscador) {
        agregarTexto(esperaPorPresenciaElemento(locatorBuscador), Buscador);
    }
    By locatorBntLupa = By.xpath("//header/div[4]/div[1]/div[2]/form[1]/button[1]");
    public void lupa () {
        click(esperaClick(locatorBntLupa));
    }
}
