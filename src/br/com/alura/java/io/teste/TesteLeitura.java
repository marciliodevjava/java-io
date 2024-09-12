package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TesteLeitura {
	
	public static void main(String[] args) throws FileNotFoundException{
		 
		//Fluxo de Entrada de Arquivo Para Leitura
				
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro.");
		}
		
		escreve(args);
	}
	
	public static void escreve(String[] args) {
		
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
            
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}
