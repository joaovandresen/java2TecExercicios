import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (senha.equals("1234")) {
            System.out.println("Acesso Autorizado");
        } else {
            System.out.println("Acesso Negado");
        }

        scanner.close();
    }
}