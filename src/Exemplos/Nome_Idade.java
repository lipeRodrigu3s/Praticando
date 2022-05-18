package Exemplos;

import java.util.Objects;
import java.util.Scanner;

public class Nome_Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Nome do aluno: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade do aluno");
            idade = scan.nextInt();
        }
        System.out.println("Acaba aqui");


    }
}
