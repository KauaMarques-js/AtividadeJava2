import java.util.Scanner;
public class integrador{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Tipo de veiculo: 1 - carro ; 2 - moto ;");
	int tipoVei = sc.nextInt();
  System.out.println("Ficou quantas horas? ");
	int horasFicadas = sc.nextInt();
   boolean continuar = true;
  if(horasFicadas >= 0 ){
    
  }else{
    System.out.println("Horas invalidas, tente novamente");
    continuar = false;
  }
	double tarifa = 0;
	
	switch(tipoVei){
	case 1:
	tarifa = 8.00 * horasFicadas;
	break;
	case 2:
	tarifa = 5.00 * horasFicadas;
	break;
	default:
	System.out.println("Veiculo invalido, tente novamente.");
	continuar = false;
	}
	
 
  sc.nextLine();
	while(continuar == true){
	System.out.println("Tem cupom? sim ou não");
	String verificarCupom = sc.nextLine();	
	if("sim".equalsIgnoreCase(verificarCupom)){
		System.out.println("valor do cupom? ");
		double valorCupom = sc.nextDouble();
		if(valorCupom >= 50.00){
		System.out.println("Sua tarifa ficará: " + (tarifa -(tarifa * 20/100)));
			}else{
			System.out.println("Cupom valido apenas acima de 50.00 R$");
      System.out.println("tarifa fica: " + tarifa);
				}

	}else{
		System.out.println("Sem cupom tarifa fica: " + tarifa);


	}
  if(horasFicadas >= 12 && horasFicadas <=24){
    System.out.println("Aviso! permanência longa");
  }else if(horasFicadas > 24 ){
     System.out.println("Aviso! permanência cobrança será diaria ");
  }else{
    System.out.println("Cuidado para não passar das 12! ");
  }
  if(horasFicadas <= 2){
    System.out.println("Curta");
  }else if(horasFicadas <= 6){
    System.out.println("Curta");  
  }else{
    System.out.println("longa");
  }
	continuar = false;
		}
	}
}