package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.HomePage;
import userinterface.LoginPage;

public class AndLogin implements Task {

    private String username;
    private String password;

    public AndLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static AndLogin onThePage(String username, String password) {return Tasks.instrumented(AndLogin.class,username,password);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.buttonLogin),
                WaitUntil.the(LoginPage.buttonLogin, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Enter.theValue(username).into(LoginPage.inputUsername),
                Enter.theValue(password).into(LoginPage.inputPassword),
                Click.on(LoginPage.buttonLogin)
                );
    }
}
