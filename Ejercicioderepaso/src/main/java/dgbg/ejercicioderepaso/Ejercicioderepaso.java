/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.ejercicioderepaso;

import static java.lang.Math.random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuariom
 */
public class Ejercicioderepaso {

    public static void main(String[] args) {
//        fabrica();
//sistema();
//juego();
fabrica2();
    }
    public static void fabrica(){
        //Una fábrica cre materiales radiactivos. Estos materiales se crean mientras que la temperatura no alcance los 80º y la radioactividad no supere los 7º. Esta fábrica va a estar generando piezas, y en cada iteración (vuelta del bucle) genera una pieza en las condiciones anteriormente indicadas. En cada iteración tengo que poner, la temperatura, el índice de radioactividad y si se ha generado la pieza. Al final del todo mostramos la última temperatura alcanzada y el último índice de radioactividad y cuantas piezas hemos fabricado. La temperatura se genera aleatoriamente entre 1 y 100º. El índice de radioactividad se genera aleatoriamente entre 1 y 10º. 
//        System.out.println("MATH.RANDOM");
//        double aleatorio = Math.random();
//        System.out.println(aleatorio + " ");
//        System.out.println("ThreadLocalRandom");
//        int aleatorio2 = ThreadLocalRandom.current().nextInt();
//        System.out.print(aleatorio2 + "\n");
        double temperatura = ThreadLocalRandom.current().nextInt(1,101);
        double radioactividad = ThreadLocalRandom.current().nextInt(1,11); 
        int i = 0;
        while ( temperatura <= 80 && radioactividad <= 7){
            System.out.println("Las condiciones en las que se ha generado la pieza son: " + temperatura + "º y " + radioactividad + "º" );
            System.out.println("Se ha generado la pieza ");
            temperatura = ThreadLocalRandom.current().nextInt(1,101);
            radioactividad = ThreadLocalRandom.current().nextInt(1,11);
            i++;
        } System.out.println("Ya no se puede generar más piezas");
        System.out.println("La temperatura última usada ha sido " + temperatura + " Y la radioactividad ha sido " + radioactividad);
        System.out.println("Hemos creado " + i + " piezas");
       }
    public static void sistema(){
        int numero = ThreadLocalRandom.current().nextInt(1,11);
        int i = 0;
        do{
           System.out.println("Vamos a intentarlo otra vez, pq para entrar al sistema hay que tener el número 7 y solo tienes 5 intentos");
            System.out.println(" El número generado fue " + numero);
            numero = ThreadLocalRandom.current().nextInt(1,11);
            i++;
           if ( numero == 7){
            System.out.println("Haz entrado al sistema informático");
        } 
        }
        while ( numero != 7 && i >= 5);
        
    }
    public static void juego(){
        int vida = 3;
        int dado = ThreadLocalRandom.current().nextInt(1,7);
        int puntos = 0;
        while ( vida < 0 || puntos > 40 ){
            System.out.println("El resultado del dado fue " + dado);
            if (dado == 1){
                vida--;
                puntos = 0;
            }
            if ( dado == 2 ){
            puntos = dado;
        }
            if ( dado == 5){
                puntos = 10;
                System.out.println("Haz conseguio " + puntos + " puntos");
            }
            if ( dado == 6){
                puntos = 15;
                System.out.println("Haz conseguido 15 puntos ");       
            }
            dado = ThreadLocalRandom.current().nextInt(1,7);
        }
    }
    public static void fabrica2(){
        int cunasbuenas = ThreadLocalRandom.current().nextInt();
        int chupetesbuenas = ThreadLocalRandom.current().nextInt();
        int cunas = 0;
        int chupetes = 0;
        while (chupetes < 100 && cunas < 50){
            if (cunasbuenas < 50 ){
                System.out.println("Ha salido defectuosa la pieza de cunas");
            } if ( chupetesbuenas < 20){
                System.out.println("Ha salido defectuosa la pieza de chupetes");
            }
            cunas ++;
        chupetes++;
        cunasbuenas = ThreadLocalRandom.current().nextInt();
        chupetesbuenas = ThreadLocalRandom.current().nextInt();
        }
        System.out.println("se han creado " + chupetes + " chupetes " + " y " + cunas + " cunas");
        
        
    }
        
    }


