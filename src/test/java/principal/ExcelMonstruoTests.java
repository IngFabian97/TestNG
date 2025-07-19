package principal;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.modelos.Monstruo;
import com.testng.reader.ExcelReader;

import utilities.BaseTest;

public class ExcelMonstruoTests extends BaseTest{

    private List<Monstruo> monstruos;

    @BeforeMethod
    public void setUp() {
        monstruos = ExcelReader.obtenerListaMonstruos();
    }

    @Test
    public void primerTest(){
        final var primerMonstruo = monstruos.get(0);
        Assert.assertEquals(primerMonstruo.getNombre(), "TOLOSA", "El nombre del primer monstruo no es el esperado");
    }

    @Test
    public void segundoTest(){
        final var n = monstruos.size();
        Assert.assertEquals(n, 14, "El número de monstruos no es el esperado");
    }

    @Test
    public void tercerTest(){
        final var tercerMonstruo = monstruos.get(2);
        Assert.assertEquals(tercerMonstruo.getNivel(),"22", "El nivel del tercer monstruo no es el esperado");
    }

    @AfterMethod
    public void tearDown() {
        
    }
}
