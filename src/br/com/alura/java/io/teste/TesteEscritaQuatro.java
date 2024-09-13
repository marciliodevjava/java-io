package br.com.alura.java.io.teste;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaQuatro {
	
	private static PrintStream out = System.out.printf("");
	private static PrintWriter wri = new PrintWriter(out, true);
	
	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps = new PrintStream("entradadois.txt");		
		
		ps.println("aliqua. Ut enim ad minim veniam, quis nostrud exercitation");
		ps.println("ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		
		ps.close();
		
		out.println("Teste 1");
		wri.println("Teste 2");
	}

}
