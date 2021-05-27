package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReverseReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("Reverse.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Hi everyone this is completed");
		bw.close();
		FileReader fr = new FileReader("Reverse.txt");
		BufferedReader br = new BufferedReader(fr);
		
		StringBuffer sb = new StringBuffer(br.readLine());
		sb.reverse();
		System.out.println("reversed Content : "+sb);
		
		
		
	

	}

}
