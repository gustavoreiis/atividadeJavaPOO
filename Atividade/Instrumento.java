package Atividade;

public class Instrumento {
    private String modelo;
    private String tipo;
    private String marca;
    private String cor;
    private String material;
    private boolean eletronico;
    private boolean afinado;

    public Instrumento(String modelo, String marca, String cor, String material, boolean eletronico) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.eletronico = eletronico;
    }

    public void tocar() {
        if (!afinado) {
            System.out.println("Instrumento desafinado. Afine antes de tocar!");
        } else {
            System.out.println("Você tocou o instrumento!");
        }
    }

    public void afinar() {
        if (this.afinado) {
            System.out.println("O instrumento já está afinado.");
        } else {
            System.out.println("Instrumento afinado!");
            this.afinado = true;
        }
    }

    public void obterInformacoes() {
        System.out.println("Você tem um instrumento de " + this.tipo + ".");
        System.out.println("Modelo: " + this.modelo + ";");
        System.out.println("Marca: " + this.marca + ";");
        System.out.println("Cor: " + this.cor + ";");
        System.out.println("Material: " + this.material + ";");
        if (eletronico) {
            System.out.println("O instrumento é eletrônico.");
        } else {
            System.out.println("O instrumento não é eletrônico.");
        }

    }

    // Métodos Especiais
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEletronico() {
        return eletronico;
    }

    public void setEletronico(boolean eletronico) {
        this.eletronico = eletronico;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }
}
