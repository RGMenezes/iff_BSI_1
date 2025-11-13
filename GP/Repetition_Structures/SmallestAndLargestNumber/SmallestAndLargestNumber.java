package Java.GP.Repetition_Structures.SmallestAndLargestNumber;

import java.io.PrintStream;
import java.util.Scanner;

public class SmallestAndLargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int min, max;

    print.print("Valor: ");
    min = max = input.nextInt();

    for(int i = 0; i < 39; i += 1){
      print.print("Valor: ");
      int value = input.nextInt();
      min = value < min ? value : min;
      max = value > max ? value : max;
    }

    print.println("Menor valor: " + min + "\nMaior valor: " + max);

    input.close();
  }
}