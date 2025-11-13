package Java.GP.Sequential_Structures.AntecedentAndSuccessor;

import java.io.PrintStream;
import java.util.Scanner;

public class AntecedentAndSuccessor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int value;

    print.print("Escreva um número inteiro: ");
    value = input.nextInt();

    print.println("Antecessor " + (value - 1) + " < " + value + " > " + (value + 1) + " sucessor.");

    input.close();
  }
}
