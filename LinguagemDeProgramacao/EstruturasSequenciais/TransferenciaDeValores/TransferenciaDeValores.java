package Java.LinguagemDeProgramacao.EstruturasSequenciais.TransferenciaDeValores;

import java.util.Scanner;

public class TransferenciaDeValores {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    int valorA, valorB, valorC;

    System.out.print("Valor da variável A (int): ");
    valorA = entradaDoTeclado.nextInt();

    System.out.print("Valor da variável B (int): ");
    valorB = entradaDoTeclado.nextInt();

    valorC = valorA;
    valorA = valorB;
    valorB = valorC;

    System.out.println("\nVariável A = " + valorA);
    System.out.println("Variável B = " + valorB);

    entradaDoTeclado.close();
  }
}

// Fa¸ca um algoritmo para ler os valores para as vari´aveis A e B, e efetuar a troca dos valores de forma que,
// a vari´avel A passe a possuir o valor da vari´avel B e que a vari´avel B passe a possuir o valor da vari´avel A.
// Apresentar os valores trocados.