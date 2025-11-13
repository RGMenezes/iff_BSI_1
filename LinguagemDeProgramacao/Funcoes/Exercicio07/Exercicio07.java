package Java.LinguagemDeProgramacao.Funcoes.Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.print("Digite em valor: ");
        int valor = entradaDoTeclado.nextInt();

        System.out.println(MultiploDe3(valor));
    }

    static String MultiploDe3(int valor){
        String retorno;
        if(valor % 3 == 0){
            retorno = "É multiplo.";
        }else{
            retorno = "Não é multiplo.";
        }
        return retorno;
    }
}

// 7. Desenvolva uma função que receba um número e retorne se ele é ou não múltiplo de 3.