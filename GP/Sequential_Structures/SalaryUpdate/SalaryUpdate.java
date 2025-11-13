package Java.GP.Sequential_Structures.SalaryUpdate;

import java.io.PrintStream;
import java.util.Scanner;

public class SalaryUpdate {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double salary, readjustment, result;

    print.println("Atualização de Salário");

    print.print("Salário do funcionário: ");
    salary = input.nextDouble();

    print.print("Percentual de reajuste(%): ");
    readjustment = input.nextDouble();

    result = salary * (readjustment + 100) / 100;

    print.println("O salário atualizado é R$" + String.format("%.2f", result));

    input.close();
  }
}
