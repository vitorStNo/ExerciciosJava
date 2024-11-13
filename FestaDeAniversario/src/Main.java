public class Main {
    public static void main(String[] args) {


        FestaAniversarioInfantil festa1 = new FestaAniversarioInfantil("12/12/2024", "Salão de Festas", "Circo", 30, true, "Palhaço");
        FestaAniversarioInfantil festa2 = new FestaAniversarioInfantil("15/01/2025", "Casa da Vovó", "Unicórnio", 15, true, "Unicórnio");
        FestaAniversarioInfantil festa3 = new FestaAniversarioInfantil("08/03/2025", "Clube", "Super-heróis", 40, true, "Homem-Aranha");
        FestaAniversarioInfantil festa4 = new FestaAniversarioInfantil("20/04/2025", "Espaço Kids", "Fazenda", 25, false, "Peppa Pig");
        FestaAniversarioInfantil festa5 = new FestaAniversarioInfantil("25/05/2025", "Playland", "Pirata", 20, true, "Pirata");


        festa1.exibirDetalhes();
        festa2.exibirDetalhes();
        festa3.exibirDetalhes();
        festa4.exibirDetalhes();
        festa5.exibirDetalhes();
    }
}
