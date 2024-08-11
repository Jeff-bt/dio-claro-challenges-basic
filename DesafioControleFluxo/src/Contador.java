import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("\n===Controle de fluxo===\n");
        System.out.print("Digite o 1º paramêtro: ");
        int paramatro1 = sc.nextInt();
        System.out.print("Digite o 2º paramêtro: ");
        int parametro2 = sc.nextInt();
        System.out.println("\n====Resultado====\n");

        try {
            contar(paramatro1, parametro2);
        } catch (ParamentroInvalidosException e) {
            
            System.out.println(e.getMessage());
        }
    }

    static void contar(int paramatro1, int parametro2) throws ParamentroInvalidosException {
        if(paramatro1 > parametro2){
            throw new ParamentroInvalidosException("Erro: O segundo parâmetro deve ser maior que o primeiro\n");
        }

        int interacoes = parametro2 - paramatro1;
        for (int i = 0; i < interacoes; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
        System.out.println("");
    }
}
