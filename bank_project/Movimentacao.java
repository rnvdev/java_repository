package Gerenciamento;

public class Movimentacao {
	private int contaNumero;
	private String nome;
	private double saldo;

	public Movimentacao(int conta, String nome, double saldo) {
		this.contaNumero = conta;
		this.nome = nome;
		deposito(saldo);
	}

	public Movimentacao(int conta, String nome) {
		this.contaNumero = conta;
		this.nome = nome;
	}
	
	public int getAccount() {
		return this.contaNumero;
	}
	
	public void setAccount(int account) {
		this.contaNumero = account;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
		System.out.printf("(conta: %s) Deposito realizado! Saldo atual: %.4f %n", this.contaNumero, this.saldo);
	}

	public void saque(double valor) {
		this.saldo -= (valor + 5);
		System.out.printf("(conta: %s) Saque realizado! Saldo atual é de: %.4f %n", this.contaNumero, this.saldo);
	}
	
	public String toString() { 
		return "Account " + contaNumero + " Holder: " + nome + " Balance: $ " + String.format("%.2f", saldo);
		
	}
}
