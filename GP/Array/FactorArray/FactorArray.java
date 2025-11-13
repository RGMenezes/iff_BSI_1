package Java.GP.Array.FactorArray;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class FactorArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    Array array = new Array(15);

    array.RandomFill(10);

    console.println("Lista inicial: ");
    console.println(array.Show());

    console.println("\nLista fatorial: ");
    console.println(array.ShowFactor()); 

    input.close();
  }

  public static class Array{
    int[] array;

    public Array(int indexArray){
      this.array = new int[indexArray];
    }

    public void RandomFill(int maxValue){
      Random random = new Random();
      for(int i = 0; i < this.array.length; i += 1)
        this.array[i] = random.nextInt(maxValue);
    }
    
    public int[] FactorElements(){
      int[] arrayFactor = new int[this.array.length];
      for(int i = 0; i < this.array.length; i += 1){
        if(this.array[i] == 0)
          arrayFactor[i] = 0;
        else{
          int valueFactor = 1;
          for(int loopFactor = valueFactor; loopFactor <= this.array[i]; loopFactor += 1)
            valueFactor *= loopFactor;
          
          arrayFactor[i] = valueFactor;
        }
      }
      return arrayFactor;
    }

    public String Show(){
      String message = "";
      for(int i = 0; i < this.array.length; i += 1)
        message += this.array[i] + (i == (this.array.length - 1) ? "." : ", ");
    
      return message;
    }

    public String ShowFactor(){
      String message = "";
      int[] arrayFactor = this.FactorElements();
      for(int i = 0; i < arrayFactor.length; i += 1)
        message += arrayFactor[i] + (i == (arrayFactor.length - 1) ? "." : ", ");
    
      return message;
    }
  }
}
// 78. Faça um programa que leia um vetor de 15 elementos. Crie um segundo vetor onde cada
// elemento possua o fatorial do elemento do primeiro vetor.