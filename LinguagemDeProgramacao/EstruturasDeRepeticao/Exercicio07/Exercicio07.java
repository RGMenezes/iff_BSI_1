package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int valorMaximo;

        System.out.print("\nDigite o valor máximo: ");
        valorMaximo = entradaDoTeclado.nextInt();

        for (int i = 1; i <= valorMaximo; i++) {
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}

// 7. Faça um programa que escreva todos os números múltiplos de 7 entre 1 e N, sendo N um valor introduzido
// pelo usuário. Por exemplos: 7, 14, 21, 28, 35. (Utilizar a estrutura de repetição for)