import java.util.Scanner; 

/* Ler a frequência em porcentagem e a média final de um
aluno. Se a frequência for menor que 75 por cento, o aluno está
reprovado por falta e a média não deve ser avaliada. Se a
frequência for suficiente, avaliar a média: média >= 7 aprovado,
média >= 5 e média < 7 recuperação, média < 5 reprovado por
nota*/
public class EX11{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite sua nota: ");
	double nota = sc.nextDouble();
	System.out.println("Digite sua frequência: ");
	double frequencia = sc.nextDouble();
	if(frequencia < 75){
		System.out.println("reprovou");
		}else if(nota >= 7){
		System.out.println("Passou");
				
		}else{
		System.out.println("reprovou");
		}

	
	}

}