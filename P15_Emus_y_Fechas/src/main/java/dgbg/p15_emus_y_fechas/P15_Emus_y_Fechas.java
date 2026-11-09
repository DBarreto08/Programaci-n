/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.p15_emus_y_fechas;

/**
 *
 * @author usuariom
 */
public class P15_Emus_y_Fechas {
    //En este espacio declaro los enum 
    enum DiasSemana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SADADO, DOMINGO
    }
    public static void main(String[] args) {
        DiasSemana dia = DiasSemana.LUNES;
        
        //Esto no va a funcionar
        dia = "LUNES";
        dia = DiasSemana.LUuNES;
        
        
    }
}
