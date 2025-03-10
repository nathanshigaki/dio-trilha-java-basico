
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        /*
           Atributo	       Tipo	       Exemplo
            Numero	     Inteiro	    1021
           Agencia	      Texto	       067-8
         Nome Cliente	  Texto     MARIO ANDRADE
            Saldo	     Decimal	   237.48

        Revise sobre terminal, main args e a classe Scanner

        Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
            Programa: "Por favor, digite o número da Agência !"
            Usuário: 1021 (depois ENTER para o próximo campo)

        Revise sobre concatenação e classe String com método concat

        Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
        "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

        Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o nome da sua agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o número da agência: ");
        int numero = scanner.nextInt();
        System.out.print("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
