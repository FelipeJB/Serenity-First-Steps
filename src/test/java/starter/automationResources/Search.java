package starter.automationResources;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.InputField;
import org.openqa.selenium.Keys;

public class Search {
    public static Performable byKeyword(String keyword) {
        return Task.where("{0} searches for articles containing they word " + keyword,
                Enter.theValue(keyword).into(InputField.withNameOrId("menu-search")).thenHit(Keys.ENTER)
        );
    }
}
