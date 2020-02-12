package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextOverwriteTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(BufferedReader f1 = new BufferedReader(new FileReader(sc.next()));
			BufferedReader f2 = new BufferedReader(new FileReader(sc.next()));
			BufferedWriter f3 = new BufferedWriter(new FileWriter(sc.next()))) {
			
			int data;
			
			while((data = f1.read()) != -1) {
				f3.write(data);
			}
			
			f3.newLine();
			
			while((data = f2.read()) != -1) {
				f3.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
	
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("1번 파일: ");
		String src1 = sc.nextLine();

		System.out.print("2번 파일: ");
		String src2 = sc.nextLine();

		System.out.print("새로운 파일: ");
		String dst = sc.nextLine();

		try (BufferedReader in1 = new BufferedReader(new FileReader(src1));
			 BufferedReader in2 = new BufferedReader(new FileReader(src2));
			 BufferedWriter out = new BufferedWriter(new FileWriter(dst))) {
		
			String str;
			
			while(true) {
				str = in1.readLine();
				if(str == null)
					break;
				 out.write(str);
			}
			out.newLine();
			
			while(true) {
				str = in2.readLine();
				if(str == null)
					break;
				out.write(str);
			}	

		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
}*/