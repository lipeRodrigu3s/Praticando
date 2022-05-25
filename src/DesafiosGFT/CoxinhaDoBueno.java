package DesafiosGFT;

import java.util.Scanner;

public class CoxinhaDoBueno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int participantes;
        int quantCoxinhas;

        System.out.println("Quantos participantes: ");
        participantes = scan.nextInt();

        System.out.println("Quantas coxinhas eles comeram: ");
        quantCoxinhas = scan.nextInt();


        Double media = Double.parseDouble(String.valueOf(quantCoxinhas))%Double.parseDouble(String.valueOf(participantes));
        System.out.println("A média entre os participantes e as coxinhas são: " + media );



    }
}
