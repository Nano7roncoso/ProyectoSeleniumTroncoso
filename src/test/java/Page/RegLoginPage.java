package Page;

import Utilidades.claseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegLoginPage extends claseBase {
    public RegLoginPage(WebDriver driver) {
        super(driver);
    }

    //Identificar Localizador y acciones dentro de la pagina

    By locatorCloseVentana = By.className("dy-lb-close");
    public void closeVentana () {
        click(esperaClick(locatorCloseVentana));
    }
    By locatorEmail = By.id("RegistrationForm_email");
    public void mail (String mail){
        agregarTexto(esperaPorPresenciaElemento(locatorEmail), mail);
    }
    By locatorPassword = By.name("RegistrationForm[password]");
    public void password(String password){
        agregarTexto(esperaPorPresenciaElemento(locatorPassword), password);
    }
    By locatorConfimPassword = By.name("RegistrationForm[password2]");
    public void confirmPassword(String confirmPassword){
        agregarTexto(esperaPorPresenciaElemento(locatorConfimPassword), confirmPassword);
    }
    By locatorName = By.id("RegistrationForm_first_name");
    public void Name(String Name){
        agregarTexto(esperaPorPresenciaElemento(locatorName), Name);
    }
    By locatorApellido = By.id("RegistrationForm_last_name");
    public void Apellido(String Apellido){
        agregarTexto(esperaPorPresenciaElemento(locatorApellido), Apellido);
    }
    By locatorDNI = By.name("RegistrationForm[identification]");
    public void DNI(String DNI){
        agregarTexto(esperaPorPresenciaElemento(locatorDNI), DNI);
    }
    By locatorDia = By.name("RegistrationForm[day]");
    public void Dia(String Dia){
        agregarTexto(esperaPorPresenciaElemento(locatorDia), Dia);
    }
    By locatorMes = By.id("RegistrationForm_month");
    public void Mes(String Mes){
        agregarTexto(esperaPorPresenciaElemento(locatorMes), Mes);
    }
    By locatorAnio = By.name("RegistrationForm[year]");
    public void Anio(String Anio){
        agregarTexto(esperaPorPresenciaElemento(locatorAnio), Anio);
    }
    By locatorGenero = By.id("RegistrationForm_gender");
    public void Genero(String Genero) {
        By dropdownLocator = (locatorGenero);
        selectOptionFromDropdown(locatorGenero, Genero);
    }
    By bntEnviar = By.id("createAccountButton");
    public void EnviarReg(){
        click(esperaPorPresenciaElemento(bntEnviar));
    }
    //Login
    By locatorMailLogin = By.id("LoginForm_email");
    public void mailLogin(String LMail){
        agregarTexto(esperaPorPresenciaElemento(locatorMailLogin), LMail);
    }
    By locatorPasswordLogin = By.xpath("//input[@id='LoginForm_password']");
    public void passwordLogin (String LPassword){
        agregarTexto(esperaPorPresenciaElemento(locatorPasswordLogin), LPassword);
    }
    By locatorBntLogin = By.xpath("//input[@id='loginButton']");
    public void BntLogin () {
        click(esperaPorPresenciaElemento(locatorBntLogin));
    }
    //Mensajes de error
    By locatorMsjErrorCP1 = By.xpath("//label[contains(text(),'Ingrese una dirección de mail válida')]");
    public String obtenerMsjError(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP1));
    }
    By locatorMsjErrorCP2 = By.xpath("//label[contains(text(),'Ingrese la misma contraseña')]");
    public String obtenerMsjErrorCP2(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP2));
    }
    By locatorMsjErrorCP3 = By.xpath("//label[contains(text(),'Ingrese sólo letras')]");
    public String obtenerMsjErrorCP3(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP3));
    }
    By locatorMsjErrorCP4 = By.xpath("//body/div[@id='page']/div[@id='content']/div[2]/div[3]/form[1]/fieldset[1]/div[7]/div[2]/label[1]");
    public String obtenerMsjErrorCP4(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP4));
    }
    By locatorMsjErrorCP5 = By.xpath("//label[contains(text(),'Mínimo seis (6) caracteres')]");
    public String obtenerMsjErrorCP5(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP5));
    }

    By locatorMsjErrorCP6 = By.xpath("//div[contains(text(),'Se encontro un registro coincidente con usuariopar')]");
    public String obtenerMsjErrorCP6(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP6));
    }
    By locatorMsjErrorCP7 = By.xpath("//div[contains(text(),'E-mail o contraseña incorrectos.')]");
    public String obtenerMsjErrorCP7(){
        return obtenerTexto(esperaPorPresenciaElemento(locatorMsjErrorCP7));
    }
    By locatorLogin = By.xpath("//p[contains(text(),'Recibí las mejores promociones y novedades del mun')]");
    public String obtenerMsjLogin(){
        return obtenerTexto(esperaClick(locatorLogin));
    }



}


