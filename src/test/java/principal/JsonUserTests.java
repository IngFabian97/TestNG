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

    @Test
    public void cuartoTest() {
        softAssert.assertEquals(user.getName(),"Mrs. Dennis Schulist", "El nombre del usuario no es el esperado");
        softAssert.assertEquals(user.getId(),6, "El ID del usuario no es el esperado");
        softAssert.assertEquals(user.getUsername(),"Leopoldo_Corkery", "El username del usuario no es el esperado");
        softAssert.assertEquals(user.getEmail(),"Karley_Dach@jasper.info", "El email del usuario no es el esperado");
        softAssert.assertAll();

        }

    @AfterMethod
    public void tearDown() {
        
    }

}
