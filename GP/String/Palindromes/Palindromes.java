package Java.GP.String.Palindromes;

import java.io.PrintStream;
import java.util.Scanner;

public class Palindromes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;

    print.print("Digite algo: ");
    Words word = new Words(input.nextLine());

    print.println("\n" + word.word);

    if(word.PalindromeTest())
      print.println("É um palíndromo!");
    else  
      print.println("Não é um palíndromo!");


    input.close();
  }

  public static class Words{
    String word;

    public Words(String word){
      this.word = word;
    }

    public boolean PalindromeTest(){
      char[] charWord = word.toCharArray();
      String newWord = "", invertedWord = "";

      for(int i = 0; i < word.length(); i += 1){
        if(charWord[i] != ' ')
          newWord += charWord[i];
        if(charWord[word.length() - (i + 1)] != ' ')
          invertedWord += charWord[word.length() - (i + 1)];
      }

      if(newWord.equalsIgnoreCase(invertedWord))
        return true;
      else 
        return false;
      
    }
  }
}