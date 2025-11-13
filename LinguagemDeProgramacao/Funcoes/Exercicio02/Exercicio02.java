package Java.LinguagemDeProgramacao.Funcoes.Exercicio02;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Random entradaAleatoria = new Random();
        int valor = entradaAleatoria.nextInt(100) - 50;

        System.out.println("Valor: " + valor);
        System.out.println("Ele é: " + PositivoOUNegativo(valor));
    }

    static char PositivoOUNegativo(int valor){
        char retorno = ' ';
        if(valor > 0){
            retorno = 'P';
        }else{
            retorno = 'N';
        }

        return retorno;
    }
}

// 2. Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’,
// se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.