package Java.LinguagemDeProgramacao.Matrizes.Exercicio03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        final int TAMANHO_MATRIZ = 4;
        char matriz[][] = new char[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

        PreencherMatriz(matriz);

        boolean y1 = false, y2 = false;
        int entradaL = -1, entradaC = -1, y1Linha = -1, y1Coluna = -1, tentativas = 0;
        do {
            do {
                System.out.print("\nEscolha a linha (0 até " + (TAMANHO_MATRIZ - 1) + "): ");
                entradaL = entradaDoTeclado.nextInt();

                System.out.print("Escolha a coluna (0 até " + (TAMANHO_MATRIZ - 1) + "): ");
                entradaC = entradaDoTeclado.nextInt();

                if(entradaL >= TAMANHO_MATRIZ || entradaL < 0 || entradaC < 0 || entradaC >= TAMANHO_MATRIZ){
                    System.out.println("\nValores inválidos!");
                }

            } while (entradaL >= TAMANHO_MATRIZ || entradaL < 0 || entradaC < 0 || entradaC >= TAMANHO_MATRIZ);

            if(matriz[entradaL][entradaC] == 'x'){
                System.out.println("\nPosição errada, tente novamente!");
            }else{
                if(y1Linha == -1 && y1Coluna == -1){
                    System.out.println("Você descobriu o primeiro alvo!");
                    y1Linha = entradaL;
                    y1Coluna = entradaC;
                    y1 = true;
                }else{
                    if(y1Linha == entradaL && y1Coluna == entradaC){
                        System.out.println("Você já achou esse alvo!");
                    }else{
                        y2 = true;
                    }

                }
            }

            tentativas++;
        } while (!(y1 && y2));

        System.out.println("\nParabéns, você acertou o alvo!\nTentativas: " + tentativas);
    }

    static void PreencherMatriz(char[][] matriz){
        Random entradaAleatoria = new Random();
        int linhaAlvo1, colunaAlvo1, linhaAlvo2, colunaAlvo2;

        do {
            linhaAlvo1 = entradaAleatoria.nextInt(matriz.length);
            colunaAlvo1 = entradaAleatoria.nextInt(matriz[0].length);
            linhaAlvo2 = entradaAleatoria.nextInt(matriz.length);
            colunaAlvo2 = entradaAleatoria.nextInt(matriz[0].length);
        } while (linhaAlvo1 == linhaAlvo2 && colunaAlvo1 == colunaAlvo2);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if(linha == linhaAlvo1 && coluna == colunaAlvo1){
                    matriz[linha][coluna] = 'y';
                }else{
                    if(linha == linhaAlvo2 && coluna == colunaAlvo2){
                        matriz[linha][coluna] = 'y';
                    }else{
                        matriz[linha][coluna] = 'x';                    
                    }
                }
            }
        }
    }

}

// 3. Faça um programa para criar uma matriz de dimensões 4x4 do tipo char. Inicialize todas as posições da matriz
// com a letra x. Em seguida dois caracteres y deverão ser inseridos na matriz em posições aleatórias sem que
// o usuário saiba onde.Crie uma repetição para permitir ao usuário entrar com coordenadas da matriz visando
// acertar em quais posições da matriz foram colocados os caracteres y. Quando um y for localizado informe ao
// usuário que ele acertou. Ao final informe o número de tentativas que foram necessárias para descobrir as posições
// dos caracteres y.