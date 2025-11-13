package Java.GP.String.NameVertically;

import java.io.PrintStream;
import java.util.Scanner;

public class NameVertically {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;

    print.print("Digite o seu nome: ");
    User user = new User(input.next());

    print.println(user.Vertically());

    input.close();
  }

  public static class User {
    String name;

    public User(String name){ 
      this.name = name; 
    }

    public String Vertically(){
      String newName = "";
      char[] nameArray = name.toCharArray();
      for(int i = 0; i < nameArray.length; i += 1)
        newName += nameArray[i] + "\n";
      
      return newName;
    }
  }
}