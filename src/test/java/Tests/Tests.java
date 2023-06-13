package Tests;

import Page.*;
import Utilidades.DataDriven;
import Utilidades.PropertiesDriven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.sql.Driver;
import java.util.List;

public class Tests {
    private WebDriver driver;
    private DataDriven data;
    private List<String> datosCP;
    private PropertiesDriven properties;

    private HomePage homePage;
    private RegLoginPage regLoginPage;
    private MiCuenta miCuenta;
    private Catalogo catalogo;
    private Producto producto;
    private CarritosDeCompras carritosDeCompras;
    private FinalizarCompra finalizarCompra;

    @BeforeSuite
    public void inicioSuiteDepruebas(){
        System.out.println("Inicio de pruebas automatizadas");

    }

    @BeforeClass
    public void preparacionClase (){

    }

    @BeforeMethod
    public void preparacionTest (){
        properties = new PropertiesDriven();

        data = new DataDriven();

        homePage = new HomePage(driver);
        homePage.conexionDriver(properties.obtenerProperty("rutaDriver"),properties.obtenerProperty("browserProperty"),properties.obtenerProperty("browser"));
        regLoginPage = new RegLoginPage(homePage.getDriver());
        miCuenta = new MiCuenta(regLoginPage.getDriver());
        catalogo = new Catalogo(miCuenta.getDriver());
        catalogo = new Catalogo(homePage.getDriver());
        producto = new Producto(catalogo.getDriver());
        carritosDeCompras = new CarritosDeCompras(producto.getDriver());
        finalizarCompra = new FinalizarCompra(carritosDeCompras.getDriver());
        String url = properties.obtenerProperty("url");

        homePage.cargarPagina(url);
        homePage.maximizarVentana();
    }
    @Test
    public void CP001_IngreseUnaDireccionDeMailValida() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP001_IngreseUnaDireccionDeMailValida");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mail(datosCP.get(1));
        regLoginPage.password(datosCP.get(2));
        regLoginPage.confirmPassword(datosCP.get(3));
        regLoginPage.Name(datosCP.get(4));
        regLoginPage.Apellido(datosCP.get(5));
        regLoginPage.DNI(datosCP.get(6));
        regLoginPage.Dia(datosCP.get(7));
        regLoginPage.Mes(datosCP.get(8));
        regLoginPage.Anio(datosCP.get(9));
        regLoginPage.Genero(datosCP.get(10));
        regLoginPage.EnviarReg();
        Assert.assertEquals(datosCP.get(11),regLoginPage.obtenerMsjError());

    }
    @Test
    public void CP002_IngreseLaMismaContraseña() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP002_IngreseLaMismaContraseña");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mail(datosCP.get(1));
        regLoginPage.password(datosCP.get(2));
        regLoginPage.confirmPassword(datosCP.get(3));
        regLoginPage.Name(datosCP.get(4));
        regLoginPage.Apellido(datosCP.get(5));
        regLoginPage.DNI(datosCP.get(6));
        regLoginPage.Dia(datosCP.get(7));
        regLoginPage.Mes(datosCP.get(8));
        regLoginPage.Anio(datosCP.get(9));
        regLoginPage.Genero(datosCP.get(10));
        regLoginPage.EnviarReg();
        Assert.assertEquals(datosCP.get(11),regLoginPage.obtenerMsjErrorCP2());
    }
    @Test
    public void CP003_IngreseSoloLetras() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP003_IngreseSoloLetras");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mail(datosCP.get(1));
        regLoginPage.password(datosCP.get(2));
        regLoginPage.confirmPassword(datosCP.get(3));
        regLoginPage.Name(datosCP.get(4));
        regLoginPage.Apellido(datosCP.get(5));
        regLoginPage.DNI(datosCP.get(6));
        regLoginPage.Dia(datosCP.get(7));
        regLoginPage.Mes(datosCP.get(8));
        regLoginPage.Anio(datosCP.get(9));
        regLoginPage.Genero(datosCP.get(10));
        regLoginPage.EnviarReg();
        Assert.assertEquals(datosCP.get(11),regLoginPage.obtenerMsjErrorCP3());
    }
    @Test
    public void CP004_CampoObligatorio() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP004_CampoObligatorio");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mail(datosCP.get(1));
        regLoginPage.password(datosCP.get(2));
        regLoginPage.confirmPassword(datosCP.get(3));
        regLoginPage.Name(datosCP.get(4));
        regLoginPage.Apellido(datosCP.get(5));
        regLoginPage.Dia(datosCP.get(6));
        regLoginPage.Mes(datosCP.get(7));
        regLoginPage.Anio(datosCP.get(8));
        regLoginPage.Genero(datosCP.get(9));
        regLoginPage.EnviarReg();
        Assert.assertEquals(datosCP.get(10),regLoginPage.obtenerMsjErrorCP4());
    }

    @Test
    public void CP005_MinimoSeisCaracteres() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP005_MínimoSeisCaracteres");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mail(datosCP.get(1));
        regLoginPage.password(datosCP.get(2));
        regLoginPage.confirmPassword(datosCP.get(3));
        regLoginPage.Name(datosCP.get(4));
        regLoginPage.Apellido(datosCP.get(5));
        regLoginPage.DNI(datosCP.get(6));
        regLoginPage.Dia(datosCP.get(7));
        regLoginPage.Mes(datosCP.get(8));
        regLoginPage.Anio(datosCP.get(9));
        regLoginPage.Genero(datosCP.get(10));
        regLoginPage.EnviarReg();
        Assert.assertEquals(datosCP.get(11),regLoginPage.obtenerMsjErrorCP5());
    }
    @Test
    public void CP006_RegistroCoincidente() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP006_RegistroCoincidente");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mail(datosCP.get(1));
        regLoginPage.password(datosCP.get(2));
        regLoginPage.confirmPassword(datosCP.get(3));
        regLoginPage.Name(datosCP.get(4));
        regLoginPage.Apellido(datosCP.get(5));
        regLoginPage.DNI(datosCP.get(6));
        regLoginPage.Dia(datosCP.get(7));
        regLoginPage.Mes(datosCP.get(8));
        regLoginPage.Anio(datosCP.get(9));
        regLoginPage.Genero(datosCP.get(10));
        regLoginPage.EnviarReg();
        Assert.assertEquals(datosCP.get(12),regLoginPage.obtenerMsjErrorCP6());
    }
    @Test
    public void CP007_EmailOContraseñaIncorrectos() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP007_EmailOContraseñaIncorrectos");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mailLogin(datosCP.get(1));
        regLoginPage.passwordLogin(datosCP.get(2));
        regLoginPage.BntLogin();
        Assert.assertEquals(datosCP.get(3),regLoginPage.obtenerMsjErrorCP7());
    }
    @Test
    public void CP008_LoginExitoso() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP008_LoginExitoso");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mailLogin(datosCP.get(1));
        regLoginPage.passwordLogin(datosCP.get(2));
        regLoginPage.BntLogin();
        Assert.assertEquals(datosCP.get(3),regLoginPage.obtenerMsjLogin());
    }
    @Test
    public void CP009_BusquedaError() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP009_BusquedaError");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mailLogin(datosCP.get(1));
        regLoginPage.passwordLogin(datosCP.get(2));
        regLoginPage.BntLogin();
        miCuenta.clickBuscador();
        miCuenta.buscador(datosCP.get(3));
        miCuenta.lupa();
        Assert.assertEquals(datosCP.get(4),catalogo.obtenerErrorBusqueda());
    }
    @Test
    public void CP010_BusquedaOK() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP010_BusquedaOK");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mailLogin(datosCP.get(1));
        regLoginPage.passwordLogin(datosCP.get(2));
        regLoginPage.BntLogin();
        miCuenta.clickBuscador();
        miCuenta.buscador(datosCP.get(3));
        miCuenta.lupa();
        Assert.assertEquals(datosCP.get(4),catalogo.obtenerBusqueda());
    }
    @Test
    public void CP011_CarroVacio() throws IOException {
        datosCP = data.obtenerDatosPrueba("CP011_CarroVacio");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mailLogin(datosCP.get(1));
        regLoginPage.passwordLogin(datosCP.get(2));
        regLoginPage.BntLogin();
        miCuenta.clickBuscador();
        miCuenta.buscador(datosCP.get(3));
        miCuenta.lupa();
        catalogo.producto();
        producto.listaSelectTalle();
        producto.listaTalle();
        producto.bntComprar();
        producto.carrito();
        carritosDeCompras.eliminarCompra();
        Assert.assertEquals(carritosDeCompras.obtenerMsjCarroVacio(),datosCP.get(4));
    }
    @Test
    public void CP012_ErrorTarjeta () throws IOException {
        datosCP = data.obtenerDatosPrueba("CP012_ErrorTarjeta");

        homePage.closeVentana();
        homePage.irARegIng();
        regLoginPage.closeVentana();
        regLoginPage.mailLogin(datosCP.get(1));
        regLoginPage.passwordLogin(datosCP.get(2));
        regLoginPage.BntLogin();
        miCuenta.clickBuscador();
        miCuenta.buscador(datosCP.get(3));
        miCuenta.lupa();
        catalogo.producto();
        producto.listaSelectTalle();
        producto.listaTalle();
        producto.bntComprar();
        producto.carrito();
        carritosDeCompras.finalizarCompra();
        carritosDeCompras.esperaCargaPagina();
        finalizarCompra.bntContinuar();
        finalizarCompra.bntEnvio();
        finalizarCompra.numTarjeta(datosCP.get(4));
        Assert.assertEquals(datosCP.get(5),finalizarCompra.obtenerMsjErrorTarjeta());
    }


    @AfterMethod
    public void after (){
    homePage.cerrarBrowser();

    }


}
