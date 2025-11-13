package Java.LinguagemDeProgramacao.EstruturasSequenciais.CalculadoraDeVolume;

import java.util.Scanner;

public class CalculadoraDeVolume {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    double larguraDaCaixaDeAgua, alturaDaCaixaDeAgua, comprimentoDaCaixaDeAgua, volumeDaCaixaDeAgua;

    System.out.print("Largura da caixa d'água(m): ");
    larguraDaCaixaDeAgua = entradaDoTeclado.nextDouble();
    
    System.out.print("Comprimento da caixa d'água(m): ");
    comprimentoDaCaixaDeAgua = entradaDoTeclado.nextDouble();
    
    System.out.print("Altura da caixa d'água(m): ");
    alturaDaCaixaDeAgua = entradaDoTeclado.nextDouble();

    volumeDaCaixaDeAgua = larguraDaCaixaDeAgua * alturaDaCaixaDeAgua * comprimentoDaCaixaDeAgua;

    System.out.println("\nVolume da caixa d'água: " + String.format("%.2f", volumeDaCaixaDeAgua) + "m³.");

    entradaDoTeclado.close();
  }
}

// 3. Fa¸ca um Programa que pe¸ca o comprimento a largura e a altura de uma caixa d’´agua retangular. Calcule e
// informe o volume da caixa.