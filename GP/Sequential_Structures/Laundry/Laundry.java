package Java.GP.Sequential_Structures.Laundry;

import java.io.PrintStream;
import java.util.Scanner;

public class Laundry {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    PriceTable priceTable = new PriceTable(5.00, 10.00, 2.00);
    Shopping shopping = new Shopping(0, 0, 0);

    print.println("Bem-vindo a Laundry!");

    print.print("Quantas blusas foram lavadas? ");
    shopping.shirt = input.nextInt();

    print.print("Quantas calças foram lavadas? ");
    shopping.pants = input.nextInt();

    print.print("Quantas pares de meia foram lavadas? ");
    shopping.socks = input.nextInt();

    print.println("Total a pagar: R$" + String.format("%.2f", shoppingCalculator(shopping, priceTable)));

    input.close();
  }

  //create class object
  public static class PriceTable {
    double shirt;
    double pants;
    double socks;

    public PriceTable(double shirt, double pants, double socks){
      this.shirt = shirt;
      this.pants = pants;
      this.socks = socks;
    }
  }

  public static class Shopping {
    int shirt;
    int pants;
    int socks;

    public Shopping(int shirt, int pants, int socks){
      this.shirt = shirt;
      this.pants = pants;
      this.socks = socks;
    }
  }

  //create function/method
  public static double shoppingCalculator(Shopping shopping, PriceTable priceTable){
    return (shopping.pants * priceTable.pants) + (shopping.shirt * priceTable.shirt) + (shopping.socks * priceTable.socks);
  }
}
