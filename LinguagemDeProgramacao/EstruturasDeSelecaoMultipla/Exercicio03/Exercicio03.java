package Java.LinguagemDeProgramacao.EstruturasDeSelecaoMultipla.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int numeroCorrespondenteAoMes;

        System.out.print("\nDigite o número do mês: ");
        numeroCorrespondenteAoMes = entradaDoTeclado.nextInt();

        switch (numeroCorrespondenteAoMes) {
            case 1: System.out.println("Janeiro");
                break;
            case 2: System.out.println("Fevereiro");
                break;
            case 3: System.out.println("Março");
                break;
            case 4: System.out.println("Abril");
                break;
            case 5: System.out.println("Maio");
                break;
            case 6: System.out.println("Junho");
                break;
            case 7: System.out.println("Julho");
                break;
            case 8: System.out.println("Agosto");
                break;
            case 9: System.out.println("Setembro");
                break;
            case 10: System.out.println("Outubro");
                break;
            case 11: System.out.println("Novembro");
                break;
            case 12: System.out.println("Dezembro");
                break;
        
            default: System.out.println("Não existe mês com esse número!");
                break;
        }
    }
}

// 3. Criar um programa que leia um n´umero inteiro entre 1 e 12 e escreva o nome do mˆes correspondente. Caso o
// usu´ario digite um n´umero fora desse intervalo, dever´a aparecer uma mensagem informando que n˜ao existe mˆes
// com este n´umero.