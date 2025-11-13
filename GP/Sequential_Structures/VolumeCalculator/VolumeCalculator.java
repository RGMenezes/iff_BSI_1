package Java.GP.Sequential_Structures.VolumeCalculator;

import java.io.PrintStream;
import java.util.Scanner;

public class VolumeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    Double vHeight, vWidth, vLength, volume;

    print.println("Calculadora de Volume");

    print.print("Digite a altura ou profundidade(m): ");
    vHeight = input.nextDouble();
    
    print.print("Digite a largura(m): ");
    vWidth = input.nextDouble();
    
    print.print("Digite o comprimento(m): ");
    vLength = input.nextDouble();

    volume = vHeight * vWidth * vLength;

    print.print("O sou objeto possui um volume de " + String.format("%.2f", volume) + "m³.");

    input.close();
  }
}
