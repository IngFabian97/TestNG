package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected SoftAssert softAssert;
    protected final String regression = "regression";
    protected final String smoke = "smoke";

@BeforeMethod(alwaysRun = true)
public void masterSetup(){
    Logs.info("Setup del padre");
    softAssert = new SoftAssert();

}
@AfterMethod(alwaysRun = true)
public void masterTearDown(){
    Logs.info("TearDown del padre");
}
}
