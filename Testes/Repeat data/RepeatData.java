import java.util.Scanner;

public class RepeatData {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o seu nome: ");
    String name = scanner.nextLine();

    System.out.print("Digite a sua idade: ");
    int age = scanner.nextInt();

    System.out.println("Olá " + name + ", você tem " + age + " anos.");

    scanner.close();
  }
}