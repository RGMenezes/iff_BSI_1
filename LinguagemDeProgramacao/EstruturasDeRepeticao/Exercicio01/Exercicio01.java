package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDigite um número: ");
            soma += entradaDoTeclado.nextDouble();
        }

        System.out.println("\nA soma total desses números é: " + soma);
    }
}

// 1. Prepare um programa para perguntar 10 números e informar a soma total destes números.(Utilizar a
// estrutura de repetição for)