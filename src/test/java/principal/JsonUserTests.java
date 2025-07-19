package principal;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.modelos.User;
import com.testng.reader.JsonReader;

import utilities.BaseTest;

public class JsonUserTests extends BaseTest {
    private User user;

    @BeforeMethod
    public void setUp() {
        user = JsonReader.leerUsuarioJson();
    }

    @Test
    public void primerTest() {
        Assert.assertTrue(user.getId() > 0);

    }
    
    @Test
    public void segundoTest() {
        Assert.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);
    }

    @Test
    public void tercerTest() {
        System.out.println("El company.bs es: " + user.getCompany().getBs());
        Assert.assertTrue(user.getCompany().getBs().length() > 10);
    }

    @AfterMethod
    public void tearDown() {
        
    }

}
