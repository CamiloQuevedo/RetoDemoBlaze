package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.PurchasePage;


import java.util.List;

public class SuccessfulPurchase implements Question<Boolean> {

    private List<List<String>> data;

    public SuccessfulPurchase(List<List<String>> data) {
        this.data = data;
    }

    public static SuccessfulPurchase toData(List<List<String>> data) {
        return new SuccessfulPurchase(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(PurchasePage.buttonOk, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds());
        String result= Text.of(PurchasePage.labelPurchaseOk).answeredBy(actor);
        actor.attemptsTo(Click.on(PurchasePage.buttonOk));
        return data.get(1).get(0).equals(result);
    }
}
