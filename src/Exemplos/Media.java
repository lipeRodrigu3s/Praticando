package Exemplos;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;

        int soma = 0;


        do{
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;
            cont = cont + 1;
            soma = soma + numero;

        } while (cont < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}

