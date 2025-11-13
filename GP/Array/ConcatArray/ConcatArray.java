package Java.GP.Array.ConcatArray;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class ConcatArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    int[] arrayA = new int[30], arrayB = new int[30];

    console.print("Qual o valor maximo? ");
    int maxValue = input.nextInt();

    CompleteArray(arrayA, maxValue);
    CompleteArray(arrayB, maxValue);

    console.println("Lista A:");
    ShowArray(arrayA);
    console.println("\nLista B:");
    ShowArray(arrayB);
    
    int indexMax = arrayA.length + arrayB.length;
    int[] newArray = new int[indexMax];
    for(int i = 0; i < indexMax; i += 1){
      if(i < arrayA.length)
      newArray[i] = arrayA[i];
      else
      newArray[i] = arrayB[i - arrayA.length];
    }
    
    console.println("\nLista A + B:");
    ShowArray(newArray);

    input.close();
  }
  
  public static void CompleteArray(int[] array, int value){
    Random random = new Random();
    for(int i = 0; i < array.length; i += 1)
    array[i] = random.nextInt(value);
  }
  
  public static void ShowArray(int[] array){
    PrintStream console = System.out;
    String list = "";
    for(int i = 0; i < array.length; i += 1){
      if(i == array.length - 1) list += (array[i] + '.');
      else list += (array[i] + ", ");
    }
    console.println(list);
  }
}

// 76. Faça um programa que leia dois vetores de 30 elementos e depois crie um terceiro que seja a
// junção dos dois primeiros (60 elementos).