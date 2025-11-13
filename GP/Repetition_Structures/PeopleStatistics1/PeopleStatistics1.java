package Java.GP.Repetition_Structures.PeopleStatistics1;

import java.io.PrintStream;
import java.util.Scanner;

public class PeopleStatistics1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    People[] sample;
    int sampleValue;
    int averAge, averAgeM, totalF, sampleValueM;
    averAge = averAgeM = totalF = sampleValueM = 0;

    print.print("Quantas pessoas participarão do Experimento? ");
    sampleValue = input.nextInt();
    sample = new People[sampleValue];
    
    for(int i = 0; i < sampleValue; i += 1){
      People peopleLoop = new People("", 0, "o");
      
      input.nextLine();

      print.println("\n" + (i + 1) + "ª pessoa");
      
      print.print("Nome: ");
      peopleLoop.name = input.nextLine();
      
      while (!(peopleLoop.sex.equalsIgnoreCase("m") || peopleLoop.sex.equalsIgnoreCase("f"))) {
        print.print("Sexo (m/f): ");
        peopleLoop.sex = input.next();
      }
      
      print.print("Idade: ");
      peopleLoop.age = input.nextInt();
      
      
      sample[i] = peopleLoop;
    }
    
    for(int i = 0; i < sampleValue; i += 1){
      People people = sample[i];

      averAge += people.age;

      if(people.sex.equalsIgnoreCase("f")) totalF += 1; 
      else {
        averAgeM += people.age;
        sampleValueM += 1;
      };
    }

    averAge = averAge / sampleValue;
    if(sampleValueM > 0 ) averAgeM = averAgeM / sampleValueM;

    print.println(
    "\nA média de idades " + averAge + " anos.\n" + //
    "A média de idades dos homens " + averAgeM + " anos.\n" + //
    "O total de mulheres " + totalF + "."
    );

    input.close();
  }

  public static class People{
    String name;
    int age;
    String sex;

    public People(String name, int age, String sex){
      this.name = name;
      this.age = age;
      this.sex = sex;
    }
  }
}