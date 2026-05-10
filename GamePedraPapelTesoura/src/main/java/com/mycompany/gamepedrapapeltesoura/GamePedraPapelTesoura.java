package com.mycompany.gamepedrapapeltesoura;

import java.util.Scanner;

public class GamePedraPapelTesoura {
    public static void main(String[] args) {
        System.out.println("Jogo Papel, Pedra e Tesoura!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura");
        System.out.print("Digite a sua escolha: ");
        int usuario = scanner.nextInt();

        if (usuario < 0 || usuario > 2) {
        System.out.println("Escolha inválida! Tente novamente.");
            return;
        }

        int computador = randInt(0, 2);

    // Mostrar escolhas
        System.out.println("Você escolheu: " + escolha(usuario));
        System.out.println("O computador escolheu: " + escolha(computador));

    // Determinar o vencedor
        if (usuario == computador) {
            System.out.println("Empate!");
        } else if ((usuario == 0 && computador == 2) || 
                   (usuario == 1 && computador == 0) || 
                   (usuario == 2 && computador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }

        scanner.close();
    }

    // Função para gerar número aleatório
    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    // Função para transformar número em texto
    public static String escolha(int num) {
        switch (num) {
            case 0: return "Pedra";
            case 1: return "Papel";
            case 2: return "Tesoura";
            default: return "Inválido";
        }
    }
}