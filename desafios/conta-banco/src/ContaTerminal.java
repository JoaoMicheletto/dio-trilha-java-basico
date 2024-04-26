import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        Integer numeroAgencia = dados.nextInt();
        
        System.out.println("Digite seu nome completo:");
        String nomeCliente = dados.next();

        System.out.println("Digite o saldo inicial de sua conta:");
        Integer saldoCliente = dados.nextInt();

        dados.close();

        Random gerador = new Random();
        Integer numeroCliente = gerador.nextInt(2000);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + numeroAgencia + ", conta número " + numeroCliente + " e seu saldo " + saldoCliente + " já está disponível para saque.");
    }
}
