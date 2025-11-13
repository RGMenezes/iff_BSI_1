package Java.LinguagemDeProgramacao.Vetores.Exercicio02;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Random entradaAleatoria = new Random();
        int vetorA[] = new int[20];
        int vetorB[] = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = entradaAleatoria.nextInt(100);
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[vetorA.length - 1 - i] = vetorA[i];
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}

// 2. Faça um programa que leia 20 elementos de um vetor A e construa um vetor B com os mesmos elementos de A,
// sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo
// de A passa a ser o penúltimo de B e assim por diante.