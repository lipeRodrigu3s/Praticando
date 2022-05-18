package Exemplos;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int repeticoes;
        int numero;
        int cont = 0;
        int quantPar = 0;
        int quantImpar = 0;

        System.out.println("Quantos numeros serão mostrados? ");
        repeticoes = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPar++;
            else quantImpar++;

            cont++;


        } while (cont < repeticoes);

        System.out.println("Quantidade de pares: " + quantPar);
        System.out.println("Quantidade de impares: " + quantImpar);






    }
}
