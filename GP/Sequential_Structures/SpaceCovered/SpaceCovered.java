package Java.GP.Sequential_Structures.SpaceCovered;

import java.io.PrintStream;
import java.util.Scanner;

public class SpaceCovered {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int So, V, T, result;

    print.print("Qual o espaço inicial do objeto(m): ");
    So = input.nextInt();

    print.print("Qual a velocidade do objeto (m/s): ");
    V = input.nextInt();

    print.print("Qual o tempo de deslocamento do objeto(s): ");
    T = input.nextInt();

    result = So + V * T;

    print.println("O espaço percorrido pelo objeto é de " + result + "m.");

    input.close();
  }
}
