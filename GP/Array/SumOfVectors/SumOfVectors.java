package Java.GP.Array.SumOfVectors;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class SumOfVectors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    Random random = new Random();
    int repeatValue = 0, randomMax = 0, maxLength = 0;
    int[] arrayA, arrayB, arraySum;
    
    print.print("Qual tamanho da primeira lista? ");
    arrayA = new int[input.nextInt()];
    
    print.print("Qual tamanho da segunda lista? ");
    arrayB = new int[input.nextInt()];

    print.print("Qual o limite dos números gerados? ");
    randomMax = input.nextInt();

    for(int i = 0; i < arrayA.length; i += 1)
      arrayA[i] = random.nextInt(randomMax);

    for(int i = 0; i < arrayB.length; i += 1)
      arrayB[i] = random.nextInt(randomMax);
    
    if(arrayA.length > arrayB.length)
      maxLength = arrayA.length;
    else
      maxLength = arrayB.length;
    
    arraySum = new int[maxLength];
    for(int i = 0; i < maxLength; i += 1){
      int intA = arrayA.length > i ? arrayA[i] : 0;
      int intB = arrayA.length > i ? arrayB[i] : 0;
      
      arraySum[i] = intA + intB;
      
      if(intA == intB) repeatValue += 1;
    }
    
    print.println("\nTivemos " + repeatValue + " repetições de valores.");
    
    for(int i = 0; i < arraySum.length; i += 1)
      print.println("Posição: " + (i + 1) + ", Valor: " + arraySum[i]);

    input.close();
  }
}

// 71. Após ler dois vetores de inteiros A e B de tamanho N cada um:
// -Armazenar em um terceiro vetor "Soma", a soma dos elementos do vetor A com os do vetor
// B (respeitando as mesmas posições) e escrever os elementos deste.
// - Escrever a quantidade de vezes que A e B possuem os mesmos números nas mesmas
// posições.