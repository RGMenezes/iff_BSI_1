package Java.LinguagemDeProgramacao.RevisaoP1.Exercicio01;

import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int contadorSexoM = 0;
        int contadorSexoF = 0;

        while(contadorSexoF + contadorSexoM != 10) {
            System.out.print("\nDigite seu nome: ");
            entradaDoTeclado.nextLine();

            System.out.print("\nDigite seu sexo: ");
            switch (entradaDoTeclado.next().charAt(0)) {
                case 'f':
                case 'F':
                    contadorSexoF++;
                    break;
                
                case 'm':
                case 'M':
                    contadorSexoM++;
                    break;

                default:
                    System.out.println("\n[ERROR] Sexo inesistente, tente novamente!");
                    break;
            }
        }

        System.out.println("M: " + contadorSexoM + "\nF: " + contadorSexoF);
    }
}

// 1. Prepare um algoritmo para perguntar o nome e o sexo de 10 pessoas e informar quantas são homens e quantas
// são mulheres.