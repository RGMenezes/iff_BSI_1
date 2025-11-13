package Java.LinguagemDeProgramacao.Matrizes.Exercicio02;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        final int QUANTIDADE_ELEMENTOS = 7;
        int listaA[] = new int[QUANTIDADE_ELEMENTOS];
        int listaB[] = new int[QUANTIDADE_ELEMENTOS];
        int matriz[][] = new int[QUANTIDADE_ELEMENTOS][2];

        PreencherLista(listaA, 100);
        PreencherLista(listaB, 100);

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = listaA[i];
            matriz[i][1] = listaB[i];
        }

        System.out.println(MostrarMatrix(matriz));
    }

    static void PreencherLista(int[] lista, int valorMaximo){
        Random entradaAleatoria = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = entradaAleatoria.nextInt(valorMaximo);
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

// 2. Faça um programa para ler dois vetores A e B com 7 elementos. Construir uma matriz C de duas dimensões,
// onde a primeira coluna deverá ser formada pelos elementos do vetor A e a segunda pelos elementos do vetor B.