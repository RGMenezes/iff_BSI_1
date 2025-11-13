package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        while (contador < 100) {
            contador++;

            System.out.print("\nDigite um número: ");
            soma += entradaDoTeclado.nextDouble();
        }

        System.out.println("\nA soma total desses números é: " + soma);
    }
}

// 2. Refaça o programa anterior para 100 números.(Utilizar a estrutura de repetição while)