package Java.GP.Selection_Structures.NumberInFull;

import java.io.PrintStream;
import java.util.Scanner;

public class NumberInFull {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int number = -1;
    int constNumber;

    while (number >= 1000 || number <= 0) {
      print.print("Digite um número menor que 1000: ");
      number = input.nextInt();
    }
    constNumber = number;

    if(number/100 > 0){
      print.print((number/100) + " centena" + (number/100 == 1 ? "" : "s"));
      number = number%100;
    }
    if(number/10 > 0){
      print.print((constNumber < 100 ? "" : (number%10 == 0 ? " e " : ", ")) + (number/10) + " dezena" + (number/10 == 1 ? "" : "s"));
      number = number%10;
    }
    if(number > 0){
      print.print((constNumber < 10 ? "" : " e ") + number + " unidade" + (number == 1 ? "" : "s"));
    }
    print.println("");

    input.close();
  }
}