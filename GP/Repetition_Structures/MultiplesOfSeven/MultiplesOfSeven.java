package Java.GP.Repetition_Structures.MultiplesOfSeven;

import java.io.PrintStream;
import java.util.Scanner;

public class MultiplesOfSeven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int multiple;

    print.print("Limete para os multiplos de 7: ");
    multiple = input.nextInt();

    for(int counter = 1; counter * 7 <= multiple; counter += 1){
      print.print(counter == 1 ? "7" : ", " + (7 * counter));
    }
    print.println(".");

    input.close();
  }
}