package Atividade;

public class Violao extends Instrumento {
    private String tipoCorda;
    private boolean capotraste;

    public Violao(String modelo, String marca, String cor, String material, boolean eletronico, String tipoCorda) {
        super(modelo, marca, cor, material, eletronico);
        this.tipoCorda = tipoCorda;
        this.setTipo("Corda");
    }

    public void informacoesViolao() {
        this.obterInformacoes();
        System.out.println("O violão tem cordas de " + this.tipoCorda);
        if (capotraste) {
            System.out.println("O violão está com capotraste;");
        } else {
            System.out.println("O violão não está com capotraste;");
        }
    }

    public void trocarCordas() {
        System.out.println("As cordas foram trocadas!");
    }

    public void tocarAcorde() {
        if (!this.isAfinado()) {
            System.out.println("O violão está desafinado.");
        } else {
            System.out.println("Você tocou um acorde!");
        }
    }

    public void colocarCapo() {
        if (this.capotraste) {
            System.out.println("O violão já está com o capotraste.");
        } else {
            System.out.println("Capotraste colocado.");
            this.setCapotraste(true);
        }
    }

    public void tirarCapo() {
        if (capotraste) {
            System.out.println("Capotraste removido.");
            this.setCapotraste(false);
        } else {
            System.out.println("O violão já está sem capotraste.");
        }
    }


    // Métodos Especiais


    public boolean isCapotraste() {
        return capotraste;
    }

    public void setCapotraste(boolean capotraste) {
        this.capotraste = capotraste;
    }

    public String getTipoCorda() {
        return tipoCorda;
    }

    public void setTipoCorda(String tipoCorda) {
        this.tipoCorda = tipoCorda;
    }
}
