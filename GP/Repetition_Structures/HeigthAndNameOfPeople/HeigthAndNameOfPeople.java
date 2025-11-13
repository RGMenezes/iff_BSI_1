package Java.GP.Repetition_Structures.HeigthAndNameOfPeople;

import java.io.PrintStream;
import java.util.Scanner;

public class HeigthAndNameOfPeople {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double heigth = 0;
    double maxHeigth = 0;
    double minHeigth = Double.MAX_VALUE;
    String name = "";

    for(int i = 0; i < 20; i += 1){
      print.print("Digite seu nome: ");
      String inputName = input.nextLine();
      
      print.print("Digite sua altura: ");
      double inputHeigth = input.nextDouble();
      input.nextLine();

      heigth += inputHeigth;

      minHeigth = minHeigth < inputHeigth ? minHeigth : inputHeigth;
      if(maxHeigth < inputHeigth){
        name = inputName;
        maxHeigth = inputHeigth;
      }
    }

    print.println("Media das alturas: " + String.format("%.2f", (heigth / 20)) + ";");
    print.println("Altura da pessoa mais baixa: " + String.format("%.2f", minHeigth) + ";");
    print.println("Nome da pessoa mais alta: " + name + ".");

    input.close();
  }
}