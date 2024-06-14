
public class Main {

	public static void main(String[] args) {
		Cliente alisson = new Cliente();
		alisson.setNome("Alisson");
		
		Conta cc = new ContaCorrente(alisson);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(alisson);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
