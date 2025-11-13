package Java.LinguagemDeProgramacao.RevisaoP1.Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int opcao;
        double conta = 0;
        String extrato = "";

        do {
            System.out.print("\nEscolha uma opção:\n 1 - Deposito\n 2 - Retirada\n 3 - Saldo\n 4 - Extrato\n 5 - Sair\nSua escolha: ");
            opcao = entradaDoTeclado.nextInt();

            switch (opcao){

                case 1:
                    System.out.print("\nValor do depósito: ");
                    double valorDeposito = entradaDoTeclado.nextDouble();

                    if(valorDeposito > 0){
                        conta += valorDeposito;
                        System.out.println("Depósito realizado com sucesso!");

                        extrato += "\nDepósito de R$" + String.format("%.2f", valorDeposito);
                    }else{
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 2:
                    System.out.print("\nValor da retirada: ");
                    double valorRetirada = entradaDoTeclado.nextDouble();

                    if(valorRetirada > 0){
                        if(valorRetirada <= conta){
                            conta -= valorRetirada;
                            System.out.println("Retirada realizada com sucesso!");

                            extrato += "\nRetirada de R$" + String.format("%.2f", valorRetirada);
                        }else{
                            System.out.println("Saldo insuficiente!");
                        }
                    }else{
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 3:
                    System.out.printf("\nSeu saldo é de R$%.2f", conta);
                    break;

                case 4:
                    System.out.println("\nExtrato: " + extrato);
                    break;

                case 5:
                    break;
            
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (opcao != 5);

        System.out.println("\nOperações realizadas:");
    }
}

// 5. Fa¸ca um programa para simular uma situa¸c˜ao simples de dep´osito, retirada e consulta em um banco. O programa
// inicialmente dever´a mostrar um menu com as seguintes op¸c˜oes:
// (a) Dep´osito
// (b) Retirada
// (c) Saldo
// (d) Sair do programa
// Se a escolha do usu´ario for dep´osito ou retirada, o programa dever´a pedir o valor da opera¸c˜ao e atualizar
// automaticamente o valor existente na conta. O programa dever´a ser utilizado at´e que o usu´ario escolha a op¸c˜ao
// sair do programa.
// Obs: Utilizar as estruturas de sele¸c˜ao m´ultipla (switch...case) e de repeti¸c˜ao com condicional no fim.