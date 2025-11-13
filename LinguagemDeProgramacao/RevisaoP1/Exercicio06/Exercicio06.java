package Java.LinguagemDeProgramacao.RevisaoP1.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular área do Quadrado");
            System.out.println("2 - Calcular área do Retângulo");
            System.out.println("3 - Calcular área do Triângulo");
            System.out.println("4 - Calcular área do Círculo");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção: ");
            option = entradaDoTeclado.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nDigite o lado: ");
                    double ladoAQ = entradaDoTeclado.nextDouble();
                    System.out.println("Área do quadrado: " + (ladoAQ * ladoAQ));
                    break;
                case 2:
                    System.out.print("\nDigite a base: ");
                    double baseAR = entradaDoTeclado.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaAR = entradaDoTeclado.nextDouble();
                    System.out.println("Área do retângulo: " + (baseAR * alturaAR));
                    break;
                case 3:
                    System.out.print("\nDigite a base: ");
                    double baseAT = entradaDoTeclado.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaAT = entradaDoTeclado.nextDouble();
                    System.out.println("Área do triângulo: " + (baseAT * alturaAT / 2));
                    break;
                case 4:
                    System.out.print("\nDigite o raio: ");
                    double raioAC = entradaDoTeclado.nextDouble();
                    System.out.println("Área do círculo: " + (3.14 * (raioAC * raioAC)));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }while(option != 5);
    }
}

// 6. Fa¸ca um programa para calcular a ´area de figuras geom´etricas. Inicialmente o programa dever´a apresentar ao
// usu´ario um menu principal, onde ser´a escolhida uma dentre as seguintes op¸c˜oes:
// 1 - Calcular a ´area do quadrado
// 2 - Calcular a ´area do retˆangulo
// 3 - Calcular a ´area do triˆangulo
// 4 - Calcular a ´area do c´ırculo
// 5 - Sair do programa
// Ap´os ser escolhida uma das figuras, o usu´ario dever´a ent˜ao entrar com as devidas medidas da mesma para que o
// c´alculo possa ser realizado. Depois de informar o resultado do c´alculo, o programa dever´a ent˜ao voltar ao menu
// principal at´e que o usu´ario deseje finalizar o programa.
// Obs: Utilizar as estruturas de sele¸c˜ao m´ultipla (switch...case) e de repeti¸c˜ao com condicional no fim.