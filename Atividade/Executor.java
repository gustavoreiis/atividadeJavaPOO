package Atividade;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!");
        System.out.println("Vamos instanciar um objeto instrumento.");
        System.out.println("Qual instrumento você deseja criar?");
        System.out.println("[ 1 ] Bateria\n[ 2 ] Teclado\n[ 3 ] Violão");
        int instrumento = scanner.nextInt();
        while (instrumento < 1 || instrumento > 3) {
            System.out.println("Instrumento inválido. Tente novamente.");
            instrumento = scanner.nextInt();
        }

        System.out.println("Vamos definir os atributos do objeto!");

        scanner.nextLine();
        System.out.println("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.println("Marca: ");
        String marca = scanner.nextLine();

        System.out.println("Cor: ");
        String cor = scanner.nextLine();

        System.out.println("Material: ");
        String material = scanner.nextLine();

        System.out.println("É eletrônico? [S/N]: ");
        String auxEletronico = scanner.nextLine();
        while (!auxEletronico.equals("S") && !auxEletronico.equals("N")) {
            System.out.println("Opção incálida. Escolha 'S' ou 'N': ");
            auxEletronico = scanner.next();
        }
        boolean eletronico;
        if (auxEletronico.equals("S")) {
            eletronico = true;
        } else {
            eletronico = false;
        }

        int opcao = 0;
        switch (instrumento) {
            case 1:
                System.out.println("Número de Pratos: ");
                int pratos = scanner.nextInt();
                System.out.println("Número de Tambores");
                int caixas = scanner.nextInt();
                Bateria bateria = new Bateria(modelo, marca, cor, material, eletronico, caixas, pratos);

                while (opcao != 6) {
                    System.out.println("[ 1 ] Tocar bateria");
                    System.out.println("[ 2 ] Obter Informações");
                    System.out.println("[ 3 ] Afinar");
                    System.out.println("[ 4 ] Tocar tambor");
                    System.out.println("[ 5 ] Tocar prato");
                    System.out.println("[ 6 ] Finalizar programa");

                    System.out.println("Informe a opção: ");
                    opcao = scanner.nextInt();
                    while (opcao > 6 || opcao < 1) {
                        System.out.println("Opção inválida. Tente novamente!");
                        opcao = scanner.nextInt();
                    }

                    switch (opcao) {
                        case 1:
                            bateria.tocar();
                            break;
                        case 2:
                            bateria.informacoesBateria();
                            break;
                        case 3:
                            bateria.afinar();
                            break;
                        case 4:
                            bateria.tocarTambor();
                            break;
                        case 5:
                            bateria.tocarPrato();
                            break;
                        case 6:
                            break;
                    }
                }
                break;
            case 2:
                System.out.println("Número de teclas: ");
                int teclas = scanner.nextInt();
                System.out.println("Tem teclas sensitivas? ");
                String auxSensitivas = scanner.nextLine();
                while (!auxSensitivas.equals("S") && !auxSensitivas.equals("N")) {
                    System.out.println("Opção inválida. Escolha 'S' ou 'N': ");
                    auxSensitivas = scanner.next();
                }
                boolean sensitivas;
                if (auxEletronico.equals("S")) {
                    sensitivas = true;
                } else {
                    sensitivas = false;
                }
                Teclado teclado = new Teclado(modelo, marca, cor, material, eletronico, teclas, sensitivas);

                while (opcao != 7) {
                    System.out.println("[ 1 ] Tocar teclado");
                    System.out.println("[ 2 ] Obter Informações");
                    System.out.println("[ 3 ] Afinar");
                    System.out.println("[ 4 ] Tocar nota");
                    System.out.println("[ 5 ] Aumentar volume");
                    System.out.println("[ 6 ] Diminuir volume");
                    System.out.println("[ 7 ] Finalizar programa");

                    System.out.println("Informe a opção: ");
                    opcao = scanner.nextInt();
                    while (opcao > 7 || opcao < 1) {
                        System.out.println("Opção inválida. Tente novamente!");
                        opcao = scanner.nextInt();
                    }
                    switch (opcao) {
                        case 1:
                            teclado.tocar();
                            break;
                        case 2:
                            teclado.informacoesTeclado();
                            break;
                        case 3:
                            teclado.afinar();
                            break;
                        case 4:
                            teclado.tocarNota();
                            break;
                        case 5:
                            teclado.aumentarVolume();
                            break;
                        case 6:
                            teclado.diminuirVolume();
                            break;
                        case 7:
                            break;
                    }
                }
                break;
            case 3:
                System.out.println("Tipo de corda: ");
                String corda = scanner.nextLine();
                Violao violao = new Violao(modelo, marca, cor, material, eletronico, corda);

                while (opcao != 8) {
                    System.out.println("---------------------------");
                    System.out.println("[ 1 ] Tocar violão");
                    System.out.println("[ 2 ] Obter Informações");
                    System.out.println("[ 3 ] Afinar");
                    System.out.println("[ 4 ] Tocar acorde");
                    System.out.println("[ 5 ] Trocar cordas");
                    System.out.println("[ 6 ] Colocar capotraste");
                    System.out.println("[ 7 ] Tirar capotraste");
                    System.out.println("[ 8 ] Finalizar programa");
                    System.out.println("---------------------------");

                    System.out.println("Informe a opção: ");
                    opcao = scanner.nextInt();
                    while (opcao > 8 || opcao < 1) {
                        System.out.println("Opção inválida. Tente novamente!");
                        opcao = scanner.nextInt();
                    }

                    switch (opcao) {
                        case 1:
                            violao.tocar();
                            break;
                        case 2:
                            violao.informacoesViolao();
                            break;
                        case 3:
                            violao.afinar();
                            break;
                        case 4:
                            violao.tocarAcorde();
                            break;
                        case 5:
                            violao.trocarCordas();
                            break;
                        case 6:
                            violao.colocarCapo();
                            break;
                        case 7:
                            violao.tirarCapo();
                            break;
                        case 8:
                            break;
                    }
                }
                break;
        }


    }
}
