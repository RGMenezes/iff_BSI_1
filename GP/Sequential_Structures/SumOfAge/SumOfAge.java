package Java.GP.Sequential_Structures.SumOfAge;

import java.io.PrintStream;
import java.util.Scanner;

public class SumOfAge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    short age;

    print.println("Soma das Idades");

    print.print("Digite a sua idade: ");
    age = input.nextShort();

    print.println("A soma das suas idades é " + (age * ((age + 1)/ 2)) + ".");

    input.close();
  }
}