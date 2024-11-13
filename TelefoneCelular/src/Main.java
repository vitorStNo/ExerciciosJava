public class Main {
    public static void main(String[] args) {


        TelefoneCelular celular1 = new TelefoneCelular("Galaxy S23", "Samsung", "123456789", 128, true);
        TelefoneCelular celular2 = new TelefoneCelular("iPhone 14", "Apple", "987654321", 256, true);
        TelefoneCelular celular3 = new TelefoneCelular("Moto G60", "Motorola", "555123456", 64, false);
        TelefoneCelular celular4 = new TelefoneCelular("Xperia 1 II", "Sony", "554433221", 128, true);
        TelefoneCelular celular5 = new TelefoneCelular("Redmi Note 11", "Xiaomi", "991122233", 128, true);


        celular1.exibirInformacoes();
        celular2.exibirInformacoes();
        celular3.exibirInformacoes();
        celular4.exibirInformacoes();
        celular5.exibirInformacoes();
    }
}
