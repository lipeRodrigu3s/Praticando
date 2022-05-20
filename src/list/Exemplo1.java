package list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Crie uma lista com 7 notas: ");

        //Adicionando notas no array
        List<Double> notas = new ArrayList<Double>();
        notas.add(8.0);
        notas.add(9.5);
        notas.add(2.0);
        notas.add(4.0);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(3.0);
        System.out.println(notas);
        System.out.println("A nota 4.0 esta em: " + notas.indexOf(4d));

        //adicionando nota + posição
        System.out.println("Adicionando a nota 7.0 na posição 5: ");
        notas.add(5,7.0);
        System.out.println(notas);

        //Substituindo nota
        System.out.println("Substituindo a nota 2.0 por 7.5: ");
        notas.set(2,7.5);
        System.out.println(notas);

        //Verificando nota
        System.out.println("Verificando se a nota 9.5 existe: " + notas.contains(2.0));


    }
}
