package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target inputUsername = Target.the("box that shows us the form to enter the username")
            .located(By.id("loginusername"));
    public static final Target inputPassword = Target.the("box that shows us the form to enter the password")
            .located(By.id("loginpassword"));
    public static final Target buttonLogin = Target.the("button that confirms the user registration form")
            .located(By.xpath("//*[@id='logInModal']//button[contains(.,'Log')]"));
}
