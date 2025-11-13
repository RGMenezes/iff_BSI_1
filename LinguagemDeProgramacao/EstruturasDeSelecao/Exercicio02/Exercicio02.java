package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int numeroPrincipal, numeroParaComparar;

        System.out.print("\nDigite um número: ");
        numeroPrincipal = entradaDoTeclado.nextInt();

        System.out.print("Digite o número para compação: ");
        numeroParaComparar = entradaDoTeclado.nextInt();
        
        System.out.print("\n");
        
        if(numeroPrincipal > numeroParaComparar){
            System.out.println(numeroPrincipal + " é maior que " + numeroParaComparar + ".");
        }else{
            if(numeroPrincipal == numeroParaComparar){
                System.out.println(numeroPrincipal + " são iguais " + numeroParaComparar + ".");
            }else{
                System.out.println(numeroParaComparar + " é maior que " + numeroPrincipal + ".");
            }
        }
    }
}

// 2. Prepare um programa para perguntar dois n´umeros e informar qual deles ´e o maior ou se os n´umeros s˜ao iguais.