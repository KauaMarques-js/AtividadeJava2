import java.util.Scanner;

public class main{

  public static void main(String[] args){
    System.out.println("Informe usa idade: ");
    Scanner sc = new Scanner(System.in);
    int idade = sc.nextInt();
    if(idade >= 16){
      System.out.println("Você pode votar");
    }
    if(idade >= 18){
      System.out.println("Você pode dirigir");
    }
    if(idade >= 60 ){
      System.out.println("Você é idoso");
    }
    
  }
}