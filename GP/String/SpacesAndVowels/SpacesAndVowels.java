package Java.GP.String.SpacesAndVowels;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class SpacesAndVowels {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    File path = new File("Java/GP/String/SpacesAndVowels/phrases.txt");
    Phrases phrases = new Phrases(null);

    while(phrases.phrase == null || phrases.phrase.length() <= 0){
      print.print("Digite a sua frase: ");
      phrases.phrase = input.nextLine();
    }

    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String line;
      String phrasesArc = null;

      while((line = reader.readLine()) != null){
        if(line.equalsIgnoreCase(phrases.phrase)){
          phrasesArc = line;
          break;
        }
      }
      reader.close();
      
      if(phrasesArc == null){
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.write(phrases.phrase + "\n");
        writer.flush();
        writer.close();  
      }
      print.println("\n" + phrases.phrase + "\nVogais: " + phrases.Vowels() + "\nEspaços: " + phrases.Spaces() + "\n");
      
      print.println("Frases salvas:\n");
      line = null;
      BufferedReader readerShow = new BufferedReader(new FileReader(path));
      while((line = readerShow.readLine()) != null){
        Phrases arcPhrases = new Phrases(line);
        print.println(arcPhrases.phrase + "\nVogais: " + arcPhrases.Vowels() + "\nEspaços: " + arcPhrases.Spaces() + "\n");
      }
      readerShow.close();

    } catch (Exception e) {
      print.println(e);
    }

    input.close();
  }

  public static class Phrases {
    String phrase;

    public Phrases(String phrase){
      this.phrase = phrase;
    }

    public int Spaces() {
      return phrase.split(" ").length - 1;
    }

    public int Vowels() {
      int conterVowel = 0;
      String[] vowels = {"a", "e", "i", "o", "u"};
      String[] arrayPhrase = phrase.split("");
      for(int i = 0; i < arrayPhrase.length; i += 1){
        for(int iV = 0; iV < vowels.length; iV += 1){
          if(arrayPhrase[i].equalsIgnoreCase(vowels[iV]))
            conterVowel += 1;
        }
      }
      return conterVowel;
    }
  }
}
