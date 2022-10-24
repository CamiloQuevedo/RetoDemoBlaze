package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SumaryProduct {
    public static final Target buttonAddToCart = Target.the("add product to cart button")
            .located(By.xpath("//*[@id='tbodyid']//a"));
}
