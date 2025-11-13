package Java.LinguagemDeProgramacao.Funcoes.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.print("Digite em valor: ");
        int valor = entradaDoTeclado.nextInt();

        System.out.println(ParImpar(valor));
    }

    static String ParImpar(int valor){
        String retorno;
        if(valor % 2 == 0){
            retorno = "Par";
        }else{
            retorno = "Ímpar";
        }
        return retorno;
    }
}

// 6. Escreva uma função que receba um número inteiro e retorne se ele é PAR ou ÍMPAR.