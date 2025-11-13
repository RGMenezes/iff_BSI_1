package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int anoInserido;

        System.out.print("\nEscreva o ano: ");
        anoInserido = entradaDoTeclado.nextInt();

        boolean anoDivisivelPor4 = anoInserido%4 == 0;
        boolean anoDivisivelPor100 = anoInserido%100 == 0;
        boolean anoDivisivelPor400 = anoInserido%400 == 0;

        if( anoDivisivelPor4 && (!anoDivisivelPor100 || anoDivisivelPor400) ){
            System.out.println("O ano " + anoInserido + " é bissexto.");
        }else{
            System.out.println("O ano " + anoInserido + " não é bissexto.");
        }
    }
}

// 10. Fa¸ca um programa que pe¸ca para entrar com um ano com 4 d´ıgitos e determine se o mesmo ´e ou n˜ao bissexto.
// Obs. Resposta em: http://pt.wikipedia.org/wiki/Ano bissexto