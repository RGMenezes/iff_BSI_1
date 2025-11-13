package Java.GP.Selection_Structures.ConsultancyService;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsultancyService {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    String valueTable[][] = {{"Projeto", "200", "1000"}, {"Auditoria", "100", "1500"}};
    int option, workDayValue, travelValue;
    double value;
    
    option = -1;
    while (option < 0 || option > 1) {
      print.print("Menu Consultoria\n0 - Projeto \n1 - Auditoria\nDigite sua escolha: ");
      option = input.nextInt();
      if(option < 0 || option > 1) print.println("Opção invalida!");
    }

    print.print("Dias trabalhados: ");
    workDayValue = input.nextInt();

    print.print("Veagens realizadas: ");
    travelValue = input.nextInt();

    value = Integer.parseInt(valueTable[option][1]) * workDayValue + Integer.parseInt(valueTable[option][2]) * travelValue;

    print.println("O serviço " + valueTable[option][0] + " custará R$" + String.format("%.2f", value) + ".");

    input.close();
  }
}
