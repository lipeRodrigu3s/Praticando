package Arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        System.out.println("Vetor: ");

        int[] vetor = {8, 7 ,7, 9, 80};
        int cont = 0;
        while (cont < (vetor.length)){
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.println("\nVetor: ");
        for (int i = vetor.length-1;i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }





    }
}
