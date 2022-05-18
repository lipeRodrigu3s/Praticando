package Exemplos;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Infome a nota: ");
        nota = scan.nextInt();

        while (nota < 0| nota > 10){
            System.out.println("Nota invalida! Informe uma nota valida: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota valida");

    }
}
