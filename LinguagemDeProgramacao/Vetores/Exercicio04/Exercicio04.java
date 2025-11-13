package Java.LinguagemDeProgramacao.Vetores.Exercicio04;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Random entradaAleatoria = new Random();
        int vetor[] = new int[50];
        int maiorValor = 0;

        for (int i = 0; i < vetor.length; i++) {
            int valor = entradaAleatoria.nextInt(100);
            vetor[i] = valor;
            if(valor > maiorValor){
                maiorValor = valor;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.print("Posições na lista: ");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == maiorValor){
                System.out.print(i + " ");
            }
        }
    }
}

// 4. Ler um vetor com 50 números. Informar a posição em que está o maior número. Se o maior número existir mais
// de uma vez, informe todas as posições onde existir este número.