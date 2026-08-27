import java.util.Scanner; 

public class EX10{
	public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
	System.out.println("Digite seu User: ");
	String user = sc.nextLine();
	if("admin".equals(user)){
		System.out.println("Digite sua senha: ");
		String Senha = sc.nextLine();
			if("java123".equals(Senha)){
				System.out.println("Verificando senha");
       			System.out.println("Tudo certo! ta dento");
			}else{
			System.out.println("Senha errada fi");

			}


	}else{
		System.out.println("User Não encontrado! ");
		}


	}



}