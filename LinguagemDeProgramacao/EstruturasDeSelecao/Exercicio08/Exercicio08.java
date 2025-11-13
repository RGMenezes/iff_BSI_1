package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double salarioBruto, valorDaPrestacao;

        System.out.print("\nQual o seu salário bruto? ");
        salarioBruto = entradaDoTeclado.nextDouble();
        
        System.out.print("Qual o valor da prestação do empréstimo? ");
        valorDaPrestacao = entradaDoTeclado.nextDouble();

        if(salarioBruto * 0.3 >= valorDaPrestacao){
            System.out.println("\nO empréstimo pode ser concedido.");
        }else{
            System.out.println("\nO empréstimo não pode ser concedido.");
        }
    }
}

// 8. A prefeitura de Campos abriu uma linha de cr´edito para os funcion´arios estatut´arios. O valor m´aximo da
// presta¸c˜ao n˜ao poder´a ultrapassar 30% do sal´ario bruto. Fazer um programa que permita entrar com o sal´ario
// bruto e o valor da presta¸c˜ao, e informar se o empr´estimo pode ou n˜ao ser concedido.