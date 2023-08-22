public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Clube da luta";
        meuFilme.anoDeLancamento =   2002;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
    }
}
