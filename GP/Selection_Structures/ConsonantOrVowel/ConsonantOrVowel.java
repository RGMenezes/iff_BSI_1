package Java.GP.Selection_Structures.ConsonantOrVowel;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsonantOrVowel {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    String letter = "";
    String result = "";
    String consonant[] = "qwrptysçldkfjhgmnbvcxz".split("");
    String vowel[] = "aeiou".split("");
    int counter = 0;

    while (letter.length() != 1 ) {
      print.print("Digite uma letra: ");
      letter = input.next();
    }

    while (!result.equals("Consoante") && !result.equals("Vogal") && !result.equals("Não é letra")) {
      if(consonant.length - 1 < counter) result = "Não é letra";
      else{
        if(vowel.length - 1 >= counter){
          if (vowel[counter].equals(letter)) result = "Vogal";
        }

        if (consonant[counter].equals(letter)) result = "Consoante";
      }
      counter += 1;
    }

    print.println("O resultado é: " + result + ".");

    input.close();
  }
}