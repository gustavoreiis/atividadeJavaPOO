package Atividade;

public class Teclado extends Instrumento{
    private int numeroTeclas;
    private int volume;
    private boolean teclasSensitivas;


    public Teclado(String modelo, String marca, String cor, String material, boolean eletronico, int numeroTeclas, boolean teclasSensitivas) {
        super(modelo, marca, cor, material, eletronico);
        this.numeroTeclas = numeroTeclas;
        this.volume = 50;
        this.setAfinado(false);
        this.teclasSensitivas = teclasSensitivas;
        this.setTipo("Teclas");
    }

    public void informacoesTeclado() {
        this.obterInformacoes();
        System.out.println("Número de teclas: " + this.numeroTeclas);
        System.out.println("Volume: " + this.volume + "%");
        if (teclasSensitivas) {
            System.out.println("O teclado tem teclas sensitivas.");
        } else {
            System.out.println("O teclado não tem teclas sensitivas.");
        }
    }

    public void tocarNota() {
        System.out.println("Você tocou uma nota!");
    }

    public void aumentarVolume() {
        this.setVolume(this.getVolume() + 5);
        System.out.println("Volume atual: " + this.getVolume() + "%");
    }

    public void diminuirVolume() {
        this.setVolume(this.getVolume() - 5);
        System.out.println("Volume atual: " + this.getVolume() + "%");
    }

    // Métodos Especiais
    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public boolean isTeclasSensitivas() {
        return teclasSensitivas;
    }

    public void setTeclasSensitivas(boolean teclasSensitivas) {
        this.teclasSensitivas = teclasSensitivas;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
