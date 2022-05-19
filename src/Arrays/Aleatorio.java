package Arrays;

import java.util.Random;
public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }
        System.out.println("Numero aleatorio: ");
        for (int numero : numAleatorios ) {
            System.out.println(numero);
            
        }
        System.out.println("Sucessores dos numeros aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.println(numero+1 + " ");
            
        }
    }
}
