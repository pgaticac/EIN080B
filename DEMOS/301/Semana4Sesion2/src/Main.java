import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String nombre;
        
        int n1, n2;
        
        int numeros[] = new int[5];
        int notas[][] = new int[15][3]; // [filas][columnas]
        
        byte unByte;
        int unInt;
        long unLong;
        char unChar = '1';
        String unString = "12";
        
        unByte = 5;
        unLong = 150000000;
        
        unInt = unByte;         //Conversión Implícita
        unInt = (int) unLong;   //Conversión Explícita - Casting
        unInt = unChar;
        unInt = Integer.parseInt(unString); //Conversión Explícita - Parsing (de caracter a número)
        unLong = Long.parseLong(unString);
        
//        System.out.println("Cual es tu nombre? ");
//        nombre = read.nextLine();
//        System.out.println("Hola, " + nombre + "!");
        
//        System.out.println("Ingresa dos numeros para sumar");
//        System.out.print("N1: ");
//        n1 = read.nextInt();
//        System.out.print("N2: ");
//        n2 = read.nextInt();
//        
//        int suma = n1 + n2;
//        
//        System.out.println("La suma es : " + suma);
        
        
        numeros[0]= 10;
        numeros[1]= 15;
        
        System.out.println("Imprimiendo arreglo de largo " + numeros.length);
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
    
}
