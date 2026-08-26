import java.util.Scanner;
/*9. Ler o salário de um funcionário e o tempo de casa em anos.
Definir o bônus: menos de 1 ano não recebe, de 1 a 3 anos
recebe 5 por cento, acima de 3 e até 10 anos recebe 10 por
cento, acima de 10 anos recebe 15 por cento. Imprimir o
percentual e o valor do bônus.*/
	public class EX9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Digite seu Salário: ");
		double salario = sc.nextDouble();
		System.out.println("Qual seu tempo de casa em ANO(S): ");
		int anoDeCasa = sc.nextInt();
		
		if(anoDeCasa >= 1 && anoDeCasa <= 3){
			System.out.println("Você receberá 5% do salario, valor do bônus: " + salario * 0.05);
		}else if(anoDeCasa >3 && anoDeCasa <= 10){
			System.out.println("Você receberá 10% do salario, valor do bônus: " + salario * 0.10);
			
		}else if(anoDeCasa >10){
			System.out.println("Você receberá 15% do salario, valor do bônus: " + salario * 0.15);

		}else {
			System.out.println("Você não receberá");
	
		}
		sc.close();

	}
}