package Java.LinguagemDeProgramacao.Matrizes.Exercicio01;

import java.util.Random;

public class Exercicio01 {

    public static void main(String[] args) {
        final int LINHAS = 5;
        final int COLUNAS = 3;
        int matrizA[][] = new int[LINHAS][COLUNAS];
        int matrizB[][] = new int[LINHAS][COLUNAS];
        int matrizC[][] = new int[LINHAS][COLUNAS];

        PreencherMatriz(matrizA, 100);
        PreencherMatriz(matrizB, 100);

        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
                matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }

        System.out.println("Matriz A: " + MostrarMatrix(matrizA));
        System.out.println(" + ");
        System.out.println("Matriz B: " + MostrarMatrix(matrizB));
        System.out.println(" = ");
        System.out.println("Matriz C: " + MostrarMatrix(matrizC));
    }

    static void PreencherMatriz(int[][] matriz, int valorMaximo){
        Random entradaAleatoria = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = entradaAleatoria.nextInt(valorMaximo);
            }
        }
    }

    static String MostrarMatrix(int[][] matriz){
        String mensagem = "[";
        for (int linha = 0; linha < matriz.length; linha++) {
            mensagem += "\n";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                mensagem += " " + matriz[linha][coluna];
            }
        }
        mensagem += "\n]";
        return mensagem;
    }
}

// 1. Faça um programa para ler duas matrizes A e B, cada uma de duas dimensões com 5 linhas e 3 colunas. Construir
// uma matriz C de mesma dimensão, onde C é formada pela soma dos elementos da matriz A com os elementos
// da matriz B.