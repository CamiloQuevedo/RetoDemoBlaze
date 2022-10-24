package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target buttonSingUp = Target.the("button that show us the form to register")
            .located(By.id("signin2"));

    public static final Target buttonLogin = Target.the("button that show us the form to login")
            .located(By.id("login2"));

    public static final Target buttonCart = Target.the("button to confirm purchase")
            .located(By.id("cartur"));

    public static final Target categoryItem(String item) {
        return Target.the("Returns an item from the category list").located(By.xpath("//*[@id='itemc'][contains(.,'"+item+"')]"));
    }

    public static final Target productItems(String item) {
        return  Target.the("Returns an item from the product list").located(By.xpath("//*[@id='tbodyid']/div//h4/a[contains(.,'"+item+"')]"));
    }

    public static final String productItemsString(String item) {
        return "//*[@id='tbodyid']/div//h4/a[contains(.,'".concat(item).concat("')]");
    }



}
