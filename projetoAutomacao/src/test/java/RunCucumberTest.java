import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}
,features = "C:\\Users\\carolina.ruza\\Documents\\projetoAutomacao\\projetoAutomacao\\src\\test\\resources\\features"
,glue = {"steps"})
public class RunCucumberTest {
}