package Java.LinguagemDeProgramacao.Vetores.Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        String listaDePessoas[] = new String[50];

        for (int i = 0; i < listaDePessoas.length; i++) {
            System.out.print("Nome: ");
            listaDePessoas[i] = entradaDoTeclado.nextLine();
        }

        for (int i = listaDePessoas.length - 1; i >= 0; i--) {
            System.out.println(listaDePessoas[i]);
        }
    }
}

// 1. Prepare um programa para ler o nome de 50 pessoas e listá-los na ordem inversa de entrada.