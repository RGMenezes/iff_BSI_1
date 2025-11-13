package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int valorInserido;

        System.out.print("\nDigite um valor: ");
        valorInserido = entradaDoTeclado.nextInt();

        if(valorInserido % 3 == 0){
            System.out.println(valorInserido + " é múltiplo de 3.");
        }else{
            System.out.println(valorInserido + " não é múltiplo de 3.");
        }
    }
}

// 6. Escreva um programa que receba um n´umero e imprima se o n´umero ´e ou n˜ao ´e m´ultiplo de 3.