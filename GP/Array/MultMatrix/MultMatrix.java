package Java.GP.Array.MultMatrix;

import java.util.Random;
import java.util.Scanner;

public class MultMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Matrix matrixA = new Matrix(3, 2);
    Matrix matrixB = new Matrix(2, 2);

    System.out.println("\nValor do preenchimento aleatório: ");
    int valueRandom = input.nextInt();
    matrixA.randomIncertion(valueRandom);
    matrixB.randomIncertion(valueRandom);

    System.out.println("\nMatriz A: ");
    System.out.println(matrixA.Show());
    System.out.println("\nMatriz B: ");
    System.out.println(matrixB.Show());

    System.out.println("\nResultado: ");
    System.out.println(matrixA.multiply(matrixB.matrix).Show());

    input.close();
  }

  public static class Matrix {
    int[][] matrix;
    int row;
    int column;
    
    public Matrix(int row, int column){
      this.row = row;
      this.column = column;
      this.matrix = new int[row][column];
    }

    public Matrix(int[][] matrix){
      this.matrix = matrix;
      this.row = matrix.length;
      this.column = matrix[0].length;
    }

    public void randomIncertion(int maxValue){
      Random random = new Random();

      for (int r = 0; r < row; r++)
        for (int c = 0; c < column; c++) 
          this.matrix[r][c] = random.nextInt(maxValue);
    }

    public Matrix multiply(int[][] otherMValue){
      Matrix otherM = new Matrix(otherMValue);
      int[][] newM = new int[this.row][otherM.column];

      if(this.column == otherM.row){
        
        for (int r = 0; r < this.row; r++){
          for (int c = 0; c < otherM.column; c++) {
            for (int i = 0; i < this.column; i++) {
                newM[r][c] += this.matrix[r][i] * otherM.matrix[i][c];
            }
          }
        }
        return new Matrix(newM);

      }else return null;
    }

    public Matrix transposed(){
      int[][] newM = new int[this.column][this.row];

      for (int r = 0; r < row; r++)
        for (int c = 0; c < column; c++) 
          newM[c][r] = this.matrix[r][c];
      
      return new Matrix(newM);
    }

    public String Show(){
      String message = "";
      
      for(int r = 0; r < this.row; r += 1){
        for(int c = 0; c < this.column; c += 1)
          message += this.matrix[r][c] + (c == this.column - 1 ? "" : " | ");
        
        if(r != this.row - 1) message += "\n";
      }

      return message;
    }
  }
}

// 92. Faça um programa que multiplique duas matrizes bi dimensionais.
// Matriz A tamanho 3 x 2;
// Matriz B tamanho 2 x 2;