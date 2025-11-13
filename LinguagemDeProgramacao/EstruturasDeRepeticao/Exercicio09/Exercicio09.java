package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            int valor = entradaDoTeclado.nextInt();

            if(valor >= 0){
                contador++;
            }else{
                break;
            }

        }

        System.out.println("Quantidade de números digitados: " + contador);
    }
}

// 9. Escreva um programa que receba números do usuário enquanto eles forem positivos. No final o programa
// deve imprimir quantos números foram digitados.