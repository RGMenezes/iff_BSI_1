package Java.GP.Repetition_Structures.CostumerOperation;

import java.io.PrintStream;
import java.util.Scanner;

public class CortumerOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int people = 0;
    Operation operation = new Operation(0, 0, 0, 0);

    print.print("Quantas pessoas utilizaram o sistema? ");
    people = input.nextInt();

    for(int i = 0; i < people; i += 1){
      int optionSelected = 0;

      while (optionSelected < 1 || optionSelected > 4) {
        print.print("\nMenu do Sistema:\n1 - Retirada\n2 - Depósito\n3 - Extrato\n4 - Transferência\nEscolha uma opção:");
        optionSelected = input.nextInt();
      }

      if(optionSelected == 1) operation.withdrawal += 1;
      else if(optionSelected == 2) operation.deposit += 1;
      else if(optionSelected == 3) operation.statement += 1;
      else operation.transfer += 1;
    }

    print.println(
      "\n" + operation.withdrawal + " de Retirada\n" + //
      operation.deposit + " de Depósito\n" + //
      operation.statement + " de Extrato\n" + //
      operation.transfer + " de Transferência"
    );

    input.close();
  }

  public static class Operation {
    int withdrawal;
    int deposit;
    int statement;
    int transfer;

    public Operation(int withdrawal, int deposit, int statement, int transfer){
      this.withdrawal = withdrawal;
      this.deposit = deposit;
      this.statement = statement;
      this.transfer = transfer;
    }
  }
}