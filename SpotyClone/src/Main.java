public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setNome("Lost in the Fall");
        musica.setAutor("Dying Wish");
        musica.setDuracao(4.05);
        musica.setEstilo("Death Metal");

        System.out.println("- A musica " + musica.getNome() + " Do autor "+ musica.getAutor() + " Tem duração de \n" +
                musica.getDuracao() + " E tem o seu estilo o(a) " + musica.getEstilo());



        Podcast podcast = new Podcast();
        podcast.setNome("#133 Flow com Rodrigo Goes");
        podcast.setAutor("Flow Podcast");
        podcast.setDuracao(60.00);
        podcast.setNumeroEpisodio(133);

        System.out.println("- O podcast " + podcast.getNome() + " do(s) autor(res) "+ podcast.getAutor() + " Tem duração de \n" +
                 + podcast.getDuracao() + " E que está no ep " + podcast.getNumeroEpisodio());




    }
}