public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Olá, mundo!");
  }
}

class Usuario{
  private String name;
  private static int id;

  Usuario(String name){
    this.name = name;
    this.id++;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }
}