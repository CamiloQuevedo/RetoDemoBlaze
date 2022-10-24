package tasks;

import interactions.SelectProduc;
import util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.HomePage;
import userinterface.SumaryProduct;

public class AddProduct implements Task {

    public static AddProduct toShoppingCart() {return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String foo = System.getProperty("category");
        String bar = System.getProperty("product");
        actor.attemptsTo(WaitUntil.the(HomePage.categoryItem(foo), WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(HomePage.categoryItem(foo)),
                WaitUntil.the(HomePage.productItems(bar), WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                SelectProduc.items(HomePage.productItems(bar),HomePage.productItemsString(bar)),
                WaitUntil.the(SumaryProduct.buttonAddToCart, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(SumaryProduct.buttonAddToCart)
        );
        Wait.millis(2000);
        actor.attemptsTo(Switch.toAlert().andAccept());
    }
}