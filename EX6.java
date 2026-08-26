import java.util.Scanner;
/*6. Ler o valor de uma compra. Compras de 199,00 ou mais têm
frete grátis; abaixo disso o frete é 24,90. Imprimir o valor do
frete e o total a pagar nos dois casos*/
public class EX6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o valor da compra: ");
      int valorCompra = sc.nextInt();

      if(valorCompra >= 199.00){
        System.out.println("Frete grátis! ");

      }else{
        System.out.println("Valor do frete: 24,90 R$ ");
      }
    }
}