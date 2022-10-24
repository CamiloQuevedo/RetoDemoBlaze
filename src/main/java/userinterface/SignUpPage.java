package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage {
    public static final Target inputUsername = Target.the("box that shows us the form to enter the username")
            .located(By.id("sign-username"));
    public static final Target inputPassword = Target.the("box that shows us the form to enter the password")
            .located(By.id("sign-password"));
    public static final Target buttonSignUpOk = Target.the("button that confirms the Login form")
            .located(By.xpath("//*[@id='signInModal']//button[contains(.,'Sign')]"));
}
