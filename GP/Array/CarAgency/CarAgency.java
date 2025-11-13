package Java.GP.Array.CarAgency;

import java.io.PrintStream;
import java.util.Scanner;

public class CarAgency {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    Fleet[] fleet = new Fleet[10];

    for(int i = 0; i < fleet.length; i += 1){
      
      console.print("\nTipo do carro: ");
      String type = input.nextLine();
      
      console.print("Valor do carro (Mês): ");
      int value = input.nextInt();
      
      console.print("Dias totais alugado: ");
      int day = input.nextInt();

      input.nextLine();
      
      fleet[i] = new Fleet(type, value, day);
    }
    
    for(int i = 0; i < fleet.length; i += 1){
      console.println("\n" + fleet[i].type);
      console.println("Valor do aluguel: R$" + String.format("%02f", fleet[i].value));
      console.println("Dias alugados: " + fleet[i].day);
      console.println("Total recebido: R$" + String.format("%02f", (fleet[i].value / 30) * fleet[i].day));
    }

    input.close();
  }

  public static class Fleet{
    String type;
    double value;
    int day;

    public Fleet(String type, double value, int day){
      this.type = type;
      this.value = value;
      this.day = day;
    }
  }
}
