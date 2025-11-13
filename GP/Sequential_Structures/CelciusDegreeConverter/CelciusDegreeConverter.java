package Java.GP.Sequential_Structures.CelciusDegreeConverter;

import java.util.Scanner;

public class CelciusDegreeConverter{
  public static int[] celciusConverter(int celcius){
    int fahrenheit = (9 * celcius + 160) / 5;
    int kelvin = celcius + 273;
    int[] arrayFK = {fahrenheit, kelvin};

    return arrayFK;
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos graus celcius faz em sua cidade? ");
    int[] arrayConverterFK = celciusConverter(scanner.nextInt());

    System.out.print("Em fahrenheit são " + arrayConverterFK[0] + "°, ");
    System.out.print("já em kelvin são " + arrayConverterFK[1] + "°.");

    scanner.close();
  }
}