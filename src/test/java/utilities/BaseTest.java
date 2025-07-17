package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
@BeforeMethod
public void masterSetup(){
    Logs.info("Setup del padre");

}
@AfterMethod
public void masterTearDown(){
    Logs.info("TearDown del padre");
}
}
