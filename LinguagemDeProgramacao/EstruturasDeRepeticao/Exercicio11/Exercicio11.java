package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int opcao, contOpcaoDeposito, contOpcaoRetirada, contOpcaoSaldo, contOpcaoExtrato;
        opcao = contOpcaoDeposito = contOpcaoRetirada = contOpcaoSaldo = contOpcaoExtrato = 0;
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

                        contOpcaoDeposito++;
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

                            contOpcaoRetirada++;
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
                    contOpcaoSaldo++;
                    break;

                case 4:
                    System.out.println("\nExtrato: " + extrato);
                    contOpcaoExtrato++;
                    break;

                case 5:
                    break;
            
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (opcao != 5);

        System.out.println("\nOperações realizadas:");
        System.out.println(" Depósito = " + contOpcaoDeposito);
        System.out.println(" Retirada = " + contOpcaoRetirada);
        System.out.println(" Saldo = " + contOpcaoSaldo);
        System.out.println(" Extrato = " + contOpcaoExtrato);
    }
}

// 11. Prepare um programa para controlar as informações sobre utilização de um banco eletrônico. Seu programa
// deverá perguntar aos clientes qual foi a operação que eles realizaram.
// O programa deverá mostrar um menu com as as seguintes opções:
// 1 - Depósito
// 2 - Retirada
// 3 - Saldo
// 4 - Extrato
// 5 - Sair do Programa
// O programa deverá ficar em loop, apresentando o menu e lendo a opção do usuário. Após lida a opção de
// sair do programa, informe quantas operações foram efetuadas de cada tipo e finalize a execução. (Utilizar
// a estrutura de repetição do...while e a estrutura de seleção switch...case)