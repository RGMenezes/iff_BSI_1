package Java.GP.Sequential_Structures.BMICalculator;

import java.io.PrintStream;
import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double height, weight;

    print.println("Calculadora IMC");

    print.print("Qual a sua altura?");
    height = input.nextDouble();    

    print.print("Qual o sou peso?");
    weight = input.nextDouble();

    print.println("O sou índice de massa corporal é " + String.format("%.2f", weight / height * 2) + ".");

    input.close();
  }
}