// import java.util.Scanner;

// public class Exercicio05 {
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner entradaDoTeclado = new Scanner(System.in);
//         String listaDePessoas[] = new String[200];
//         int contadorMulher = 0;
//         int contadorHomem = listaDePessoas.length - 1;

//         while(contadorMulher <= contadorHomem){
//             char sexo;

//             do{
//                 System.out.print("\nDigite o sexo: ");
//                 sexo = entradaDoTeclado.nextLine().charAt(0);
//             } while(!(sexo == 'f' || sexo == 'F' || sexo == 'm' || sexo == 'M'));

//             System.out.print("Digite o nome: ");
//             if(sexo == 'f' || sexo == 'F'){
//                 listaDePessoas[contadorMulher] = entradaDoTeclado.nextLine();
//                 contadorMulher++;
//             }else{
//                 listaDePessoas[contadorHomem] = entradaDoTeclado.nextLine();
//                 contadorHomem--;
//             }
//         }

//         for (int i = 0; i < listaDePessoas.length; i++) {
//             System.out.println(listaDePessoas[i]);
//         }
//     }
// }

// // 5. Prepare um programa para perguntar o nome e o sexo de 200 pessoas. Vocˆe deve listar primeiro o nome de todas
// // as mulheres e depois o nome de todos os homens.