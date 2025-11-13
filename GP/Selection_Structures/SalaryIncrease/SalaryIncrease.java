package Java.GP.Selection_Structures.SalaryIncrease;

import java.io.PrintStream;
import java.util.Scanner;

public class SalaryIncrease {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double salary;

    print.print("Qual o seu salário: ");
    salary =input.nextDouble();

    if(salary <= 280){
      print.println("Salário base: R$" + String.format("%.2f", salary));
      print.println("Percentual de aumento aplicado: 20%");
      print.println("Valor do aumento: R$" + String.format("%.2f", (salary * 0.2)));
      print.println("Salário com aumento: R$" + String.format("%.2f", (salary * 1.2)));

    }else if(salary <= 700){
      print.println("Salário base: R$" + String.format("%.2f", salary));
      print.println("Percentual de aumento aplicado: 15%");
      print.println("Valor do aumento: R$" + String.format("%.2f", (salary * 0.15)));
      print.println("Salário com aumento: R$" + String.format("%.2f", (salary * 1.15)));

    }else if(salary <= 1500){
      print.println("Salário base: R$" + String.format("%.2f", salary));
      print.println("Percentual de aumento aplicado: 10%");
      print.println("Valor do aumento: R$" + String.format("%.2f", (salary * 0.1)));
      print.println("Salário com aumento: R$" + String.format("%.2f", (salary * 1.1)));

    }else {
      print.println("Salário base: R$" + String.format("%.2f", salary));
      print.println("Percentual de aumento aplicado: 5%");
      print.println("Valor do aumento: R$" + String.format("%.2f", (salary * 0.05)));
      print.println("Salário com aumento: R$" + String.format("%.2f", (salary * 1.05)));
    }
    input.close();
  }
}