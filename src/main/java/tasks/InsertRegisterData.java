package tasks;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SignUpPage;
import util.GenerateData;

public class InsertRegisterData implements Task {

    public static InsertRegisterData thePage() {
        return Tasks.instrumented(InsertRegisterData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.buttonSingUp),
                WaitUntil.the(SignUpPage.inputUsername, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Enter.theValue(GenerateData.username()).into(SignUpPage.inputUsername),
                Enter.theValue(GenerateData.password()).into(SignUpPage.inputPassword)
                );
    }
}
