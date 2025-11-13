package Java.LinguagemDeProgramacao.EstruturasDeSelecaoMultipla.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double pesoNaTerra;
        int numeroReferenteAoPlaneta;

        System.out.print("\nDigite um peso: ");
        pesoNaTerra = entradaDoTeclado.nextDouble();

        System.out.print("Digite um número entre 1 a 6: ");
        numeroReferenteAoPlaneta = entradaDoTeclado.nextInt();

        switch (numeroReferenteAoPlaneta) {
            case 1: System.out.printf("%.3fKg, peso em Mercúrio.\n", pesoNaTerra * 0.37);
                break;
            case 2: System.out.printf("%.3fKg, peso em vênus.\n", pesoNaTerra * 0.88);
                break;
            case 3: System.out.printf("%.3fKg, peso em Marte.\n", pesoNaTerra * 0.38);
                break;
            case 4: System.out.printf("%.3fKg, peso em Júpiter.\n", pesoNaTerra * 2.64);
                break;
            case 5: System.out.printf("%.3fKg, peso em Saturno.\n", pesoNaTerra * 1.15);
                break;
            case 6: System.out.printf("%.3fKg, peso em Urano.\n", pesoNaTerra * 1.17);
                break;
        
            default: System.out.println("Essa opção não existe!");
                break;
        }
    }
}

// 4. Escreva um programa que leia um peso na Terra, o n´umero de um planeta e imprima o valor do peso neste
// planeta. A rela¸c˜ao de planetas ´e dada a seguir juntamente com o valor das gravidades relativas ´a Terra:
// Gravidade Relativa Planeta
// 1 0,37 Merc´urio
// 2 0,88 Vˆenus
// 3 0,38 Marte
// 4 2,64 J´upiter
// 5 1,15 Saturno
// 6 1,17 Urano