package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        System.out.println(identificarNome(entradaDoTeclado.nextLine()));
    }

    static int identificarNome(String nome){
        String vetorNomes[] = {"Marcos", "Asafe", "Rafael", "Lucas", "Gabriel"};
        int retorno = -1;
        for (int i = 0; i < vetorNomes.length; i++) {
            if(vetorNomes[i].equalsIgnoreCase(nome)){
                retorno = i + 1;
            }
        }
        return retorno;
    }
}

// 3. Faça uma função para receber uma lista de nomes e um nome a ser procurado. Caso o nome esteja na lista
// a função deverá retornar a posição do mesmo na lista, caso contrário deverá retornar -1. Faça um programa
// principal para testar a função.