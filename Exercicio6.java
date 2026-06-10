import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor > 200) {
            valor = valor - (valor * 0.20);
        } else if (valor > 100) {
            valor = valor - (valor * 0.10);
        }

        System.out.println("Valor final: R$ " + valor);
    }
}