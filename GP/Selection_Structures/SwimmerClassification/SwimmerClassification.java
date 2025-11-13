package Java.GP.Selection_Structures.SwimmerClassification;

import java.io.PrintStream;
import java.util.Scanner;

public class SwimmerClassification {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int age;

    print.print("Qual a sua idade? ");
    age = input.nextInt();

    if(age < 5) print.println("Você não tem idade suficiente!");
    else if(age <= 7) print.println("Sua categoria é infantil A.");
    else if(age <= 10) print.println("Sua categoria é infantil B.");
    else if(age <= 13) print.println("Sua categoria é juvenil A.");
    else if(age <= 17) print.println("Sua categoria é juvenil B.");
    else print.println("Sua categoria é a dos adultos.");
    
    input.close();
  }
}
