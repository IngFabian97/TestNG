package principal;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.modelos.Monstruo;
import com.testng.reader.ExcelReader;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utilities.BaseTest;

public class ExcelMonstruoTests extends BaseTest{

    private List<Monstruo> monstruos;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        monstruos = ExcelReader.obtenerListaMonstruos();
    }

    @Test(groups = {"regression", "smoke"})
    @Description("Verifica el nombre del primer monstruo")
    @Severity(SeverityLevel.BLOCKER)
    public void primerTest(){
        final var primerMonstruo = monstruos.get(0);
        Assert.assertEquals(primerMonstruo.getNombre(), "TOLOSA", "El nombre del primer monstruo no es el esperado");
    }

    @Test(groups = {"regression", "smoke"})
    @Description("Verifica el número total de monstruos")
    @Severity(SeverityLevel.CRITICAL)
    public void segundoTest(){
        final var n = monstruos.size();
        Assert.assertEquals(n, 14, "El número de monstruos no es el esperado");
    }

    @Test (groups = {"regression"})
    @Description("Verifica el nivel del tercer monstruo")
    @Severity(SeverityLevel.NORMAL)
    public void tercerTest(){
        final var tercerMonstruo = monstruos.get(2);
        Assert.assertEquals(tercerMonstruo.getNivel(),22, "El nivel del tercer monstruo no es el esperado");
    }

    @Test(groups = {"regression"})
    @Description("Verifica los detalles del último monstruo")
    @Severity(SeverityLevel.MINOR)
    public void cuartoTest(){
         final var ultimoMonstruo = monstruos.get(monstruos.size() - 1);

        softAssert.assertEquals(ultimoMonstruo.getNombre(), "LUCENA", "El nombre del último monstruo no es el esperado");
        softAssert.assertEquals(ultimoMonstruo.getEdad(), 3, "La edad del último monstruo no es la esperada");
        softAssert.assertEquals(ultimoMonstruo.getPeso(), 8.57, "El peso del último monstruo no es el esperado");
        softAssert.assertEquals(ultimoMonstruo.getGenero(), "MACHO", "El género del último monstruo no es el esperado");
        softAssert.assertEquals(ultimoMonstruo.getTipo(), "PLANTA", "El tipo del último monstruo no es el esperado");
        softAssert.assertEquals(ultimoMonstruo.getNivel(), 36, "El nivel del último monstruo no es el esperado");
        softAssert.assertAll();
        
    }

    @Test(dataProvider = data.CustomData.DP_NAME, dataProviderClass = data.CustomData.class, groups = {"regression"})
    @Description("Verifica la edad y nivel de un monstruo proporcionado por el DataProvider")
    @Severity(SeverityLevel.TRIVIAL)
    public void quintoTest(Monstruo monstruo){
        softAssert.assertTrue(monstruo.getEdad() > 0, "La edad del monstruo debe ser mayor que 0");
        softAssert.assertTrue(monstruo.getNivel() < 1000, "El nivel del monstruo debe ser menor que 1000");
        softAssert.assertAll();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        
    }
}
