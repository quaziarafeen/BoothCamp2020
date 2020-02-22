package runnerFile;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"C:\\Users\\Quazi\\IdeaProjects\\Shuvro\\BootCampSelenium\\Google\\src\\test\\java\\featureFile\\GoogleTest.Feature"},
        glue={"stepDefination"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,

        monochrome=true,
        tags={}
        // tags={"@Test1,@Test2"}

)




public class CucumberRunner extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }

}

