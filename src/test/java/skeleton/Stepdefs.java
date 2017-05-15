package skeleton;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

    private Belly belly;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int arg0) throws Throwable {
        belly.nap(arg0);
    }

    @Then("^my belly is empty$")
    public void myBellyIsEmpty() throws Throwable {
        assertThat(belly.flush(), is(equalTo(0)));
    }
}
