package Java.GP.Sequential_Structures.MeterConverter;

import java.io.PrintStream;
import java.util.Scanner;

public class MeterConverter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;;

    print.print("Escreva os metros a serem convertidos: ");
    float numberMeter = input.nextFloat();

    float numberCentimeter = numberMeter*100;

    print.print("Temos então " + numberCentimeter + "cm.");

    input.close();
  }
}