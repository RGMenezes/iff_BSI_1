package Java.GP.Array.KeepingOrder;

import java.io.PrintStream;
import java.util.Scanner;

public class KeepingOrder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    NumberList list;

    console.print("Qual o tamanho da lista? ");
    list = new NumberList(input.nextInt());

    while (true) {
      boolean loopBreak = false;

      console.println("\nEscolha uma das opções");
      console.println("1 - Adicionar valor");
      console.println("2 - Remover valor");
      console.println("3 - Mostrar lista");
      console.println("4 - Sair");
      console.print("Opção escolhida: ");
      int option = input.nextInt();
      input.nextLine();

      switch (option) {
        case 1:
          console.print("Digite o valor: ");
          if(list.In(input.nextInt()) == null)
            console.println("Lista cheia!");
          else
            console.println(list.Show());
          break;

        case 2:
          console.print("Digite o valor: ");
          if(list.Out(input.nextInt()) == null)
            console.println("Lista vazia!");
          else
            console.println(list.Show());
          break;

        case 3:
          console.println("Lista: ");
          console.println(list.Show());
          break;
      
        case 4:
          loopBreak = true;
          break;
      
        default:
          console.println("\nOpção inválida");
          break;
      }

      if(loopBreak) break;
    }

    input.close();
  }
  
  public static class NumberList{
    int[] list;
    int size;
    int amount;

    public NumberList(int size){
      this.list = new int[size];
      this.size = size;
      this.amount = 0;
    }
    
    public boolean Full(){
      if(amount == size) return true;
      else return false;
    }

    public boolean Empty(){
      if(amount == 0) return true;
      else return false;
    }

    public int[] In(int value){
      if(!this.Full()){
        if(this.amount == 0)
          this.list[0] = value;
        else{
          boolean addvalue = false;
          int[] newList = new int[size];

          for(int i = 0; i < this.amount; i += 1){
            if(addvalue){
              newList[i + 1] = this.list[i];
              
            }else{
              if(value <= this.list[i]){
                newList[i] = value;
                newList[i+1] = this.list[i];
                addvalue = true;
              }else
                newList[i] = this.list[i];
            }
          }

          if(!addvalue)
            newList[this.amount] = value;
          
          this.list = newList;
        }
        this.amount += 1;
        return this.list;
      }else
        return null;
    }

    public int[] Out(int value){
      if(!this.Empty()){
        if(this.amount == 1){
          this.list = new int[size];
          this.amount = 0;

        }else{
          boolean remValue = false;
          int[] newList = new int[size];

          for(int i = 0; i < this.amount; i += 1){
            if(remValue){
              newList[i-1] = this.list[i];
              
            }else{
              if(value == this.list[i])
                remValue = true;
              else
                newList[i] = this.list[i];
            }
          }
          
          if(remValue){
            this.amount -= 1;
            this.list = newList;
          }
        }
        return this.list;
      }else
        return null;
    }
  
    public String Show(){
      String message = "";
      if(!(this.amount == 0))
        for(int i = 0; i < this.amount; i += 1)
          message += this.list[i] + (i == (this.amount - 1) ? "." : ", ");

      else
        message = "Lista vazia!";
    
      return message;
    }
  }
}

// 84. Implemente um programa para inserção e remoção de elementos em um vetor ordenado,
// fazendo com que o mesmo permaneça neste estado.