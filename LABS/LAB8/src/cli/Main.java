package cli;

import clases.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alumnos_IBT
 */
public class Main {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Mascota m1 = new Mascota("Mochi");
        int op = 0;
        do {
            System.out.println("PetCare - Mascota Virtual");
            System.out.println(m1);
            menu();
            op = read.nextInt();
            switch (op) {
                case 1:
                    m1.alimentar();
                    break;
                case 2:
                    m1.jugar();
                    break;
                case 3:
                    m1.descansar();
                    break;
            }
        } while (op != 4);

    }

    public static void menu() {
        System.out.println("1. Alimentar");
        System.out.println("2. Jugar");
        System.out.println("3. Descansar");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
    }
}
