package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	public static void main(String[] args) throws FileNotFoundException{
		 
		//Fluxo de Entrada de Arquivo Para Leitura
				
		FileInputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

			br.close();
			isr.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro.");
		}
	}

}
