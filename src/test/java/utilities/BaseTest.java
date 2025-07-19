package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    protected SoftAssert softAssert;

@BeforeMethod
public void masterSetup(){
    Logs.info("Setup del padre");
    softAssert = new SoftAssert();

}
@AfterMethod
public void masterTearDown(){
    Logs.info("TearDown del padre");
}
}
