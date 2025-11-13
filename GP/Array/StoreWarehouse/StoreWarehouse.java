package Java.GP.Array.StoreWarehouse;

import java.util.Scanner;

public class StoreWarehouse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Qual o total de produtos? ");
    int productIndex = input.nextInt();
    String[][] arrayProducts = new String[productIndex][2];

    input.nextLine();
    for(int i = 0; i < productIndex; i += 1){
      System.out.print("Nome do produto: ");
      arrayProducts[i][0] = input.nextLine();
      arrayProducts[i][1] = "0";
    }

    int option = -1;
    while(true){
      System.out.println("\nEscolha uma das seguintes opções: ");

      for(int i = 0; i < arrayProducts.length; i += 1)
        System.out.println(i + " - " + arrayProducts[i][0] + ": " + arrayProducts[i][1]);
      
      System.out.println(arrayProducts.length + " - Sair");
      option = input.nextInt();
      
      if(option >= 0 && option < arrayProducts.length){
        while (true) {
          System.out.println("\nDigite C(compra) ou V(venda) para atualizar, " + arrayProducts[option][0] + ".");
          String optProduct = input.next();

          if(optProduct.equalsIgnoreCase("C")){
            System.out.println("Quantidade: ");
            Integer sum = Integer.parseInt(arrayProducts[option][1]) + input.nextInt();
            arrayProducts[option][1] = sum.toString();
            
            break;

          }else if(optProduct.equalsIgnoreCase("V")){
            System.out.println("Quantidade: ");
            Integer sum = Integer.parseInt(arrayProducts[option][1]) - input.nextInt();

            if(sum >= 0){
              arrayProducts[option][1] = sum.toString();
              break;
            }else{
              System.out.println("Não há produtos suficientes para realizer essa venda!");
            }

          }else System.out.println("Opção de compra ou venda inválida!");
        }

      }else if(option == arrayProducts.length)
        break;
      else
        System.out.println("\nOpição inválida!");
    }

    input.close();
  }
}


  // 89. Prepare um programa para controlar o estoque de uma loja. Inicialmente para cada um dos
  // 20 produtos desta loja, o programa deverá perguntar seu nome e a quantidade inicial.
  // Depois de ler estes dados iniciais o programa deverá ler várias fichas contendo:
  // Número do produto (inteiro de 1 a 20)
  // Tipo de transação ('C' ou 'V')
  // Quantidade (real)
  // Estas fichas podem ser tanto de compras (transação = 'C') quanto de vendas (transação =
  // 'V'). Quando for compra o programa deverá incluir a quantidade no estoque. Se for venda
  // deve retirar. Após leitura de todas as fichas que terminará com o número do produto = -1, o
  // programa deverá informar para cada produto o seu nome e estoque atual.