
import java.util.Scanner;
public class EX4{

    /*4. Ler dois números inteiros e informar se o primeiro é múltiplo
    do segundo. Antes de calcular, verificar se o segundo número é
    zero e, nesse caso, informar que a verificação não pode ser
    feita. */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        if(num1 % num2 == 0){
            System.out.println("Número 1 é múltiplo do Número 2");
        }else{
            System.out.println("Número 1 não é múltiplo do Número 2");
        }
    }
}