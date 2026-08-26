import java.util.Scanner;
public class EX5{
    /*5. Ler um ano e informar se ele é bissexto. Um ano é bissexto quando é divisível por 4 e não é divisível por 100, ou quando é
    divisível por 400. */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano para saber se é bissexto: ");
        int Ano = sc.nextInt();
        if((Ano % 4 == 0 && Ano % 100 != 0) || Ano % 400 == 0){
            System.out.println("Ano é bissexto!");
        }else{
            System.out.println("Ano é padrão");
        }

    }
}20