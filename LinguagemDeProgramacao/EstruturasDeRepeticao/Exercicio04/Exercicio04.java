package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double soma = 0;

        System.out.print("Qual o número máximo para a soma? ");
        int limiteParaASoma = entradaDoTeclado.nextInt();

        for (int i = 0; i < limiteParaASoma; i++) {
            System.out.print("\nDigite um número: ");
            soma += entradaDoTeclado.nextDouble();
        }

        System.out.println("\nA soma total desses números é: " + soma);
    }
}

// 4. Prepare um programa para calcular a soma dos números entre 1 e N inclusive. O valor de N deve ser
// perguntado no inı́cio do programa. (Utilizar a estrutura de repetição for)