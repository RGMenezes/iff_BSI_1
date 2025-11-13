package Java.GP.Sequential_Structures.NoteByWeight;

import java.io.PrintStream;
import java.util.Scanner;

public class NoteByWeight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    Notes notes = new Notes(0, 0, 0);

    print.println("Calculadora de notas por peso.");
    print.print("Nota 1: ");
    notes.note1 = input.nextInt();

    print.print("Nota 2: ");
    notes.note2 = input.nextInt();

    print.print("Nota 3: ");
    notes.note3 = input.nextInt();

    print.println("A média é: " + String.format("%.2f", notes.weightCalculate()));

    input.close();
  }

  public static class Notes{
    int note1;
    int note2;
    int note3;

    public Notes(int note1, int note2, int note3){
      this.note1 = note1;
      this.note2 = note2;
      this.note3 = note3;
    }

    public double weightCalculate(){
      return (this.note1 + this.note2 * 2 + this.note3 * 3) / 6;
    }
  }
}
