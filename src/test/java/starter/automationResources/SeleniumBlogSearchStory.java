package starter.automationResources;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import net.serenitybdd.screenplay.ensure.web.ElementsLocated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@WithTag("Search")
@ExtendWith(SerenityJUnit5Extension.class)
public class SeleniumBlogSearchStory {

    @CastMember(name = "Steve")
    Actor steve;

    @WithTag("Selenium")
    @Test
    public void searchForSeleniumArticles() {
        steve.attemptsTo(
            Navigate.toTechBlog(),
            Search.byKeyword("Selenium"),
            Ensure.thatTheListOf(SearchResults.results()).hasSizeGreaterThan(3)
        );
    }


    @WithTag("BlogPost")
    @Test
    public void verifyFirstSeleniumArticleContent() {
        steve.attemptsTo(
            Navigate.toTechBlog(),
            Search.byKeyword("Selenium"),
            Select.firstResult(),
                Ensure.that(Article.content()).textContent().contains("Selenium")
        );
    }
}
