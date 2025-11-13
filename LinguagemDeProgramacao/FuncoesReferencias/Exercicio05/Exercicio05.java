package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Digite: ");
        String palavras = entradaTeclado.nextLine();
        char[] listaLetras = separarLetras(palavras);
        System.out.println(mostrarVetor(listaLetras));
    }

    static char[] separarLetras(String palavras){
        char listaLetras[] = new char[palavras.length()];
        for (int i = 0; i < palavras.length(); i++) {
            listaLetras[i] = palavras.charAt(i);
        }
        return listaLetras;
    }

    static String mostrarVetor(char vetor[]){
        String retorno = "";
        for (int i = 0; i < vetor.length; i++) {
            retorno += vetor[i] + " ";
        }
        return retorno;
    }
}

// 5. Faça uma função que receba uma string por parâmetro e retorne um vetor de char com o conteúdo da string.
// Faça um programa principal para testar a função e imprimir o resultado do processamento.
// Obs: Não utilizar funções prontas da linguagem para a conversão.