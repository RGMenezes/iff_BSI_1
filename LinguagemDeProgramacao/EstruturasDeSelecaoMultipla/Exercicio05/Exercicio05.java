package Java.LinguagemDeProgramacao.EstruturasDeSelecaoMultipla.Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int idadeDoUsuario;

        System.out.print("\nDigite a sua idade: ");
        idadeDoUsuario = entradaDoTeclado.nextInt();

        switch (idadeDoUsuario) {
            case 1:
            case 2:
            case 3:
            case 4: 
                System.out.println("Você não tem idade suficiente.");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Infantil A");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Infantil B");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Juvenil A");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Juvenil B");
                break;
    
            default: System.out.println("Adulto");
                break;
        }
    }
}

// 5. Elabore um programa que dada a idade de um nadador classifica-o em uma das seguintes categorias: infantil A
// = 5-7 anos; infantil B = 8-10 anos; juvenil A = 11-13 anos; juvenil B = 14-17 anos; adulto = maiores de 18 anos.