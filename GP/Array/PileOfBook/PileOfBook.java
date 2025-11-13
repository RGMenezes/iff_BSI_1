package Java.GP.Array.PileOfBook;

import java.io.PrintStream;
import java.util.Scanner;

public class PileOfBook {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    int size;
    Pile pileBook;

    console.print("Qual o tamanho total da pilha? ");
    size = input.nextInt();
    pileBook = new Pile(size);

    while(true){
      int option = 0;
      boolean loopBreak = false;

      console.println("\nEscolha uma das opções: ");
      console.println("1 - Adicionar livro");
      console.println("2 - Remover livro");
      console.println("3 - Ver livro");
      console.println("4 - Ver todos os livros");
      console.println("5 - Sair");
      option = input.nextInt();

      switch (option) {
        case 1:
          input.nextLine();
          console.print("\nNome do livro: ");
          String bookName = input.nextLine();
          if(pileBook.In(bookName))
            console.println("Livro adicionado com sucesso!");
          else
            console.println("Pilha cheia!");
          break;

        case 2:
          if(pileBook.Out())
            console.println("Livro removido com sucesso!");
          else
            console.println("Pilha vazia!");
          break;

        case 3:
          Object book = pileBook.Show();
          if(!(book == null))
            console.println(book);
          else
            console.println("Pilha vazia!");
          break;

        case 4:
          Object[] books = pileBook.FullShow();
          if(!(books == null)){
            console.println("\nLivros na pilha: ");
            for(int i = 0; i < books.length; i += 1)
              console.println(books[i]);
          }else
            console.println("Pilha vazia!");
          break;

        case 5:
            loopBreak = true;
          break;

        default:
          console.println("\nOpção inválida!");
          break;
      }

      if(loopBreak) break;
    }

    input.close();
  }

  public static class Pile{
    Object[] pile;
    int size;
    int top;

    public Pile(int size){
      this.pile = new Object[size];
      this.size = size;
      this.top = -1;
    }

    public boolean Full(){
      if(top == size - 1) return true;
      else return false;
    }

    public boolean Empty(){
      if(top == -1) return true;
      else return false;
    }

    public boolean In(Object value){
      if(!this.Full()){
        this.pile[top+1] = value;
        this.top += 1;
        return true; 

      }else
        return false;
    }

    public boolean Out(){
      if(!this.Empty()){
        this.top -= 1;
        return true;
      
      }else
        return false;
    }

    public Object Show(){
      if(!this.Empty()){
        return this.pile[this.top];
      }else
        return null;
    }

    public Object[] FullShow(){
      if(!this.Empty()){
        Object[] newPile = new Object[top+1];
        for(int i = 0; i < top+1; i += 1)
          newPile[i] = this.pile[i];

        return newPile;
      }else 
        return null;
    }
  }
}

// 82. Faça um programa que simule uma pilha de livros. Um livro só poderá ser incluído no topo
// da pilha (respeitar o tamanho máximo do vetor - seu critério) , assim como sua retirada.
// Implemente os procedimentos de inserção, retirada e listagem da pilha.