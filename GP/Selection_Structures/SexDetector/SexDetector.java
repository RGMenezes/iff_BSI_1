package Java.GP.Selection_Structures.SexDetector;

import java.io.PrintStream;
import java.util.Scanner;

public class SexDetector {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    String sex;

    print.print("Qual o seu sexo (F ou M): ");
    sex = input.next();

    if(sex.equalsIgnoreCase("f")) print.println("Feminino.");
    else if(sex.equalsIgnoreCase("m")) print.println("Masculino.");
    else print.println("Indefinido.");

    input.close();
  }
}