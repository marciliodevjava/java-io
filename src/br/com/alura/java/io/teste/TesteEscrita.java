package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TesteEscrita {

	public static void main(String[] args) {
			
			//Fluxo de Entrada de Arquivo Para Escrita
			
	        String filePath = "arquivo.txt";
	
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	        	Scanner entrada = new Scanner(System.in);
	        	Boolean escreve = true;
	        	System.out.println("Escreva um Texto.");
	        	while(escreve) {
	        		String escrita = entrada.nextLine();
	        		if(escrita.equals("")|| escrita.equals(null)) {
	        			escreve = false;
	        		}
	        		writer.write(escrita);
	        		writer.newLine();
	        	}
	        	writer.close();
	            entrada.close();
	        } catch (IOException e) {
	            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
	        }
	    }
}
