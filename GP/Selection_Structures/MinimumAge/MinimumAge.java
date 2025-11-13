package Java.GP.Selection_Structures.MinimumAge;

import java.io.PrintStream;
import java.util.Scanner;

public class MinimumAge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int age;

    print.print("Qual a sua idade? ");
    age = input.nextInt();

    print.println(age > 21 ? "Você tem mais de 21 anos." : "Você tem 21 anos ou menos.");

    input.close();
  }
}
