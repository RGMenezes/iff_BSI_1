package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int valorInserido;

        System.out.print("\nDigite um valor: ");
        valorInserido = entradaDoTeclado.nextInt();

        if (valorInserido > 0 && valorInserido < 100) {
            System.out.println(valorInserido + " está dentro do intervalo.");
        }else{
            System.out.println(valorInserido + " não está dentro do intervalo.");
        }
    }
}

// 7. Construa um programa que indique se um n´umero digitado est´a compreendido no intervalo aberto de 0 a 100 (0
// e 100 n˜ao est˜ao na faixa de valores).