import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cor do semáforo: ");
        String cor = scanner.nextLine();

        if (cor.equalsIgnoreCase("Verde")) {
            System.out.println("Siga");
        } else if (cor.equalsIgnoreCase("Amarelo")) {
            System.out.println("Atenção");
        } else if (cor.equalsIgnoreCase("Vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida");
        }

        scanner.close();
    }
}