package Java.LinguagemDeProgramacao.RevisaoP1.Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double alturaDoUsuario;
        double mediaDeAltura = 0;
        double alturaMaisAlta = 0;
        double alturaMaisBaixa = Double.MAX_VALUE;
        String nomeDoUsuario, nomeDoUsuarioMaisAlto = "";

        for (int i = 0; i < 20; i++) {
            System.out.print("\nDigite o seu nome: ");
            nomeDoUsuario = entradaDoTeclado.nextLine();

            System.out.print("Digite a sua altura: ");
            alturaDoUsuario = entradaDoTeclado.nextDouble();
            entradaDoTeclado.nextLine();

            mediaDeAltura += alturaDoUsuario;

            if(alturaDoUsuario > alturaMaisAlta){
                alturaMaisAlta = alturaDoUsuario;
                nomeDoUsuarioMaisAlto = nomeDoUsuario;
            }
            if(alturaDoUsuario < alturaMaisBaixa){
                alturaMaisBaixa = alturaDoUsuario;
            }   
        }

        mediaDeAltura /= 20;

        System.err.println("\nMédia destas alturas: " + String.format("%.2f", mediaDeAltura));
        System.out.println("Altura da pessoa mais baixa: " + alturaMaisBaixa);
        System.out.println("Nome da pessoa mais alta: " + nomeDoUsuarioMaisAlto);
        
    }
}

// 2. Prepare um algoritmo para perguntar o nome e a altura de 20 pessoas e informar:
// (a) a média destas alturas
// (b) a altura da pessoa mais baixa
// (c) o nome da pessoa mais alta