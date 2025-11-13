package Java.LinguagemDeProgramacao.Matrizes.Exercicio05;

import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        int matriz[][][] = new int[5][4][2];

        PreencherMatriz(matriz, 100);

        System.out.println("Profundidade1: " + MostrarMatrix(matriz, 0));
        System.out.println("Profundidade2: " + MostrarMatrix(matriz, 1));
    }

    static void PreencherMatriz(int[][][] matriz, int valorMaximo){
        Random entradaAleatoria = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                for (int comprimento = 0; comprimento < matriz[linha][coluna].length; comprimento++) {
                    matriz[linha][coluna][comprimento] = entradaAleatoria.nextInt(valorMaximo);
                }
            }
        }
    }

    static String MostrarMatrix(int[][][] matriz, int profundidade){
        String mensagem = "[";
        for (int linha = 0; linha < matriz.length; linha++) {
            mensagem += "\n";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                mensagem += " " + matriz[linha][coluna][profundidade];
            }
        }
        mensagem += "\n]";
        return mensagem;
    }
}

// 5. Criar um programa que entre com elementos para uma matriz tridimensional inteira com dimensões 5 x 4 x 2.
// Imprima a matriz em dois passos: primeiro a profundidade 0 e depois a profundidade 1.