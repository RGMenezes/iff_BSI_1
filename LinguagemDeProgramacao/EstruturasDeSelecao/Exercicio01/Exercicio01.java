package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int valorInserido;

        System.out.print("\nInsira o valor a ser analisado: ");
        valorInserido = entradaDoTeclado.nextInt();

        if(valorInserido > 0){
            System.out.println(valorInserido + " é positivo.");
        }else{
            if(valorInserido == 0){
                System.out.println(valorInserido + " é nulo.");
            }else{
                System.out.println(valorInserido + " é negativo.");
            }
        }
    }
}

// 1. Fa¸ca um programa que pe¸ca um valor e mostre na tela se o valor ´e positivo, negativo ou nulo.