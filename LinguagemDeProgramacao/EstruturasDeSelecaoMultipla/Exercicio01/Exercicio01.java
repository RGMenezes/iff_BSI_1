package Java.LinguagemDeProgramacao.EstruturasDeSelecaoMultipla.Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int valorA, valorB, valorC;
        int menorValor, valorDoMeio, maiorValor;
        
        System.out.print("\nDigite o valor A: ");
        valorA = entradaDoTeclado.nextInt();

        System.out.print("Digite o valor B: ");
        valorB = entradaDoTeclado.nextInt();

        System.out.print("Digite o valor C: ");
        valorC = entradaDoTeclado.nextInt();

        if(valorA <= valorB && valorA <= valorC){
            menorValor = valorA;

            if(valorB <= valorC){
                valorDoMeio = valorB;
                maiorValor = valorC;
                
            }else{
                valorDoMeio = valorC;
                maiorValor = valorB;
            }

        }else{
            if(valorB <= valorA && valorB <= valorC){
                menorValor = valorB;

                if(valorA <= valorC){
                    valorDoMeio = valorA;
                    maiorValor = valorC;
                    
                }else{
                    valorDoMeio = valorC;
                    maiorValor = valorA;
                }

            }else{
                menorValor = valorC;

                if(valorA <= valorB){
                    valorDoMeio = valorA;
                    maiorValor = valorB;
                    
                }else{
                    valorDoMeio = valorB;
                    maiorValor = valorA;
                }
            }
        }
        System.out.println("A ordem é " + menorValor + ", " + valorDoMeio + ", " + maiorValor + ".");
    }
}

// 1. Dados trˆes valores A, B e C, construa um programa, que imprima os valores de forma ascendente (do menor
// para o maior).