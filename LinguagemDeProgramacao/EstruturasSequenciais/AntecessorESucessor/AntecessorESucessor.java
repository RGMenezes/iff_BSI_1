package Java.LinguagemDeProgramacao.EstruturasSequenciais.AntecessorESucessor;

import java.util.Scanner;

public class AntecessorESucessor {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    int valorInicial, antecessor, sucessor;

    System.out.print("Digite um número inteiro: ");
    valorInicial = entradaDoTeclado.nextInt();

    antecessor = valorInicial - 1;
    sucessor = valorInicial + 1;

    System.out.println("\nNúmero informado: " + valorInicial);
    System.out.println("Antecessor: " + antecessor);
    System.out.println("Sucessor: " + sucessor);
    
    entradaDoTeclado.close();
  }
}

// 6. Leia um n´umero inteiro e imprima o seu antecessor e o seu sucessor.