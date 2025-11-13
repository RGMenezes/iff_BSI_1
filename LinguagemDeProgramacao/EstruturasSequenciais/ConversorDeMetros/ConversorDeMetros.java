package Java.LinguagemDeProgramacao.EstruturasSequenciais.ConversorDeMetros;

import java.util.Scanner;

public class ConversorDeMetros {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    double valorEmMetros, valorEmCentimetros = 0;

    System.out.print("Digite o valor a ser convertido(m): ");
    valorEmMetros = entradaDoTeclado.nextDouble();

    valorEmCentimetros = valorEmMetros * 100;

    System.out.print("\n" + valorEmMetros + " metros são ");
    System.out.println(valorEmCentimetros + " centímetros.");

    entradaDoTeclado.close();
  }
}

// 2. Faça um programa que converta uma medida de metros para centímetros.