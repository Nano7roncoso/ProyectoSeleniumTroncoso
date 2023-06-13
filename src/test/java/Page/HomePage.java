package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends claseBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Identificar Localizador y acciones dentro de la pagina
    By locatorCloseVentana = By.className("dy-lb-close");
    public void closeVentana () {

        if (despliegueVentana())
        click(esperaClick(locatorCloseVentana));

    }

    public boolean despliegueVentana (){
        return estaDesplegado(esperaPorPresenciaElemento(locatorCloseVentana));
    }
    By locatorRegIng = By.xpath("//span[contains(text(),'Registrate')]");
    public void  irARegIng (){
        click(esperaPorPresenciaElemento(locatorRegIng));
    }





}
