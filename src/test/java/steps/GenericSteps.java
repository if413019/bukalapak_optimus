package steps;

import com.testvagrant.commons.exceptions.OptimusException;
import com.testvagrant.stepdefs.exceptions.NoSuchEventException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.io.IOException;

import static com.testvagrant.stepdefs.core.Tapster.tapster;

public class GenericSteps extends BaseSteps {
    /**
        Most of methods in this class written using regex.
        Please refer to https://www.javatpoint.com/java-regex to learn more about regex in java. 
    **/
    //Given [actor] on [screenName] screen [action] on [element] value [value]
    @Given("^(\\w+)\\s+on\\s+(\\w+)\\s+screen\\s+(\\w+)\\s+on\\s+(\\w+)\\s+value\\s+(.*)$")
    public void consumerOnScreenPerformsActionOnElementWithValue(String consumer, String screen, String action, String element, String value) throws NoSuchEventException, OptimusException, IOException {
        tapster().useDriver(getDriverInstanceFor(consumer))
                .asConsumer(consumer)
                .onScreen(screen)
                .onElement(element)
                .doAction(action)
                .withValue(value)
                .serve();
    }

    //And [actor] on [screenName] screen [action] on [element]
    @And("^(\\w+)\\s+on\\s+(\\w+)\\s+screen\\s+(\\w+)\\s+on\\s+(\\w+)$")
    public void consumerOnScreenPerformsActionOnElement(String consumer, String screen, String action, String element) throws OptimusException, NoSuchEventException, IOException {
       tapster().useDriver(getDriverInstanceFor(consumer))
               .onScreen(screen)
               .asConsumer(consumer)
               .onElement(element)
               .doAction(action)
               .serve();
    }

    //And [actor] and [another actor] on [screenName] screen [action] on [element]
    @And("^(\\w+)\\s+and\\s+(\\w+)\\s+on\\s+(\\w+)\\s+screen\\s+(\\w+)\\s+on\\s+(\\w+)$")
    public void consumersOnScreenPerformsActionOnElement(String consumer1, String consumer2, String screen, String action, String element) throws OptimusException, NoSuchEventException, IOException {
        consumerOnScreenPerformsActionOnElement(consumer1, screen, action, element);
        consumerOnScreenPerformsActionOnElement(consumer2, screen, action, element);
    }

    //And [actor] on [screenName] screen verifies [element] is [assertionAction]
    @And("^(\\w+)\\s+on\\s+(\\w+)\\sscreen verifies\\s+(\\w+)\\s+is\\s+(.*)$")
    public  void  assertelement(String consumer, String screen, String element, String action) throws NoSuchEventException, IOException, OptimusException {
        tapster().useDriver(getDriverInstanceFor(consumer))
                .onScreen(screen)
                .asConsumer(consumer)
                .onElement(element)
                .doAction(action)
                .serve();
    }

    //And [actor] on [screenName] screen verifies [element] has [assertionAction] value [value]
    @And("^(\\w+)\\s+on\\s+(\\w+)\\sscreen verifies\\s+(\\w+)\\s+has\\s+(\\w+)\\s+value\\s+(.*)$")
    public  void  assertelementwithvalue(String consumer, String screen, String element, String action,String value) throws OptimusException, NoSuchEventException, IOException {
        tapster().useDriver(getDriverInstanceFor(consumer))
                .onScreen(screen)
                .asConsumer(consumer)
                .onElement(element)
                .doAction(action)
                .withValue(value)
                .serve();
    }
}
