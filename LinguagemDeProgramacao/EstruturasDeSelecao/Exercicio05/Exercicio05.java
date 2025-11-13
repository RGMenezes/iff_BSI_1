package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int valorInserido;

        System.out.print("\nInsira o valor a ser analisado: ");
        valorInserido = entradaDoTeclado.nextInt();

        if(valorInserido % 2 == 0){
            System.out.println(valorInserido + " é par.");
        }else{
            System.out.println(valorInserido + " é impar.");
        }
    }
}

// 5. Construa um programa que determine (imprima) se um dado n´umero N inteiro (recebido atrav´es do teclado) ´e
// PAR ou ´IMPAR.