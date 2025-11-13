package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int idadeDoUsuario;

        System.out.print("\nDigite a sua idade: ");
        idadeDoUsuario = entradaDoTeclado.nextInt();

        if(idadeDoUsuario < 5){
            System.out.println("Você não tem idade suficiente.");

        }else{
            if(idadeDoUsuario <= 7){
                System.out.println("Infantil A");

            }else{
                if(idadeDoUsuario <= 10){
                    System.out.println("Infantil B");

                }else{
                    if(idadeDoUsuario <= 13){
                        System.out.println("Juvenil A");

                    }else{
                        if(idadeDoUsuario <= 17){
                            System.out.println("Juvenil B");
                        }else{
                            System.out.println("Adulto");
                        }
                    }
                }
            }
        }
    }
}

// 11. Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias: infantil A
// = 5-7 anos; infantil B = 8-10 anos; juvenil A = 11-13 anos; juvenil B = 14-17 anos; adulto = maiores de 18 anos.