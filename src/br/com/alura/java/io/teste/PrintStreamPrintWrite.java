package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PrintStreamPrintWrite {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner entrada = new Scanner(new File("contas.csv"));
		
		List<Conta> listContas = new ArrayList<Conta>();
		
		while(entrada.hasNextLine()) {
			Conta conta = new Conta();
			String linha = entrada.nextLine();
			String[] corte = linha.split(",");
			conta = montar(corte);
			listContas.add(conta);
			System.out.println(linha);
		}
		System.out.println(listContas);
		entrada.close();
	}

	private static Conta montar(String[] corte) {
		Conta conta = new Conta();
		conta.setTipo(verificaString(corte[0]));
		conta.setAgencia(verificaInteger(Integer.valueOf(corte[1])));
		conta.setConta(verificaInteger(Integer.valueOf(corte[2])));
		conta.setNome(verificaString(corte[3]));
		conta.setSaldo(verificaDouble(Double.valueOf(corte[4])));
		return conta;
	}

	private static Double verificaDouble(Double valueOf) {
		return (valueOf != null && !valueOf.isNaN()) ? valueOf : 0.0;
	}
	private static Integer verificaInteger(Integer valueOf) {
		if(valueOf == null || valueOf.equals(valueOf)) return 0;
		return valueOf;
	}

	private static String verificaString(String valueOf) {
		if(valueOf.equals(null) || valueOf.equals("")) return "";
		return valueOf;
	}
}
