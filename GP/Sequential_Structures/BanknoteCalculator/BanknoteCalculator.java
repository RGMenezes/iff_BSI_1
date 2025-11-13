package Java.GP.Sequential_Structures.BanknoteCalculator;

import java.io.PrintStream;
import java.util.Scanner;

public class BanknoteCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int noteArray[] = {200, 100, 50, 20, 10, 5, 2, 1};
    String noteString = "serão usadas as notas: ";
    int value;

    print.println("Calculador do mínimo de céludas necessárias");

    print.print("Digite o valor total: ");
    value = input.nextInt();

    print.println("Para o valor de " + value + " " + noteQuantities(value, 0, noteArray, noteString));


    input.close();
  }

  public static String noteQuantities(int value, int initialNote, int noteArray[], String noteString){
    if(value == 0) return noteString;      
    if(initialNote >= noteArray.length) return "Error: Não há notas menores para calcular!"; 
    int banknote = noteArray[initialNote];
    
    if (value >= banknote) {
      int leftovers = value%banknote;
      int counter = (value - leftovers) / banknote;

      noteString += banknote + " x" + counter;     

      if (leftovers != 0) noteString += ", ";
      if (leftovers == 0) noteString += ".";

      return noteQuantities(leftovers, initialNote+1, noteArray, noteString);
    }
    
    return noteQuantities(value, initialNote+1, noteArray, noteString);
  }
}