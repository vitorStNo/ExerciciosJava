public class FestaAniversarioInfantil extends FestaAniversario {
    private String personagemFavorito;

    public FestaAniversarioInfantil(String data, String local, String tema, int numeroConvidados, boolean possuiDecoração, String personagemFavorito) {
        super(data, local, tema, numeroConvidados, possuiDecoração);
        this.personagemFavorito = personagemFavorito;
    }

    public String getPersonagemFavorito() {
        return personagemFavorito;
    }

    public void setPersonagemFavorito(String personagemFavorito) {
        this.personagemFavorito = personagemFavorito;
    }

    public void exibirDetalhes() {
        System.out.println("Festa de Aniversário Infantil");
        System.out.println("Data: " + getData());
        System.out.println("Local: " + getLocal());
        System.out.println("Tema: " + getTema());
        System.out.println("Número de Convidados: " + getNumeroConvidados());
        System.out.println("Possui Decoração: " + (isPossuiDecoração() ? "Sim" : "Não"));
        System.out.println("Personagem Favorito: " + personagemFavorito);
    }
}
