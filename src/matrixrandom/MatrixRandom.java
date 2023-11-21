
package matrixrandom;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MatrixRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tamano = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Programa que genera numeros aleatorios para llenar una matriz de n*n");
        System.out.println("Ingrese el tamano de la fila");
        int fila = tamano.nextInt();
        System.out.println("Ingrese el tamano de la columnas");
        int columna = tamano.nextInt();

        /*Declare Matrix */
        int[][] matrixRandom = new int[fila][columna];
        
        /*fill the matrix with random numbers between 1 and 50 */
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                matrixRandom[k][l] = rand.nextInt(50);

            }
        }
       
        /*show the matrix*/
        System.out.println("La matriz de numeros aleatorios es: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matrixRandom[i][j] + " ");
            }
            System.out.println();
        }

    }

}
