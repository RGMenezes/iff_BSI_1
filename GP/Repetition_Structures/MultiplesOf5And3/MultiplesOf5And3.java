package Java.GP.Repetition_Structures.MultiplesOf5And3;

import java.io.PrintStream;
import java.util.Scanner;

public class MultiplesOf5And3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int multiple;
    int sum = 0;

    print.print("Limite dos multiplos: ");
    multiple = input.nextInt();

    for(int counter = 1; (counter-1) * 5 <= multiple; counter += 1){

      for(
        int counter1 = counter == 1 ? 1 : ((counter - 1) * 5) / 3 + 1; 
        counter1 * 3 <= counter * 5; 
        counter1 += 1
      ){
        if(counter1 * 3 <= multiple && counter * 5 != counter1 * 3){
          print.print(counter1 == 1 ? "3" : ", " + (3 * counter1));
          sum += 3 * counter1;
        }
      }
      if(counter * 5 <= multiple){
        print.print(", " + 5 * counter);
        sum += 5 * counter;
      }
    }
    print.println(".");
    print.println("Soma total: " + sum);

    input.close();
  }
}