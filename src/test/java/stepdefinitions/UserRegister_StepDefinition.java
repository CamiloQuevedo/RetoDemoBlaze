package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.SuccessfulRegistration;
import tasks.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class UserRegister_StepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Camilo wants to register on the DemoBlaze page$")
    public void ThatCamiloWantsToRegisterOnTheDemoBlazePage() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.demoBlazePage());
    }

    @When("^he enters all the data requested in the record$")
    public void HeEntersAllTheDataRequestedInTheRecord() {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertRegisterData.thePage());
    }

    @Then("^he completes the registration successfully on the page$")
    public void heCompletesTheRegistrationSuccessfullyOnThePage(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SuccessfulRegistration.toData(data)));
    }
}
