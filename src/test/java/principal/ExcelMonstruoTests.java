package principal;

import java.util.List;

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
        System.out.println("Primer monstruo: " + primerMonstruo.getNombre());
    }

    @Test
    public void segundoTest(){
        final var n = monstruos.size();
        System.out.println("El tamaño de la lista de monstrues es " + n);
    }

    @Test
    public void tercerTest(){
        final var tercerMonstruo = monstruos.get(2);
        System.out.println("El nivel del tercer monstruo es: " + tercerMonstruo.getNivel());
    }

    @AfterMethod
    public void tearDown() {
        
    }
}
