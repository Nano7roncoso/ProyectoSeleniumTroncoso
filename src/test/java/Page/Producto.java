package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Producto extends claseBase {
    public Producto(WebDriver driver) {
        super(driver);
    }
    By locatorSelecTalle = By.xpath("//body/div[@id='page']/div[@id='content']/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]");
    public void listaSelectTalle () {
        click(esperaClick(locatorSelecTalle));
    }
    By locatorTalle = By.xpath("//body/div[@id='page']/div[@id='content']/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[4]");
    public void listaTalle () {
        click(esperaClick(locatorTalle));
    }
    By locatorBntComprar = By.xpath("//button[@id='AddToCart']");
    public void bntComprar(){
        click(esperaClick(locatorBntComprar));
    }
    By locatorCarrito = By.id("cart-head");
    public void carrito (){
        click(esperaClick(locatorCarrito));
    }



    //By locatorTalle = By.xpath("//span[contains(text(),'Seleccione un talle')]");
    //public void Talle(String Talle) {
    //    By dropdownLocator = (locatorTalle);
    //    selectOptionFromDropdown(locatorTalle, Talle);
    //}

}