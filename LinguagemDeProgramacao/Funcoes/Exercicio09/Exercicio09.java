package Java.LinguagemDeProgramacao.Funcoes.Exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double salarioBruto, valorDaPrestacao;

        System.out.print("\nQual o seu salário bruto? ");
        salarioBruto = entradaDoTeclado.nextDouble();
        
        System.out.print("Qual o valor da prestação do empréstimo? ");
        valorDaPrestacao = entradaDoTeclado.nextDouble();

        System.out.println("\n" + ConcederEmprestimo(salarioBruto, valorDaPrestacao));
    }

    static String ConcederEmprestimo(double salarioBruto, double valorDaPrestacao){
        String mensagem;
        if(salarioBruto * 0.3 >= valorDaPrestacao){
            mensagem = "O empréstimo pode ser concedido.";
        }else{
            mensagem = "O empréstimo não pode ser concedido.";
        } 
        return mensagem;
    }

}

// 9. Crie uma função que receba o salário bruto e o valor de uma prestação, e retorne se o empréstimo pode ou não
// ser concedido, considerando que o valor máximo da prestação não pode ultrapassar 30% do salário bruto.