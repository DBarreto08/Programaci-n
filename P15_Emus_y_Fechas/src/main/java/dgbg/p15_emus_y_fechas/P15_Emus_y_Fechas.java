/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.p15_emus_y_fechas;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class P15_Emus_y_Fechas {
    //En este espacio declaro los enum 
    enum DiasSemana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        DiasSemana dia = pideDia();
        if (dia != null){
        switch (dia){
            case LUNES: System.out.println("Hoy es Lunes");
                        break;
            case MARTES: System.out.println("Hoy es Martes");
                        break;
            case MIERCOLES: System.out.println("Hoy es Miércoles");
                        break;
            case JUEVES: System.out.println("Hoy es Jueves");
                        break;
            case VIERNES: System.out.println("Hoy es Viernes");
                        break;
            case SABADO: System.out.println("Hoy es Sabado");
                        break;
            case DOMINGO: System.out.println("Hoy es Domingo");
                        break;
        }
        }
        //Esto no va a funcionar
//        dia = "LUNES";
//        dia = DiasSemana.LUuNES;
        
        
    }
    public static DiasSemana pideDia(){
        DiasSemana dia;
        System.out.println("Dime que día de la semana estamos ");
        String miDia = keyboard.next();
        //Convierto el strih en un DiasSemana
        try {
            dia = DiasSemana.valueOf(miDia.toUpperCase());
        } catch (IllegalArgumentException error){
            System.out.println("Te has equivocado. Revísalo");
            dia = null;
        }
       return dia;
    }
}
