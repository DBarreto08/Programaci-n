/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package dgbg.p10_bucles;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class P10_bucles {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
//buclewhile();
//bucleDoWhile();
//bucleFor();
//contardel0a1conbucleFOR();
//contarde10a1conbucleWHILE();
//contarde10a1conbucleDOWHILE(); 
//numeropares();
//teclear0();
//numerospositivosynegativos();
        menu();
    }

    public static void buclewhile() {
//Escribir del 1 al 3
        System.out.println("BUCLE WHILE");
        int i = 1;
        while (i <= 3) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(""); //Para que se vaya a la línea de abajo 
    }

    public static void bucleDoWhile() {
        System.out.println("BUCLE DOWHILE");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 3);
        System.out.println(" ");
    }

    public static void bucleFor() {
        System.out.println("BUCLE FOR");

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
    }

    //Vas a contar del 10 al 1 
    public static void contardel0a1conbucleFOR() {
        System.out.println("Bucle con FOR");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
    }

    public static void contarde10a1conbucleWHILE() {
        int i = 10;
        System.out.println("Bucle con WHILE");
        while (i >= 1) {

            System.out.print(i + " ");
            i--;

        }
        System.out.println(" ");
    }

    public static void contarde10a1conbucleDOWHILE() {
        int i = 10;
        System.out.println("Bucle con DOWHILE");
        do {

            System.out.print(i + " ");
            i--;
        } while (i >= 1);
    }

    //Mostrar los números pares entre 0 y 10 con el bucle que quieras ( while, dowhile, for)
    public static void numeropares() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    //Pedir números al usuario hasta que teclee un 0, mostrar solo los negativos) 
    public static void teclear0() {
        System.out.println("Te clea un número para salir del juego");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        while (i != 0) {
            if (i < 0) {
                System.out.println("El número negativo: " + i);
            }
            System.out.println("Introduce otro número (0 para terminar):");
            i = keyboard.nextInt();
        }

        System.out.println("Programa terminado.");

        keyboard.close();

    }

    //Igual que el anteriro pero contando el número de positivos, el número de negativos y los múltiplos de 5 
    public static void numerospositivosynegativos() {
        System.out.println("Te clea un número para salir del juego");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        while (i != 0) {
            if (i < 0) {
                System.out.println("El número negativo: " + i);
            } else {
                System.out.println("El número positivo: " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Es múltiplo de 5");
            }
            System.out.println("Introduce otro número (0 para terminar):");
            i = keyboard.nextInt();
        }

        System.out.println("Programa terminado.");

        keyboard.close();
    }

    public static void menu() {
        System.out.println("Dime un número en el 1 y 3");
        int number = keyboard.nextInt();
        
        while (number != 3) {
            if (number == 1) {
                System.out.println("Hello!");
                number = keyboard.nextInt();
            }
            if (number == 2) {
                System.out.println("Goodbys");
                number = keyboard.nextInt();
            }if (number != 3){
                System.out.println("Menu, 1 para entrar, 2 para salir y 3 para terminar");
                number = keyboard.nextInt();
                
            }
        }
        System.out.println("Finish");
    }
}
