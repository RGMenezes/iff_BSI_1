package Java.LinguagemDeProgramacao.Funcoes.Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = entradaDoTeclado.next().charAt(0);

        System.out.println(DeterminarLetra(letra));
    }

    static String DeterminarLetra(char valor){
        String mensagem;
        switch (valor) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                mensagem = "Vogal";
                break;
                
            default:
                mensagem = "Consoante";
                break;
        }
        return mensagem;
    }
}

// 5. Crie uma função que receba uma letra como parâmetro e retorne se a letra é uma vogal ou uma consoante.