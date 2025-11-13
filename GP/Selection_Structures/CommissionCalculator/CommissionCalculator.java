package Java.GP.Selection_Structures.CommissionCalculator;

import java.io.PrintStream;
import java.util.Scanner;

public class CommissionCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double salary, sale, commission;

    print.println("Calculadora de Comissão");
    
    print.print("Salário do funcionário: ");
    salary = input.nextDouble();

    print.print("Total de vendas: ");
    sale = input.nextDouble();

    if(salary <= 1500){
      commission = sale * 0.03;
    }else{
      sale -= 1500;
      commission = 45 + sale * 0.05; 
    }

    salary += commission;

    print.println("O seu funcioinário receberá: R$" + String.format("%.2f", salary));

    input.close();
  }
}
