package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.SuccessfulPurchase;
import tasks.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ShoppingBuy_StepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Camilo is logged in to DemoBlaze page$")
    public void thatCamiloIsLoggedInToDemoBlazePage(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.demoBlazePage(),AndLogin.onThePage(data.get(1).get(0),data.get(1).get(1)));
    }

    @When("^he finds the product to buy$")
    public void heFindsTheProductToBuy(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.toShoppingCart(),AndConfirm.thePurchase(
                data));
    }

    @Then("^he successfully completes the purchase process$")
    public void heSuccessfullyCompletesThePurchaseProcess(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SuccessfulPurchase.toData(data))
        );
    }
}
