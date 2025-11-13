package Java.GP.Selection_Structures.StudantAverage;

import java.io.PrintStream;
import java.util.Scanner;

public class StudantAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double note1, note2, average;

    print.print("Nota 1: ");
    note1 = input.nextDouble();

    print.print("Nota 2: ");
    note2 = input.nextDouble();

    average = (note1 * note2) / 2;

    if(average == 10) print.println("Aprovado com Distinção, média +A.");
    else if(average >= 9) print.println("Aprovado, média A.");
    else if(average >= 7.5) print.println("Aprovado, média B.");
    else if(average >= 7) print.println("Aprovado, média +C.");
    else if(average >= 6) print.println("Reprovado, média C.");
    else if(average >= 4) print.println("Reprovado, média D.");
    else print.println("Reprovado, média E.");

    input.close();
  }
}
