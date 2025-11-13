package Java.GP.Sequential_Structures.AgeInDays;

import java.io.PrintStream;
import java.util.Scanner;

public class AgeInDays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    Age age = new Age(0, 0, 0);

    print.println("Calculadora de dias de vida");

    print.print("Quantos anos você tem? ");
    age.year = input.nextInt();    

    print.print("Quantos meses completos, apartir do seu último aniversário, você tem? ");
    age.mount = input.nextInt();

    print.print("E quantos dias? ");
    age.day = input.nextInt();

    print.println("Você tem " + age.ageDays() + " dias de vida.");

    input.close();
  }

  public static class Age{
    int year;
    int mount;
    int day;

    public Age(int year, int mount, int day){
      this.year = year;
      this.mount = mount;
      this.day = day;
    }

    public int ageDays(){
      return year * 365 + mount * 30 + day;
   }
  }
}
