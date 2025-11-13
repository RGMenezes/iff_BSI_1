package Java.GP.Array.SortingArray;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class SortingArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    
    console.print("Qual o limite dos valores? ");
    int valueLmt = input.nextInt();

    console.print("Qual o tamanho da lista? ");
    int indexMax = input.nextInt();
    int[] array = new int[indexMax];

    Random random = new Random();
    for(int i = 0; i < array.length; i += 1)
      array[i] = random.nextInt(valueLmt);

    array = QuickSort(array);

    for(int i = 0; i < array.length; i += 1)
      console.print(array[i] + "\n");
  
    input.close();
  }

  public static int[] QuickSort(int[] array){
    if(array.length <= 1) return array;

    int pivot = array[0];
    int[] array0 = {};
    int[] array1 = {};
    int[] pivotArray = {};

    for(int i = 0; i < array.length; i += 1){
      if(array[i] < pivot) 
        array0 = addElementArray(array0, array[i]);
      else if(array[i] > pivot)
        array1 = addElementArray(array1, array[i]);
      else
        pivotArray = addElementArray(pivotArray, array[i]);
      
    }

    array0 = concatArray(QuickSort(array0), pivotArray);
    return concatArray(array0, QuickSort(array1));
  }

  public static int[] addElementArray(int[] array, int value){
    int indexMax = array.length;
    int[] newArray = new int[indexMax + 1];
    for(int i = 0; i < array.length; i += 1)
      newArray[i] = array[i];

    newArray[indexMax] = value;
    return newArray;
  }

  public static int[] concatArray(int[] array1, int[] array2){
    int[] newArray = new int[array1.length + array2.length];
    
    for(int i = 0; i < array1.length; i += 1)
      newArray[i] = array1[i];
    
    for(int i = array1.length; i < array1.length + array2.length; i += 1)
      newArray[i] = array2[i - array1.length];
    
    return newArray;
  }
}

// 73. Faça um programa que ordene um vetor, sem usar funções prontas da linguagem.