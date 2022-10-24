package questions;

import util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;
import org.assertj.core.api.AbstractStringAssert;
import userinterface.SignUpPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SuccessfulRegistration implements Question<AbstractStringAssert<?>> {

    private List<List<String>> data;

    public SuccessfulRegistration( List<List<String>> data) {this.data = data;}

    public static SuccessfulRegistration toData(List<List<String>> data) {
        return new SuccessfulRegistration(data);
    }

    @Override
    public AbstractStringAssert<?> answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(SignUpPage.buttonSignUpOk));
        Wait.millis(2000);
        AbstractStringAssert<?> result =assertThat(actor.asksFor(HtmlAlert.text())).isEqualTo(data.get(1).get(0));
        actor.attemptsTo(Switch.toAlert().andAccept());
        return result;
    }
}