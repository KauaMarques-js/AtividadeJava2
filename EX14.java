import java.util.Scanner;

/*
Ler o número de um mês de 1 a 12 e imprimir a quantidade
de dias desse mês. Agrupar os meses de mesma duração em
um único case, separando os valores por vírgula. Considerar
fevereiro com 28 dias. Valores fora da faixa de 1 a 12 devem
ser tratados no default.
*/

public class EX14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o mês que queira saber os dias: de 1 a 12:");
        int mes = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 dias");
                break;

            case 4, 6, 9, 11:
                System.out.println("30 dias");
                break;

            case 2:
                System.out.println("28 dias");
                break;

            default:
                System.out.println("Digite um mês válido");
                break;
        }

        sc.close();
    }
}
