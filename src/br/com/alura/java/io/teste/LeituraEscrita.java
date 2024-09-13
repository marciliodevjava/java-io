package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeituraEscrita {

	public static void main(String[] args) throws IOException {
		
		Boolean verifica = true;
		
		FileInputStream fis = new FileInputStream("leitura.txt");
		Reader rea = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(rea);
		
		String path = "escrita.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		
		String leitura = br.readLine();
		while(verifica) {
			System.out.println(leitura);
			bw.write(leitura);
    		bw.newLine();
			leitura = br.readLine();
			if(leitura == null || leitura == "") {
				verifica = false;
			}
		}
		bw.close();
		br.close();
		rea.close();
		fis.close();
	}
}
