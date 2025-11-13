package Java.GP.Repetition_Structures.SeparatingTheSexes;

import java.io.PrintStream;
import java.util.Scanner;

public class SeparantingTheSexes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int m,f;
    m = f = 0;

    for(int i = 0; i < 10; i += 1){
      print.print("Qual o seu nome? ");
      String name = input.next();

      print.print(name + " qual o seu sexo (f=0 e m=1)? ");
      int sex = input.nextInt();

      if(sex == 1) m += 1;
      else if(sex == 0) f += 1;
      else print.println("Opção inválida, não contabilizado!");
    }

    print.println("Temos " + m + " homens e " + f + " mulheres.");

    input.close();
  }
}
