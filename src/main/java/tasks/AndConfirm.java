package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.HomePage;
import userinterface.PurchasePage;

import java.util.List;

public class AndConfirm implements Task {
    private List<List<String>> data;

    public AndConfirm(List<List<String>> data) {
        this.data = data;
    }

    public static AndConfirm thePurchase(List<List<String>> data) {return Tasks.instrumented(AndConfirm.class,data);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.buttonCart, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(HomePage.buttonCart),
                WaitUntil.the(PurchasePage.buttonPlaceOrder, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(PurchasePage.buttonPlaceOrder),
                WaitUntil.the(PurchasePage.buttonPurchase, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(1).get(0)).into(PurchasePage.inputName),
                Enter.theValue(data.get(1).get(1)).into(PurchasePage.inputCountry),
                Enter.theValue(data.get(1).get(2)).into(PurchasePage.inputCity),
                Enter.theValue(data.get(1).get(3)).into(PurchasePage.inputCreditCard),
                Enter.theValue(data.get(1).get(4)).into(PurchasePage.inputMonth),
                Enter.theValue(data.get(1).get(5)).into(PurchasePage.inputYear),
                Click.on(PurchasePage.buttonPurchase));

    }
}
