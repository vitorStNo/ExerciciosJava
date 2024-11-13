public class TelefoneCelular {


    private String modelo;
    private String marca;
    private String numero;
    private int memoriaInterna;
    private boolean possuiCamera;


    public TelefoneCelular(String modelo, String marca, String numero, int memoriaInterna, boolean possuiCamera) {
        this.modelo = modelo;
        this.marca = marca;
        this.numero = numero;
        this.memoriaInterna = memoriaInterna;
        this.possuiCamera = possuiCamera;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    public boolean isPossuiCamera() {
        return possuiCamera;
    }

    public void setPossuiCamera(boolean possuiCamera) {
        this.possuiCamera = possuiCamera;
    }


    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Número: " + numero);
        System.out.println("Memória Interna: " + memoriaInterna + " GB");
        System.out.println("Possui Câmera: " + (possuiCamera ? "Sim" : "Não"));
    }
}