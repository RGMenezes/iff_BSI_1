package Java.GP.String.NameComparison;

import java.io.*;
import java.util.Scanner;

public class NameComparison {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    int maxSize = 20;
    User user = new User(null);
    User userComparison = new User(null);
    
    while (user.name == null || user.name.length() >= maxSize) {
      print.print("Digite o seu nome, (20char): ");
      user.name = input.nextLine();
    }

    while (userComparison.name == null || userComparison.name.length() >= maxSize) {
      print.print("Digite o nome para comparar, (20char): ");
      userComparison.name = input.nextLine();
    }

    print.println("Nomes de trás para frente: \n" + user.ToBack() + "\n" + userComparison.ToBack());

    if(user.Comparison(userComparison.name))
      print.println("Os nomes são idênticos.");
    else
      print.println("Os nomes não são idênticos.");

    print.println(user.name + userComparison.name);

    input.close();
  }

  public static class User {
    String name;

    public User(String name){
      this.name = name;
    }

    public String ToBack(){
      char[] nameArr = name.toCharArray();
      String newName = "";
      for(int i = name.length(); i > 0; i -= 1)
        newName += nameArr[i - 1];

      return newName;
    }

    public boolean Comparison(String nameComp){
      if(name.length() != nameComp.length())
        return false;
      
      char[] nameArr = name.toCharArray();
      char[] nameCompArr = nameComp.toCharArray();

      for(int i = 0; i < name.length(); i += 1)
        if(nameArr[i] != nameCompArr[i]) return false;
      
      return true;
    }
  }
}