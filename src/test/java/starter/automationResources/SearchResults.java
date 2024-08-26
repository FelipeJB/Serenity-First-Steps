package starter.automationResources;

import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import net.serenitybdd.screenplay.ensure.web.ElementsLocated;
import net.serenitybdd.screenplay.targets.Target;

public class SearchResults {
    public static Target results() {
        return ElementLocated.by("main .entry-content");
    }
}
