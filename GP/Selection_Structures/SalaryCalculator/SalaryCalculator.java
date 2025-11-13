// import java.io.PrintStream;
// import java.util.Scanner;

// public class SalaryCalculator {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     PrintStream print = System.out;
//     int responsibility = -1;
//     int salaryTable[] = {2000, 900, 300};
//     int baseSalary, overtime, absences, children;
//     double salary, benefits, discount;

//     while (responsibility < 0 || responsibility > 2) {
//       print.println("Qual o seu cargo: \n1 - Gerente\n2 - Supervisor\n3 - Servente");
//       responsibility = input.nextInt() - 1;
//     }
//     baseSalary = salaryTable[responsibility];

//     print.print("Quantas horas extra trabalhadas? ");
//     overtime = input.nextInt();

//     print.print("Quantos dias faltados? ");
//     absences = input.nextInt();

//     print.print("Quantos filhos? ");
//     children = input.nextInt();

//     benefits = baseSalary + ((baseSalary / 240.0 * 2) * overtime) + ((baseSalary * 0.03) * children);
//     discount = ((baseSalary / 30.0) * absences) + (benefits * 0.10);
//     salary = benefits - discount;

//     print.println("Salário calculado: ");
//     print.println("Proventos = R$" + String.format("%.2f", benefits));
//     print.println("Descontos = R$" + String.format("%.2f", discount));
//     print.println("Salário Líquido = R$" + String.format("%.2f", salary));

//     input.close();
//   }
// }