package Java.GP.Repetition_Structures.MultiplicationByAddition;

import java.io.PrintStream;
import java.util.Scanner;

public class MultiplicationByAddition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int x, y;
    int sum  = 0;

    print.print("Qual o primeiro valor? ");
    x = input.nextInt();

    print.print("Qual o segundo valor? ");
    y = input.nextInt();

    for(int i = 1; i <= y; i += 1) sum += x;

    print.println(sum);

    input.close();
  }
}
