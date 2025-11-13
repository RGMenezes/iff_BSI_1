package Java.GP.Selection_Structures.IdealWeight;

import java.io.PrintStream;
import java.util.Scanner;

public class IdealWeight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double height, weight;
    String sex;

    print.print("Digite o seu sexo(F ou M): ");
    sex = input.next();

    print.print("Digite a sua altura: ");
    height = input.nextDouble();

    if(sex.equalsIgnoreCase("f")) weight = (62.1 * height) - 44.7;
    else weight = (72.7 * height) - 58;

    print.println("Seu peso ideal é: " + String.format("%.2f", weight));

    input.close();
  }
}
