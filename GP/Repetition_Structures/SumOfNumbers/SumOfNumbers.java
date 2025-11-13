package Java.GP.Repetition_Structures.SumOfNumbers;

import java.io.PrintStream;
import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int loop;
    int sum = 0;
    
    print.print("Digite a quantos loops teremos: ");
    loop = input.nextInt();

    for(int counter = 0; counter < loop; counter += 1){
      print.print("Loop " + (counter + 1) + " | Digite um número: ");
      sum += input.nextInt();
    }

    print.println("A soma total é de " + sum + ".");

    input.close();
  }
}