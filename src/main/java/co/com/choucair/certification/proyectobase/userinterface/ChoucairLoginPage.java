package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Click para ingresar datos de login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("Ingresa el usuario")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("Ingresa la contraseña")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("Click para validar campos")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
