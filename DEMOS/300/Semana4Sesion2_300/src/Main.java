import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random azar = new Random();
       
       String nombre;
       int n1, n2;
       int numeros[] = new int[5];
       int notas[][]= new int[15][3]; //[fila][columna]
       numeros[0]=10;
       numeros[1]=15;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");   
        }
        for (int f = 0; f < 15; f++) {
            for (int c = 0; c < 3; c++) {
                notas[f][c] = azar.nextInt(0, 101);
            }
        }
        
         for (int f = 0; f < 15; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(notas[f][c]+" ");
            }
             System.out.println("");
        }
       
//        System.out.print("Cual es tu nombre? ");
//        nombre = input.nextLine();
//        
//        System.out.println("Hola "+ nombre + "!");
//        
//        System.out.println("Ingresa dos numeros y los sumare");
//        System.out.print("N1:");
//        n1 = input.nextInt();
//        System.out.print("N2:");
//        n2= input.nextInt();
//        int suma = n1 + n2;
//        System.out.println("La suma es " + suma);
        
        
    }
    
}
