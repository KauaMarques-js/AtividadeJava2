import java.util.Scanner;
/*Ler dois números do tipo double e uma opção de 1 a 4,
onde 1 é soma, 2 é subtração, 3 é multiplicação e 4 é divisão.
Usar switch para executar a operação escolhida e imprimir o
resultado. Qualquer outra opção cai no default como opção
inválida. Na divisão, verificar antes se o divisor é zero.*/ 

public class ex13{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro número: ");
	double num1 = sc.nextDouble();
	System.out.println("Digite o segundo número: ");
	double num2 = sc.nextDouble();
	System.out.println("Digite a operação: 1 - Soma; 2 - Subtração; 3 - Multiplicação; 4 - Divisão");
	int op = sc.nextInt();
	switch(op) {
	case 1: 
	System.out.println("Sua soma fica: " + (num1 + num2));
	break;
	case 2:
	System.out.println("Sua subtração fica: " + (num1 - num2));
	break;
	case 3:
	System.out.println("Sua multiplicação fica: " + (num1 * num2));
  break;
	case 4:
	if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.println("Sua divisão fica: " + (num1 / num2));
                }
 	break;
	default:
	System.out.println("Começe novamente, digite uma operação valida");
	break;
	
		}
	}
}