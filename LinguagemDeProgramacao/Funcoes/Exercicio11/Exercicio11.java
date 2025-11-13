package Java.LinguagemDeProgramacao.Funcoes.Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int anoInserido;

        System.out.print("\nEscreva o ano: ");
        anoInserido = entradaDoTeclado.nextInt();

        System.out.println(VerificadorAnoBissexto(anoInserido));
    }

    static String VerificadorAnoBissexto(int ano){
        String mansagem;
        boolean anoDivisivelPor4 = ano%4 == 0;
        boolean anoDivisivelPor100 = ano%100 == 0;
        boolean anoDivisivelPor400 = ano%400 == 0;

        if( anoDivisivelPor4 && (!anoDivisivelPor100 || anoDivisivelPor400) ){
            mansagem = "O ano " + ano + " é bissexto.";
        }else{
            mansagem = "O ano " + ano + " não é bissexto.";
        }

        return mansagem;
    }
}

// 11. Escreva uma função que receba um ano com 4 dı́gitos e retorne se o ano é ou não bissexto.