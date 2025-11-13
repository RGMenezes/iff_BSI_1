package Java.GP.Array.SumOfMatrices;

import java.io.PrintStream;
import java.util.Random;

public class SumOfMatrices {
  public static void main(String[] args) {
    PrintStream console = System.out;
    Matrix matrixA = new Matrix(5, 3);
    Matrix matrixB = new Matrix(5, 3);
    Matrix matrixSum = new Matrix(5, 3);
    
    matrixA.RandomFill(10);
    matrixB.RandomFill(10);

    console.println("Matrix A: ");
    console.println(matrixA.Show());

    console.println("\nMatrix B: ");
    console.println(matrixB.Show());

    int[][] sumResult = matrixA.Sum(matrixB.matrix);
    if(sumResult == null){
      console.println("Dimensões incompatíveis para soma!");
    }else{
      matrixSum.Fill(sumResult);
      
      console.println("\nMatrix Soma: ");
      console.println(matrixSum.Show());
    }
  }

  public static class Matrix{
    int[][] matrix;

    public Matrix(int row, int column){
      this.matrix = new int[row][column];
    }

    public void RandomFill(int maxValue){
      Random random = new Random();
      for(int row = 0; row < this.matrix.length; row += 1)
        for(int column = 0; column < this.matrix[row].length; column += 1)
          this.matrix[row][column] = random.nextInt(maxValue);
    }
    
    public boolean Dimension(int[][] matrixComper){
      boolean comperRow = this.matrix.length == matrixComper.length;
      boolean comperColumn = this.matrix[0].length == matrixComper[0].length; 
      if(comperRow && comperColumn) return true;
      else return false;
    }

    public int[][] Sum(int[][] otherMatrix){
      int[][] sumMatrix = new int[this.matrix.length][this.matrix[0].length];

      if(this.Dimension(otherMatrix)){

        for(int row = 0; row < this.matrix.length; row += 1)
          for(int column = 0; column < this.matrix[row].length; column += 1)
            sumMatrix[row][column] = this.matrix[row][column] + otherMatrix[row][column];

        return sumMatrix;

      }else return null;
    }

    public String Show(){
      String message = "";
      
      for(int row = 0; row < this.matrix.length; row += 1){
        for(int column = 0; column < this.matrix[row].length; column += 1)
          message += this.matrix[row][column] + (column == this.matrix[row].length - 1 ? "" : " | ");
        
        if(row != this.matrix.length - 1) message += "\n";
      }

      return message;
    }

    public void Fill(int[][] newMatrix){
      if(this.Dimension(newMatrix))
        this.matrix = newMatrix;
    }
  } 
}

// 79. Faça um programa para ler duas matrizes A e B, cada uma de duas dimensões com 5 linhas e
// 3 colunas. Construir uma matriz C de mesma dimensão, onde C é formada pela soma dos
// elementos da matriz A com os elementos da matriz B.