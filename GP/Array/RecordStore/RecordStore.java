package Java.GP.Array.RecordStore;

import java.util.Random;
import java.util.Scanner;

public class RecordStore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    double[] disks = {10.50, 12.99, 11, 9.89, 13.47, 11.53};
    String[] sellers = {"Malu", "Antônia", "Cris", "Junin", "SR Eduardo", "Jão", "Silvia", "Kat", "Roberto", "Neto", "Admilson", "Clara", "Milena", "Enzo", "Valentina"};

    System.out.print("Quantidade de simulação: ");
    int simulation = input.nextInt();

    Sheet[] sheets = new Sheet[simulation];

    for (int s = 0; s < simulation; s++) {
      int disk = random.nextInt(6);
      int seller = random.nextInt(15);

      sheets[s] = new Sheet(seller, disk, disks[disk]);
    }

    int[] saleDisk = new int[disks.length];
    double[][] saleSellers = new double[sellers.length][2];
    for (int i = 0; i < sheets.length; i++) {
      Sheet sheet = sheets[i];

      saleDisk[sheet.disk] += 1;
      saleSellers[sheet.seller][0] += 1;
      saleSellers[sheet.seller][1] += sheet.value;
    }

    System.out.println("\nQUANTIDADE VENDIDA");
    for (int i = 0; i < saleDisk.length; i++)
      System.out.println("Disco (" + i + "): " + saleDisk[i]);

    System.out.println("\nVENDA POR VENDEDOR");
    for (int i = 0; i < saleSellers.length; i++) 
      System.out.println("\n" + sellers[i] + ":\nVendas(" + String.format("%.0f", saleSellers[i][0]) + ")\nValor(R$" + String.format("%.2f", saleSellers[i][1]) + ")");

    input.close();
  }

  public static class Sheet{
    int seller;
    int disk;
    double value;

    public Sheet(int seller, int disk, double value){
      this.seller = seller;
      this.disk = disk;
      this.value = value;
    }
  }
}

// 90. Uma loja deseja controlar suas vendas de discos. Para isto, os discos foram divididos (0..4).
// Esta loja possui 15 vendedores que são conhecidos pelos nomes. Inicialmente, o programa
// deverá ler o preço unitário dos discos de cada um dos seis tipos e também o nome de cada
// um dos 15 vendedores. Quando uma venda é realizada, é preenchida uma ficha contendo o
// nome do vendedor e o tipo do disco que ele vendeu. Informe:
// A quantidade vendida de cada um dos seis tipos de disco.
// Total de discos vendidos por cada um dos vendedores.
// Valor total vendido por cada vendedor.