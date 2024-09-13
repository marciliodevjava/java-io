package br.com.alura.java.io.teste;

public class Conta {

	private String tipo;
	private Integer agencia;
	private Integer conta;
	private String nome;
	private Double saldo;
	
	public Conta() {
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
	    return String.format("\nTipo: %s\nAgência: %s\nNúmero: %s\nNome: %s\nSaldo: %.2f\n", 
	        this.tipo, this.agencia, this.conta, this.nome, this.saldo);
	}
}
