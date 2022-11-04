package fintech;

public abstract class Cliente {
	
	private String nome;
	Conta conta;
	
	public Cliente(String nome) {
		this.nome = nome;
		
	}

	public void Saque(double saque) {
		 conta.setSaldo(conta.getSaldo() - saque);
	}
	 
	public void Deposito(double deposito) {
		conta.setSaldo(conta.getSaldo() + deposito);
	}
	
	public String Extrato() {
		return "O saldo da sua conta é de: R$" + conta.getSaldo();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
