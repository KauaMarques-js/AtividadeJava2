import java.util.Scanner;

/*7. Ler a hora do dia como um inteiro de 0 a 23 e imprimir a
saudação correspondente: de 0 a 11 bom dia, de 12 a 17 boa
tarde, de 18 a 23 boa noite. Horas fora dessa faixa são
inválidas.*/

public class EX7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a hora do dia, inteiro de 0 a 23: ");
    int horaDoDia = sc.nextInt();
    if(horaDoDia <= 11 && horaDoDia >= 5 ){
      System.out.println("Bom dia! ");
    }else if(horaDoDia >= 12 && horaDoDia <= 17 ){
      System.out.println("Boa tarde! ");
    }else if(horaDoDia >= 18){
      System.out.println("Boa noite! ");
    }else{
      System.out.println("Boa madrugada! ");
    }
  }
}