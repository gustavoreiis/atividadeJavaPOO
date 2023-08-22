package Atividade;

public class Bateria extends Instrumento{
    private int numeroTambores;
    private int numeroPratos;

    public Bateria(String modelo, String marca, String cor, String material, boolean eletronico, int numeroTambores, int numeroPratos) {
        super(modelo, marca, cor, material, eletronico);
        this.numeroTambores = numeroTambores;
        this.numeroPratos = numeroPratos;
        this.setTipo("Percussão");

    }

    public void tocarPrato() {
        System.out.println("Você tocou uma prato!");
    }

    public void tocarTambor() {
        System.out.println("Você tocou um tambor!");
    }

    public void informacoesBateria() {
        this.obterInformacoes();
        System.out.println("Número de caixas: " + this.numeroTambores);
        System.out.println("Número de pratos: " + this.numeroPratos);
    }

    // Métodos Especiais
    public int getNumeroTambores() {
        return numeroTambores;
    }

    public void setNumeroTambores(int numeroCaixas) {
        this.numeroTambores = numeroCaixas;
    }

    public int getNumeroPratos() {
        return numeroPratos;
    }

    public void setNumeroPratos(int numeroPratos) {
        this.numeroPratos = numeroPratos;
    }
}
