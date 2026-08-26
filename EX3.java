import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        /*3. Ler a temperatura em graus Celsius e a umidade relativa do
    ar em porcentagem. Imprimir os alertas que se aplicam:
    temperatura de 38 graus ou mais gera alerta de calor extremo,
    umidade abaixo de 30 por cento gera alerta de umidade baixa,
    temperatura de 35 graus ou mais com umidade abaixo de 20
    por cento gera alerta de risco de queimada.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em C°: ");
        double temp = sc.nextDouble();
        System.out.println("Digite a umidade: ");
        double umidade = sc.nextDouble();
        if(temp >= 38){
            System.out.println("ALERTA: Temperatura está perigosa");
        }
        else if(temp >= 35 && umidade < 20){
            System.out.println("ALERTA: Risco de queimadura");
        }
        if(umidade < 30){
            System.out.println("ALERTA: Umidade Baixa!");
        }

    }
}
