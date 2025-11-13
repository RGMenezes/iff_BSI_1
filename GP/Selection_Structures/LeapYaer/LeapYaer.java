package Java.GP.Selection_Structures.LeapYaer;

import java.io.PrintStream;
import java.util.Scanner;

public class LeapYaer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int yaer = 0;
    boolean result;

    while (yaer < 1582) {
      print.print("Digite um ano válido, acima de 1582: ");
      yaer = input.nextInt();
    }

    result = yaer % 4 == 0 && (yaer % 100 == 0 ? yaer % 400 == 0 : true);

    print.println(yaer + (result ? " é um ano bissexto." : " não é um ano bissexto."));

    input.close();
  }
}