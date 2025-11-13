package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio02;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        preencherVetor(vetor, -10, 10);
        System.out.println(mostrarVetor(vetor));
        vetor = inverterVetor(vetor);
        System.out.println(mostrarVetor(vetor));
    }

    static int[] inverterVetor(int vetor[]){
        final int TAMANHO = vetor.length;
        int vetorSecundario[] = new int[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            vetorSecundario[i] = vetor[TAMANHO - i - 1];
        }
        return vetorSecundario;
    }

    static void preencherVetor(int vetor[], int min, int max){
        Random entradaAleatoria = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entradaAleatoria.nextInt(max + (-1 * min)) + min;
        }
    }
    
    static String mostrarVetor(int vetor[]){
        String retorno = "";
        for (int i = 0; i < vetor.length; i++) {
            retorno += vetor[i] + " ";
        }
        return retorno;
    }
}

// 2. Implemente uma fun¸c˜ao que receba como parˆametro um vetor de n´umeros inteiros e inverta a ordem dos elementos
// armazenados nesse vetor.