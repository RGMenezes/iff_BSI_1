package Java.LinguagemDeProgramacao.EstruturasSequenciais.CalculadoraDeIMC;

import java.util.Scanner;

public class CalculadoraDeIMC {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    double pesoDoUsuario, alturaDoUsuario, indiceDeMassaCorporal;

    System.out.print("\nQual a sua altura (m)? ");
    alturaDoUsuario = entradaDoTeclado.nextDouble();

    System.out.print("\nQual a sua peso (Kg)? ");
    pesoDoUsuario = entradaDoTeclado.nextDouble();

    indiceDeMassaCorporal = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);

    System.out.println("\nSeu indice de massa corporal é " + String.format("%.2f", indiceDeMassaCorporal));

    entradaDoTeclado.close();
  }
}

// 8. Dado o peso e a altura do usu´ario imprima seu ´Indice de Massa Corporal. IMC = peso/altura2