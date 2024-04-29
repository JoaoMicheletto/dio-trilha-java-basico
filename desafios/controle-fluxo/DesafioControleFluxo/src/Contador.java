import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		}
		catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroDois, int parametroUm ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;

		if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
		}

		for(int x = 1; x <= contagem; x++){
			System.out.println("Imprimindo o número: " + x);
		}
	}
}