package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaDois {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		
		OutputStream os = new FileOutputStream("lorem2.txt");
		Writer wt = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wt);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna");
		bw.newLine();
		bw.write("aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		
		bw.close();
		wt.close();
		os.close();
	}
}
