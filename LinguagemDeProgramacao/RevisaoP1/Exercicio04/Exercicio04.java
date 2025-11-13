package Java.LinguagemDeProgramacao.RevisaoP1.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        String primeiraPalavra, segundaPalavra;

        System.out.print("\nPrimeira palavra: ");
        primeiraPalavra = entradaDoTeclado.next();

        System.out.print("Segunda palavra: ");
        segundaPalavra = entradaDoTeclado.next();

        if(primeiraPalavra.length() > segundaPalavra.length()){
            System.out.println(segundaPalavra);
            
        }else{
            if(primeiraPalavra.length() == segundaPalavra.length()){
                System.out.println("São do mesmo tamanho.");
                
            }else{
                System.out.println(primeiraPalavra);
            }
        }

    }
}

// 4. Programa que lê duas palavras da entrada e, na saı́da, imprime a menor palavra.