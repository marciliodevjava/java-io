package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaTres {

	public static void main(String[] args) throws IOException {
		
		String os = System.getProperty("os.name").toLowerCase();
		String sistema = verificaOs(os);
		
		FileWriter fw = new FileWriter("lorem3.txt");
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		fw.write(sistema);
		fw.write("Sed do eiusmod tempor incididunt ut labore et dolore magna");
		fw.write(sistema);
		fw.write("aliqua. Ut enim ad minim veniam, quis nostrud exercitation");
		fw.write(sistema);
		fw.write("ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		fw.write(sistema);
		fw.write("Duis aute irure dolor in reprehenderit in voluptate velit");
		fw.write(sistema);
		fw.write("esse cillum dolore eu fugiat nulla pariatur. Excepteur sint");
		fw.close();
		
	}
	
	public static String verificaOs(String os) {
		
		if(os.contains("win")) {
			return os = "\r\n";
		} else {
			return os = "\n";
		}
		
	}
	
}
