package principal;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.modelos.User;
import com.testng.reader.JsonReader;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utilities.BaseTest;

public class JsonUserTests extends BaseTest {
    private User user;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        user = JsonReader.leerUsuarioJson();
    }

    @Test (groups = {"regression", "smoke"})
    @Description("Verifica que el ID del usuario sea mayor a 0")
    @Severity(SeverityLevel.BLOCKER)
    public void primerTest() {
        Assert.assertTrue(user.getId() > 0);

    }
    
    @Test(groups = {"regression", "smoke"})
    @Description("Verifica la longitud del campo 'name' del usuario")
    @Severity(SeverityLevel.CRITICAL)   
    public void segundoTest() {
        Assert.assertEquals(user.getAddress().getGeo().getLng(), 71.7478);
    }

    @Test(groups = {"regression"})
    @Description("Verifica que el campo 'company.bs' del usuario tenga más de 10 caracteres")
    @Severity(SeverityLevel.NORMAL)
    public void tercerTest() {
        System.out.println("El company.bs es: " + user.getCompany().getBs());
        Assert.assertTrue(user.getCompany().getBs().length() > 10);
    }

    @Test(groups = {"regression"})
    @Description("Verifica los detalles del usuario")
    @Severity(SeverityLevel.MINOR)
    public void cuartoTest() {
        softAssert.assertEquals(user.getName(),"Mrs. Dennis Schulist", "El nombre del usuario no es el esperado");
        softAssert.assertEquals(user.getId(),6, "El ID del usuario no es el esperado");
        softAssert.assertEquals(user.getUsername(),"Leopoldo_Corkery", "El username del usuario no es el esperado");
        softAssert.assertEquals(user.getEmail(),"Karley_Dach@jasper.info", "El email del usuario no es el esperado");
        softAssert.assertAll();

        }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        
    }

}
