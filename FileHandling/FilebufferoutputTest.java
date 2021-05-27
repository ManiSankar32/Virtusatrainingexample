package Files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FilebufferoutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 try {
		 File f = new File("output.txt");
		 FileOutputStream fout = new FileOutputStream(f);
		 BufferedOutputStream bout = new BufferedOutputStream(fout);
		 Scanner sc = new Scanner(System.in);
		 String s= sc.nextLine();
		 int roll =sc.nextInt();
		 byte[] arr=("Welcome "+s+"Your emp id is "+roll).getBytes();
		 bout.write(arr);
		 bout.close();
		 
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}

}
