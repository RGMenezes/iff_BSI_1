package Java.LinguagemDeProgramacao.Funcoes.Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double salarioFixo, valorTotalDeVendas, salarioTotal;

        System.out.print("\nDigite o seu salário fixo: ");
        salarioFixo = entradaDoTeclado.nextDouble();

        System.out.print("Digite o total de vendas: ");
        valorTotalDeVendas = entradaDoTeclado.nextDouble();

        salarioTotal = CalculadoraSalario(salarioFixo, valorTotalDeVendas);

        System.out.printf("\nSeu salário total é R$%.2f\n", salarioTotal);
    }

    static double CalculadoraSalario(double salarioFixo, double valorTotalDeVendas){
        double salarioTotal;
        if(valorTotalDeVendas <= 1500){
            salarioTotal = salarioFixo + (valorTotalDeVendas * 0.03);
        }else{
            salarioTotal = salarioFixo + 1500 * 0.03 + (valorTotalDeVendas - 1500) * 0.05;
        }
        return salarioTotal;
    }
}

// 10. Implemente uma função que receba o salário fixo e o valor das vendas efetuadas por um vendedor, e retorne o
// salário total dele, incluindo a comissão de 3% sobre vendas até R$1.500,00 e 5% sobre o que ultrapassar este
// valor.