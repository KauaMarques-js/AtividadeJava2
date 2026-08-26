import java.util.Scanner;
import java.lang.Math;
public class main{
    public static void main(String[] args){
        System.out.println("Digite seu número inteiro: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        

        if(num1 >= 0){
            System.out.println("número é positivo");
        }else{
            System.out.println("número é negativo");
        }
        if(num1 % 2 == 0){
            System.out.println("número é Par");
        }else{
            System.out.println("número é impar");
        }
        if(num1 % 5 == 0){
            System.out.println("número é Multiplo de 5");
        }else{
            System.out.println("número Não é multiplo de 5");
        }
        if(Math.abs(num1) >= 10 && Math.abs(num1) <= 99){
         System.out.println("número tem dois digitos");
        }else{
        System.out.println("número não tem dois digitos");
        }
    }
}