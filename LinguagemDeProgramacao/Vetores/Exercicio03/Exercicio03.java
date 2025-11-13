package Java.LinguagemDeProgramacao.Vetores.Exercicio03;

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random entradaAleatoria = new Random();
        double media = 0;
        int vetor[] = new int[200];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entradaAleatoria.nextInt(100);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            media += vetor[i];
        }

        media = media / vetor.length;
        System.out.printf("\n\nMédia: %.0f\n", media);

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > media){   
                System.out.println("\nValor: " + vetor[i]);
                System.out.println("Posição: " + i);
            }
        }
    }
}

// 3. Prepare um programa para ler um vetor com 200 números. Depois desta leitura você deve calcular a média
// destes números. Seu programa deverá informar a posição e o valor de todos os números que ficaram acima desta
// média.