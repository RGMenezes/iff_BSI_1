package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        char letraInserida;

        System.out.print("\nInsira uma letra: ");
        letraInserida = entradaDoTeclado.next().charAt(0);

        if(
            letraInserida == 'a' || letraInserida == 'A' ||
            letraInserida == 'e' || letraInserida == 'E' ||
            letraInserida == 'i' || letraInserida == 'I' ||
            letraInserida == 'o' || letraInserida == 'O' ||
            letraInserida == 'u' || letraInserida == 'U'
        ){
            System.out.println(letraInserida + " é uma vogal.");
        }else{
            System.out.println(letraInserida + " é uma consoante.");
        }
    }
}

// 4. Fa¸ca um programa que verifique se uma letra digitada ´e vogal ou consoante.