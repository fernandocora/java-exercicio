import java.util.Scanner;

public class ContaTerminal {

	int numero;
	String agencia;
	String nomeCliente;
	double saldo;

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ContaTerminal conta = new ContaTerminal();

		conta.pegarDadosUsuario();
		conta.mostrarDadosUsuario();
	}

	public void pegarDadosUsuario() {
		System.out.println("Digite o número da conta:");
		numero = scanner.nextInt();

		System.out.println("Digite sua agência:");
		agencia = scanner.next();

		scanner.nextLine(); 

		System.out.println("Digite seu nome:");
		nomeCliente = scanner.nextLine();

		System.out.println("Digite seu saldo:");
		saldo = scanner.nextDouble();
	}

	public void mostrarDadosUsuario() {
		System.out.println("Olá " + nomeCliente +
				", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero +
				" e seu saldo " + saldo + " já está disponível para saque.");
	}
}