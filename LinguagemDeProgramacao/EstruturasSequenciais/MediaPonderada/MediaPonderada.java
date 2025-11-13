package Java.LinguagemDeProgramacao.EstruturasSequenciais.MediaPonderada;

import java.util.Scanner;

public class MediaPonderada {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    double valorPeso1, valorPeso2, valorPeso3, mediaPonderada;

    System.out.print("\nInforme o valor de peso 1: ");
    valorPeso1 = entradaDoTeclado.nextDouble();

    System.out.print("Informe o valor de peso 2: ");
    valorPeso2 = entradaDoTeclado.nextDouble();

    System.out.print("Informe o valor de peso 3: ");
    valorPeso3 = entradaDoTeclado.nextDouble();

    mediaPonderada = (valorPeso1 + valorPeso2*2 + valorPeso3*3) / 6;

    System.out.println("\nValor da média ponderada: " + String.format("%.2f", mediaPonderada));

    entradaDoTeclado.close();
  }
}

// 7. Implemente um programa que lˆe trˆes valores e calcule a m´edia ponderada para pesos 1, 2 e 3, respectivamente
// (multiplique cada nota pelo seu peso, some os produtos e divida o resultado pela soma dos pesos).