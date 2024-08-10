import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("\n===CRIANDO CONTA BANCÁRIA===");
        System.out.println();
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Agencia: ");
        String agencia = sc.next();
        System.out.print("Nome: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("\n==================");

        ContaTerminal cliente1 = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(cliente1.toString());
        System.out.println("==================");
        
        sc.close();
    }
}
