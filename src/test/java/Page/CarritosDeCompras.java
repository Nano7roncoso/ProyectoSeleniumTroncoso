package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritosDeCompras extends claseBase {
    public CarritosDeCompras(WebDriver driver) {
        super(driver);
    }
    By locatorBntFinalizarCompra = By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='cart']/form[@id='cart-items-list-form']/div[3]/div[2]/div[3]/a[1]");
    public void finalizarCompra (){
        click(esperaClick(locatorBntFinalizarCompra));
    }
    public void esperaCargaPagina (){
        esperarXSegundos(90);
    }
    By locatorBntEliminarCompra = By.xpath("//p[contains(text(),'Tu carrito está vacío...')]");
    public void eliminarCompra (){
        click(esperaPorPresenciaElemento(locatorBntEliminarCompra));
    }
    By locatorMsjCarroVacio = By.xpath("//p[contains(text(),'Tu carrito está vacío...')]");
    public String obtenerMsjCarroVacio(){
        return obtenerTexto(esperaClick(locatorMsjCarroVacio));
    }


}
