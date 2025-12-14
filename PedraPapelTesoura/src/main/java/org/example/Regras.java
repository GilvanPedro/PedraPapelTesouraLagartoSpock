package org.example;

import java.util.Random;

public class Regras {
    private Random rand;
    private int num;

    public Regras() {
        this.rand = new Random();
    }

    public String computador() {
        num = rand.nextInt(5) + 1;

        switch (num) {
            case 1: return "PEDRA";
            case 2: return "PAPEL";
            case 3: return "TESOURA";
            case 4: return "LAGARTO";
            case 5: return "SPOCK";
            default: return "ERRO";
        }
    }

    public String jogoAcontecendo(String tipo) {
        tipo = tipo.toUpperCase();

        if (tipo.equals("SAIR")) {
            return "OBRIGADO POR JOGAR!";
        }

        if (!tipo.equals("PEDRA") &&
                !tipo.equals("PAPEL") &&
                !tipo.equals("TESOURA") &&
                !tipo.equals("LAGARTO") &&
                !tipo.equals("SPOCK")) {
            return "JOGADA INVÁLIDA!";
        }

        String escolhaComputador = computador();
        System.out.println("Escolha do computador: " + escolhaComputador);

        if (tipo.equals(escolhaComputador)) {
            return "EMPATE";
        }

        if (
                (tipo.equals("TESOURA") && escolhaComputador.equals("PAPEL")) ||
                        (tipo.equals("PAPEL") && escolhaComputador.equals("PEDRA")) ||
                        (tipo.equals("PEDRA") && escolhaComputador.equals("LAGARTO")) ||
                        (tipo.equals("LAGARTO") && escolhaComputador.equals("SPOCK")) ||
                        (tipo.equals("SPOCK") && escolhaComputador.equals("TESOURA")) ||

                        (tipo.equals("TESOURA") && escolhaComputador.equals("LAGARTO")) ||
                        (tipo.equals("LAGARTO") && escolhaComputador.equals("PAPEL")) ||
                        (tipo.equals("PAPEL") && escolhaComputador.equals("SPOCK")) ||
                        (tipo.equals("SPOCK") && escolhaComputador.equals("PEDRA")) ||
                        (tipo.equals("PEDRA") && escolhaComputador.equals("TESOURA"))
        ) {
            return "JOGADOR GANHOU";
        }

        return "COMPUTADOR GANHOU";
    }
}
