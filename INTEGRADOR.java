import java.util.Scanner;
/*Terminal de estacionamento. Ler o tipo de veículo, onde 1
é carro e 2 é moto, e definir a tarifa por hora com switch: carro
custa 8,00 e moto custa 5,00. Tipo diferente imprime opção
inválida e o programa não realiza as etapas seguintes. Ler a
quantidade de horas e calcular o valor. Ler se o cliente tem
cupom, respondendo sim ou nao: havendo cupom, verificar se
o valor é de 50,00 ou mais; nesse caso aplicar 20 por cento de
desconto, caso contrário informar que o cupom vale apenas
acima de 50,00. Em ifs independentes, imprimir aviso de
permanência longa quando passar de 12 horas e aviso de
cobrança de diária quando passar de 24 horas. Classificar a
permanência com else if: até 2 horas curta, até 6 horas média,
acima disso longa. Imprimir o valor final com duas casas*/
public class integrador{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Tipo de veiculo: 1 - carro ; 2 - moto ;");
	int tipoVei = sc.nextInt();
   System.out.println("Ficou quantas horas? ");
	int horasFicadas = sc.nextInt();
	double tarifa = 0;
	boolean continuar = true;
	switch(tipoVei){
	case 1:
	tarifa = 8.00 * horasFicadas;
	break;
	case 2:
	tarifa = 5.00 * horasFicadas;
	break;
	default:
	System.out.println("Valor de veiculo invalido, tente novamente.");
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