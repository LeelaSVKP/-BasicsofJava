package org.tnsif.capgemini.c2tc.ScannerClass_BufferReader;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReader1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader(""));
		String data="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
	}

}
 