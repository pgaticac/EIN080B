package arreglos;

public class Main {

    public static void main(String[] args) {
        //1. Declaración
        int[] numeros;

        //2. Construcción
        numeros = new int[10];

        //numeros[0] = 10;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 10;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ "|");
        }
        System.out.println("");
        //Matriz
        int[][] matriz = new int[3][3];
        int x = 10;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz[f][c]= x;
                x+=10;
            }
            
        }
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[f][c]+ " ");
            }
            System.out.println("");
        }
        
       
    }

}
