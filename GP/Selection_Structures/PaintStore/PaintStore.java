package Java.GP.Selection_Structures.PaintStore;

import java.io.PrintStream;
import java.util.Scanner;

public class PaintStore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    double area;
    double paint[][] = {{3.6*6, 25}, {18*6, 80}};
    int sale = 0;

    print.print("Qual o tamanho da área a ser pintada(m²): ");
    area = input.nextDouble();

    //3,6l
    for(int cont = 0;paint[0][0] * (cont-1) < area; cont++){
      if(area <= paint[0][0] * cont) sale = cont;
    }
    print.println("Lata 3,6l: " + sale + " un, " + String.format("%.2f", paint[0][1]*sale) + "reais, área coberta " + String.format("%.2f", paint[0][0]*sale) + "m².");
    
    //18l
    sale = 0;
    for(int cont = 0;paint[1][0] * (cont-1) < area; cont++){
      if(area <= paint[1][0] * cont) sale = cont;
    }
    print.println("Lata 18l: " + sale + " un, " + String.format("%.2f", paint[1][1]*sale) + "reais, área coberta " + String.format("%.2f", paint[1][0]*sale) + "m².");
    
    //3,6l and 18l
    sale = 0;
    if(paint[1][0] <= area){
      for(int cont = 0;paint[1][0] * (cont-1) < area - area%paint[1][0]; cont++){
        if(area - area%paint[1][0] <= paint[1][0] * cont) {
          print.print("Lata 18l, " + cont + " un. ");
          sale = cont;
        };
      }
    }
    for(int cont = 0;paint[0][0] * (cont-1) < area - paint[1][0] * sale; cont++){
      if(area - paint[1][0] * sale <= paint[0][0] * cont) {
        print.print("Lata 3,6l, " + cont + " un. ");
        print.print(String.format("%.2f", cont * paint[0][1] + sale * paint[1][1]) +" reais,");
        print.println(" área coberta " + String.format("%.2f", cont * paint[0][0] + sale * paint[1][0]) + "m².");
      };
    }

    input.close();
  }
}