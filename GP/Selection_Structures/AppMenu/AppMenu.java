// import java.io.PrintStream;
// import java.util.Scanner;

// public class AppMenu {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     PrintStream print = System.out;
//     int valueMenu;
//     String arrayOptions[] = {"Fim", "Cadastro", "Consulta"}; 

//     print.println("Menu principal");
//     print.println("1 - Fim");
//     print.println("2 - Cadastro");
//     print.println("3 - Consulta");
//     valueMenu = input.nextInt();

//     if(valueMenu > 0 && valueMenu <= 3) print.println("Você escolheu a opçao: " + arrayOptions[valueMenu - 1] + ".");
//     else print.println("Opção inválida");

//     input.close();
//   }
// }