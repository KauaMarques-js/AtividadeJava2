import java.util.Scanner;

/*8. Ler a velocidade máxima da via e a velocidade do veículo.
Classificar a infração conforme o Código de Trânsito Brasileiro:
dentro do limite não há multa, até 20 por cento acima do limite
a infração é média, acima de 20 e até 50 por cento é grave,
acima de 50 por cento é gravíssima.*/

  public class EX8{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite a velocidade da via: ");
     int velocidadeVia = sc.nextInt();
     System.out.println("Digite a velocidade da veiculo: ");
     int velocidadeVei = sc.nextInt();
    int porcentagemUltra = velocidadeVei - velocidadeVia;
    if( porcentagemUltra >= 1 && porcentagemUltra <= 20 ){
      System.out.println("Multa média por ultrapassar : " + porcentagemUltra + "%");
    }else if(porcentagemUltra > 20 && porcentagemUltra <= 50){
      System.out.println("Multa Grave por ultrapassar : " + porcentagemUltra + "%");
    }else if(porcentagemUltra > 50 ){
      System.out.println("Multa Gravíssima por ultrapassar : " + porcentagemUltra + "%");
    }else{

      System.out.println("SEm multa lil bro");
    }



   }

  }