package starter.automationResources;

import net.serenitybdd.screenplay.ensure.web.ElementsLocated;
import net.serenitybdd.screenplay.targets.Target;

public class Article {
    public static Target content() {
        return ElementsLocated.by("main .post");
    }
}
