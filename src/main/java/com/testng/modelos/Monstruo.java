package com.testng.modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("monstruos")
public class Monstruo {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("EDAD")
    private String edad;
    @ExcelCellName("PESO")
    private String peso;
    @ExcelCellName("GENERO")
    private String genero;
    @ExcelCellName("TIPO")
    private String tipo;
    @ExcelCellName("NIVEL")
    private String nivel;
    
    public String getNombre() {
        return nombre;
    }
    public String getEdad() {
        return edad;
    }
    public String getPeso() {
        return peso;
    }
    public String getGenero() {
        return genero;
    }
    public String getTipo() {
        return tipo;
    }
    public String getNivel() {
        return nivel;
    }
    @Override
    public String toString() {
        return "Monstruo [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", genero=" + genero + ", tipo="
                + tipo + ", nivel=" + nivel + "]";
    }   

    

}
