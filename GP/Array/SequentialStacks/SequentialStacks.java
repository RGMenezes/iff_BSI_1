package Java.GP.Array.SequentialStacks;

import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class SequentialStacks {
  static int storageElementsSize = 46;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream console = System.out;
    String storageFileName = "storageBook.dat";
    int pileSize = 10;

    try(RandomAccessFile storage = new RandomAccessFile(storageFileName, "rw")) {
      long storageSize = storage.length();

      Pile bookRead = new Pile(pileSize);
      Pile bookReading = new Pile(pileSize);

      for(int i = 0; i < storageSize; i += storageElementsSize){
        byte[] bytes = new byte[storageElementsSize];
        storage.seek(i);
        storage.read(bytes);

        String str = new String(bytes).trim();
        Book book = new Book(-1, str);

        if(book.id % 2 == 0){
          bookRead.In(book);
        }else{
          bookReading.In(book);
        }
      }

      while (true) {
        boolean loopBreak = false;

        int option = 0;

        console.println("\nMenu: ");
        console.println("1 - Adicionar livro em Lidos");
        console.println("2 - Adicionar livro em Lendo");
        console.println("3 - Remover livro de Lidos");
        console.println("4 - Remover livro de Lendo");
        console.println("5 - Ver livro Lido");
        console.println("6 - Ver livro Lendo");
        console.println("7 - Ver todos os livros Lidos");
        console.println("8 - Ver todos os livros Lendo");
        console.println("9 - Sair");
        option = input.nextInt();

        input.nextLine();
        switch (option) {
          case 1:
            String bookName;

            while (true) {
              console.println("\nNome do livro (20): ");
              bookName = input.nextLine();
              
              if(bookName.length() > 20){
                console.println("Tamanho inválido!");
              }else
                break;
            }
            int length = bookRead.FullShow() == null ? 0 : bookRead.FullShow().length;
            Book book = new Book(length % 2 == 1 ? length + 1 : length, bookName);

            if(bookRead.In(book)){
              storage.seek(book.id * storageElementsSize);
              byte[] bytes = book.toStringStorage().getBytes();
              storage.write(bytes);
              console.println(bookName + " adicionado com sucesso.");
            }else{
              console.println("Lista cheia!");
            }
            
            break;

          case 2:
            String bookName2;

            while (true) {
              console.println("\nNome do livro (20): ");
              bookName2 = input.nextLine();
              
              if(bookName2.length() > 20){
                console.println("Tamanho inválido!");
              }else
                break;
            }
            int length2 = bookReading.FullShow() == null ? 0 : bookReading.FullShow().length;
            Book book2 = new Book(length2 % 2 == 0 ? length2 + 1 : length2, bookName2);

            if(bookReading.In(book2)){
              storage.seek(book2.id * storageElementsSize);
              byte[] bytes = book2.toStringStorage().getBytes();
              storage.write(bytes);
              console.println(bookName2 + " adicionado com sucesso.");
            }else{
              console.println("Lista cheia!");
            }
            
            break;
            
          case 3:
            Book copyBook = bookRead.Show();
            if(bookRead.Out()){
              storage.seek(copyBook.id * storageElementsSize);
              storage.write(new byte[storageElementsSize]);
              console.println(copyBook.name + " removido com sucesso.");
            }else{
              console.println("Lista vazia!");
            }
            break;
            
          case 4:
            Book copyBook2 = bookReading.Show();
            if(bookReading.Out()){
              storage.seek(copyBook2.id * storageElementsSize);
              storage.write(new byte[storageElementsSize]);
              console.println(copyBook2.name + " removido com sucesso.");
            }else{
              console.println("Lista vazia!");
            }
            break;

          case 5:
            Book bookShow = bookRead.Show();
            if(!(bookShow == null))
              console.println(bookShow.name);
            else
              console.println("Pilha vazia!");
            break;

          case 6:
            Book bookShow2 = bookReading.Show();
            if(!(bookShow2 == null))
              console.println(bookShow2.name);
            else
              console.println("Pilha vazia!");
            break;

          case 7:
            Book[] books = bookRead.FullShow();
            if(!(books == null)){
              console.println("\nLivros na pilha: ");
              for(int i = 0; i < books.length; i += 1)
                console.println(books[i].name);
            }else
              console.println("Pilha vazia!");
            break;

          case 8:
            Book[] books2 = bookReading.FullShow();
            if(!(books2 == null)){
              console.println("\nLivros na pilha: ");
              for(int i = 0; i < books2.length; i += 1)
                console.println(books2[i].name);
            }else
              console.println("Pilha vazia!");
            break;

          case 9:
            loopBreak = true;
            break;
        
          default:
            console.println("\nOpção inválida!");
            break;
        }
        
        if(loopBreak) break;
      }
      
    } catch (Exception e) {
      console.println("ERRO:\n" + e);
    }

    input.close();
  }

  public static class Book{
    int id;
    String name;
    
    public Book(int id, String name){
      if(id == -1){
        String[] newBook = name.split("=");
        this.name = newBook[1];
        this.id = Integer.parseInt(newBook[0]);
      }else{
        this.name = name;
        this.id = id;
      }
    }

    public String toStringStorage(){
      String newString = "";
      newString += (this.id < 10 ? "0" + this.id : this.id) + "=" + this.name;
      for(int i = newString.length(); i <= storageElementsSize / 2; i += 1)
        newString += '=';
      return newString;
    }
  }

  public static class Pile{
    Book[] pile;
    int size;
    int top;

    public Pile(int size){
      this.pile = new Book[size];
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

    public boolean In(Book value){
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

    public Book Show(){
      if(!this.Empty()){
        return this.pile[this.top];
      }else
        return null;
    }

    public Book[] FullShow(){
      if(!this.Empty()){
        Book[] newPile = new Book[top+1];
        for(int i = 0; i < top+1; i += 1)
          newPile[i] = this.pile[i];

        return newPile;
      }else 
        return null;
    }
  }
}

// 85. Criar um programa de inserção e remoção para duas pilhas armazenadas em alocação
// sequencial que compartilham a memória de dimensão M.