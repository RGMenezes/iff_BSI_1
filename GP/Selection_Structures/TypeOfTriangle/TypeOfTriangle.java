package Java.GP.Selection_Structures.TypeOfTriangle;

import java.io.PrintStream;
import java.util.Scanner;

public class TypeOfTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int a, b, c;

    print.print("Lado A: ");
    a = input.nextInt();

    print.print("Lado B: ");
    b = input.nextInt();

    print.print("Lado C: ");
    c = input.nextInt();

    if(a >= b + c) print.println("Nenhum triângulo é formado.");
    else if(a*2 == b*2 + c*2) print.println("Triângulo retângulo é formado.");
    else if(a*2 > b*2 + c*2) print.println("Triângulo obtusângulo é formado.");
    else if(a*2 < b*2 + c*2) print.println("Triângulo acutângulo é formado.");
    else print.println("Algo de errado não esta certo!");

    input.close();
  }
}
