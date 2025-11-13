package Java.Testes.JavaXJs.CalculadoraAnoBissextoJava;

import java.util.Scanner;

public class CalculadoraAnoBissexto {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner entradaDoTeclado = new Scanner(System.in);
    int ano;

    System.out.print("\nEscreva o ano: ");
    ano = entradaDoTeclado.nextInt();

    boolean anoDivisivelPor4 = ano%4 == 0;
    boolean anoDivisivelPor100 = ano%100 == 0;
    boolean anoDivisivelPor400 = ano%400 == 0;

    if( anoDivisivelPor4 && (!anoDivisivelPor100 || anoDivisivelPor400) ){
      System.out.println("O ano " + ano + " é bissexto.");
    }else{
      System.out.println("O ano " + ano + " não é bissexto.");
    }
  }
}