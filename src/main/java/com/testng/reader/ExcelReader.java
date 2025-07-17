package com.testng.reader;

import java.io.File;
import java.util.List;

import com.poiji.bind.Poiji;
import com.testng.modelos.Monstruo;

public class ExcelReader {

    private final static String EXCEL_FILE_PATH = "src/main/resources/data/dataExcel.xlsx";

    public static List<Monstruo> obtenerListaMonstruos(){
        return Poiji.fromExcel(new File(EXCEL_FILE_PATH), Monstruo.class);
    }
}
