package POO;

public class Principal {
    public static void main(String[] args) {


        Livro livro = new Livro();

        livro.setNumPaginas(9);
        livro.setDataLancamento("25/02/1999");
        System.out.println("O livro tem " + livro.numPaginas + " paignas " + "e foi lançado em " + livro.dataLancamento);

    }
}
