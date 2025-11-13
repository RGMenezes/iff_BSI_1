package Java.GP.Repetition_Structures.Sum1To1000;

import java.io.PrintStream;
import java.util.Scanner;

//37 e 38

public class Sum1To1000 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int loop;
    int sum = 0;

    print.print("Limite: ");
    loop = input.nextInt();

    for(int i = 1; i <= loop; i += 1) sum += i;

    print.println(sum);

    input.close();
  }
}
