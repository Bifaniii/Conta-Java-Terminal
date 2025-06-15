import java.util.Locale;
import java.util.Scanner;

/* Conhecer e importar a classe Scanner
Exibir as mensagens para o nosso usuário
Obter pela scanner os valores digitados no terminal
Exibir a mensagem da conta criada
 */

public class ContaTerminal {
    static String name;
    static int number;
    static String agency;
    static double balance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Nome(scanner);
        Numero(scanner);
        Agencia(scanner);
        Saldo(scanner);
        Frase();

        scanner.close();
    }

    public static void Nome(Scanner scanner) {
        System.out.print("Digite seu nome: ");
        name = scanner.nextLine();
    }

    public static void Numero (Scanner scanner){
        System.out.print("Digite o número da conta: ");
        number = scanner.nextInt();
        scanner.nextLine();

    }
    public static void Agencia(Scanner scanner){
        System.out.print("Digite a agência: ");
        agency = scanner.nextLine();
    }
    public static void Saldo(Scanner scanner) {
        System.out.print("Digite o valor em conta atual: ");
        balance = scanner.nextDouble();
        scanner.nextLine();
    }

    public static void Frase(){
        System.out.println("\nConta criada com sucesso!\n");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n", name);
        System.out.printf("Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n", agency, number, balance);

    }
}
