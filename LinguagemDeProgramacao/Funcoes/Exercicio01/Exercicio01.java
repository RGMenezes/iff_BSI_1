package Java.LinguagemDeProgramacao.Funcoes.Exercicio01;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random entradaAleatoria = new Random();
        final int MAX = 100;
        int valor1 = entradaAleatoria.nextInt(MAX);
        int valor2 = entradaAleatoria.nextInt(MAX);
        int valor3 = entradaAleatoria.nextInt(MAX);

        System.out.println(valor1 + " + " + valor2 + " + " + valor3);
        System.out.println(SomaTresValores(valor1, valor2, valor3));
    }

    static int SomaTresValores(int valor1, int valor2, int valor3){
        return valor1 + valor2 + valor3;
    }
}

// 1. Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argu-
// mentos.