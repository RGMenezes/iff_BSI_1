package Java.GP.Selection_Structures.LargestNumber;

import java.io.PrintStream;
import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int number1, number2;

    print.print("Digite o primeiro número: ");
    number1 = input.nextInt();

    print.print("Digite o segundo número: ");
    number2 = input.nextInt();

    if(number1 > number2) print.println("O maior número é " + number1 + ".");
    else if(number1 < number2) print.println("O maior número é " + number2 + ".");
    else print.println("Os números são iguais, " + number1 + ".");

    input.close();
  }
}