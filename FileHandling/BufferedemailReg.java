package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedemailReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		FileWriter fw = new FileWriter("newFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String email = sc.nextLine();
		bw.write("Welcome"+name+"You are registerd"+email);
		bw.flush();
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
