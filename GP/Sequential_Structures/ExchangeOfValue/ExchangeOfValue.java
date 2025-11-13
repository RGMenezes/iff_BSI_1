package Java.GP.Sequential_Structures.ExchangeOfValue;

import java.io.PrintStream;
import java.util.Scanner;

public class ExchangeOfValue{
  public static void main(String[] args) {
    int a,b,c;
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;

    print.print("Escreva o número da variavel a: ");
    a = input.nextInt();

    print.print("Escreva o número da variavel b: ");
    b = input.nextInt();
    
    print.println("Variavel a = " + a + ", variavel b = " + b);

    c = a;
    a = b;
    b = c;

    print.println("Variavel a = " + a + ", variavel b = " + b);

    input.close();
  }
}