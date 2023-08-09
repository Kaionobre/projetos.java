import java.util.Scanner;

class Main {
  public static void main (String[] args) {

    Pessoa objeto1 = new Pessoa();
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    objeto1.nome = sc.nextLine();
    System.out.println("Digite a sua idade: ");
    int idade = sc.nextInt();

    if (idade <=16){
      System.out.println("Você não precisa votar.");
    } else if (idade >16 && idade <= 60){
      System.out.println("Você precisa votar");
    } else{
      System.out.println("Você está vellho de mais pra votar");
    }
  }
}