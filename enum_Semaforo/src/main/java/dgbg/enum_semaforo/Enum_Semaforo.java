/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.enum_semaforo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuariom
 */
public class Enum_Semaforo {
    enum semaforo {
        VERDE, AMARILLO, ROJO
    }
    public static void main(String[] args) {
       semaforo actuación = procedimiento();
        System.out.println("El color del semáforo es: " + actuación);
       switch (actuación){
           case VERDE: System.out.println("Adelante, puedes seguir");
           break;
           case AMARILLO: System.out.println("Ten cuidado");
           break;
           case ROJO: System.out.println("PARATE!!");
           break;
           
       }
    }
    public static semaforo procedimiento(){
        
        int posicion = ThreadLocalRandom.current().nextInt(0,3);
        semaforo color = semaforo.values()[posicion];
        return color;
    }
}
