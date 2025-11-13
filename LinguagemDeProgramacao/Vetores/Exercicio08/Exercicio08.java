package Java.LinguagemDeProgramacao.Vetores.Exercicio08;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Random entradaAleatoria = new Random(255);
        int listaA[] = new int[entradaAleatoria.nextInt(19) + 1];
        int listaB[] = new int[entradaAleatoria.nextInt(19) + 1];
        int listaSoma[];
        int contadorDeReticaoDeValores = 0;

        if(listaA.length > listaB.length){
            listaSoma = new int[listaA.length];
            for (int i = 0; i < listaA.length; i++) {
                int valorA = entradaAleatoria.nextInt(10);
                listaA[i] = valorA;
                listaSoma[i] = valorA;
                
                int valorB = entradaAleatoria.nextInt(10);
                if(i < listaB.length){
                    listaB[i] = valorB;
                    listaSoma[i] += valorB;
                    if(valorA == valorB){
                        contadorDeReticaoDeValores++;
                    }
                }
            }
        }else{
            listaSoma = new int[listaB.length];
            for (int i = 0; i < listaB.length; i++) {
                int valorB = entradaAleatoria.nextInt(10);
                listaB[i] = valorB;
                listaSoma[i] = valorB;

                int valorA = entradaAleatoria.nextInt(10);
                if(i < listaA.length){
                    listaA[i] = valorA;
                    listaSoma[i] += valorA;
                    if(valorA == valorB){
                        contadorDeReticaoDeValores++;
                    }
                }
            }
        }

        for (int i = 0; i < listaSoma.length; i++) {
            System.out.print(listaSoma[i] + " ");
        }
        System.out.println("\nMesmo número na mesma posição: " + contadorDeReticaoDeValores);
    }
}

// 8. Após ler dois vetores de inteiros A e B de tamanho N cada um:
// (a) Armazenar em um terceiro vetor ”Soma”, a soma dos elementos do vetor A com os do vetor B (respeitando
// as mesmas posições) e escrever os elementos deste
// (b) Escrever a quantidade de vezes que A e B possuem os mesmos números nas mesmas posições