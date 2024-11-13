public abstract class FestaAniversario {

    private String data;
    private String local;
    private String tema;
    private int numeroConvidados;
    private boolean possuiDecoração;


    public FestaAniversario(String data, String local, String tema, int numeroConvidados, boolean possuiDecoração) {
        this.data = data;
        this.local = local;
        this.tema = tema;
        this.numeroConvidados = numeroConvidados;
        this.possuiDecoração = possuiDecoração;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public boolean isPossuiDecoração() {
        return possuiDecoração;
    }

    public void setPossuiDecoração(boolean possuiDecoração) {
        this.possuiDecoração = possuiDecoração;
    }


    public abstract void exibirDetalhes();
}

