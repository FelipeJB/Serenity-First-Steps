package starter.automationResources;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Link;

public class Select {
    public static Performable firstResult() {
        return Task.where("{0} Navigates to the first result ",
                Click.on(Link.locatedBy("main .post:nth-child(2) h2 a"))
        );
    }
}
