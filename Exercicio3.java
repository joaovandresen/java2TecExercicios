import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade: ");
        int velocidade = scanner.nextInt();

        if (velocidade > 80) {
            System.out.println("Você foi multado");
        } else {
            System.out.println("Boa viagem");
        }
    }
}