package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePage {

    public static final Target buttonPlaceOrder = Target.the("button confirming to place the order")
            .located(By.xpath("//*[@id='page-wrapper']//button"));

    public static final Target inputName = Target.the("box that shows us the form to enter the name")
            .located(By.id("name"));

    public static final Target inputCountry = Target.the("box that shows us the form to enter the country")
            .located(By.id("country"));

    public static final Target inputCity = Target.the("box that shows us the form to enter the city")
            .located(By.id("city"));

    public static final Target inputCreditCard = Target.the("box that shows us the form to enter the credit card")
            .located(By.id("card"));

    public static final Target inputMonth = Target.the("box that shows us the form to enter the month")
            .located(By.id("month"));

    public static final Target inputYear = Target.the("box that shows us the form to enter the year")
            .located(By.id("year"));

    public static final Target buttonPurchase = Target.the("confirm purchase button")
            .located(By.xpath("//*[@id='orderModal']//button[contains(.,'Purchase')]"));

    public static final Target labelPurchaseOk = Target.the("purchase confirmation text")
            .located(By.xpath("//h2[contains(.,'Thank you for your purchase')]"));

    public static final Target buttonOk = Target.the("accept voucher button")
            .located(By.xpath("//button[contains(.,'OK')]"));


}

