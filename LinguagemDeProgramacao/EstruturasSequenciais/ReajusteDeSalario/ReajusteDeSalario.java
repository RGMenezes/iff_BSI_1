package Java.LinguagemDeProgramacao.EstruturasSequenciais.ReajusteDeSalario;

import java.util.Scanner;

public class ReajusteDeSalario {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    double salarioAtual, percentualDeReajuste, salarioReajustado;

    System.out.print("\nQual o seu salário atual (R$)? ");
    salarioAtual = entradaDoTeclado.nextDouble();

    System.out.print("Qual o percentual de reajuste? ");
    percentualDeReajuste = entradaDoTeclado.nextDouble();

    salarioReajustado = salarioAtual * ((percentualDeReajuste / 100) + 1);

    System.out.println("\nValor do salário reajustado é de " + String.format("%.2f", salarioReajustado) + " reais.");

    entradaDoTeclado.close();
  }
}

// 9. Leia o sal´ario mensal atual de um funcion´ario e o percentual de reajuste. Calcular e escrever o valor do novo
// sal´ario.