package starter.automationResources;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {

    public static Performable toTechBlog() {
        return Open.url("https://testautomationresources.com/");
    }
}
