package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double salarioFixo, valorTotalDeVendas, salarioTotal;

        System.out.print("\nDigite o seu salário fixo: ");
        salarioFixo = entradaDoTeclado.nextDouble();

        System.out.print("Digite o total de vendas: ");
        valorTotalDeVendas = entradaDoTeclado.nextDouble();

        if(valorTotalDeVendas <= 1500){
            salarioTotal = salarioFixo + (valorTotalDeVendas * 0.03);
        }else{
            salarioTotal = salarioFixo + 1500 * 0.03 + (valorTotalDeVendas - 1500) * 0.05;
        }

        System.out.printf("\nSeu salário total é R$%.2f\n", salarioTotal);

    }
}

// 9. Dado o sal´ario fixo, o valor das vendas efetuadas pelo vendedor de uma empresa e sabendo-se que ele recebe
// uma comiss˜ao de 3% sobre o total das vendas at´e R$1.500,00 e 5% sobre o que ultrapassar este valor, calcular e
// escrever o seu sal´ario total.