package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio04;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        preencherVetor(vetor, -10, 10);
        System.out.println(mostrarVetor(vetor));
        ordenarVetor(vetor);
        System.out.println(mostrarVetor(vetor));
    }

    static void ordenarVetor(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            for (int contadorAtual = 0; contadorAtual < vetor.length-1; contadorAtual++) {
                int proximoContador = contadorAtual + 1;
                if(vetor[proximoContador] > vetor[contadorAtual]){
                    int copia = vetor[contadorAtual];
                    vetor[contadorAtual] = vetor[proximoContador];
                    vetor[proximoContador] = copia;
                }
            }
        }
    }

    static void preencherVetor(int vetor[], int min, int max){
        Random entradaAleatoria = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entradaAleatoria.nextInt(max + (-1 * min)) + min;
        }
    }
    
    static String mostrarVetor(int vetor[]){
        String retorno = "";
        for (int i = 0; i < vetor.length; i++) {
            retorno += vetor[i] + " ";
        }
        return retorno;
    }
}

// 4. Faça uma função para receber um vetor de números inteiros e ordenar o vetor em ordem decrescente.Faça um
// programa principal para testar a função e imprimir o resultado do processamento.