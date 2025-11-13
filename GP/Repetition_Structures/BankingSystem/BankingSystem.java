package Java.GP.Repetition_Structures.BankingSystem;

import java.io.PrintStream;
import java.util.Scanner;

public class BankingSystem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int option = 0;
    double bankAccount = 0;

    print.println("Bem-vindo, qual a sua escolha? ");

    while (option != 4) {
      print.print(
        "\n1 - Depósito\n" + //
        "2 - Retirada\n" + //
        "3 - Saldo\n" + //
        "4 - Sair do algoritmo\n" + //
        "Opção: "
      );
      option = input.nextInt();

      if(option < 1 || option > 4) print.println("\nOpção inválida!");
      else if(option == 1){
        print.print("Qual o valor a ser depositado? ");
        bankAccount += input.nextDouble();
        
      } else if(option == 2){
        print.print("Qual o valor a ser retirado? ");
        bankAccount -= input.nextDouble();
        
      } else if(option == 3) 
        print.println("Você possui R$" + String.format("%.2f", bankAccount) + ".");
      else{
        print.println("Obrigado por utilizar nossos serviços.");
        break;
      }
    }

    input.close();
  }
}

// 46. Faça um algoritmo para simular uma situação simples de depósito, retirada e consulta em
// um banco.
// O algoritmo inicialmente deverá mostrar um menu com as seguintes opções:
// 1 - Depósito
// 2 - Retirada
// 3 - Saldo
// 4 - Sair do algoritmo
// Se a escolha do usuário for depósito ou retirada, o algoritmo deverá pedir o valor da
// operação e atualizar automaticamente o valor existente na conta.
// O algoritmo deverá ser utilizado até que o usuário escolha a opção sair do algoritmo.