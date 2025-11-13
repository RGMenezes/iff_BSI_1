package Java.GP.Selection_Structures.QuadraticEquation;

import java.io.PrintStream;
import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int a, b, c, delta;
    double result1, result2;

    print.print("Qual o valor de A? ");
    a = input.nextInt();

    if (a == 0) {
      System.out.println("O valor de A não pode ser 0 em uma equação de segundo grau.");
    } else {
      print.print("Qual o valor de B? ");
      b = input.nextInt();

      print.print("Qual o valor de C? ");
      c = input.nextInt();

      delta = (b * b) - (4 * a * c);

      if(delta < 0) print.println("Não existem valores reais para as raízes!");
      else if(delta == 0){
        result1 = -((double)b) / (2 * a);
        print.println("Existe somente uma raiz: " + String.format("%.2f", result1));

      }else{
        result1 = (-((double) b) + Math.sqrt(delta)) / (2 * a);
        result2 = (-((double) b) - Math.sqrt(delta)) / (2 * a);

        print.println("X1 = " + String.format("%.2f", result1) + "\nX2 = " + String.format("%.2f", result2));
      }
    }

    input.close();
  }
}