package com.mnknowledge.dp.structural.decorator.input;

import java.io.*;

public class InputTest {
	
	public static void read(InputStream in) {
		int c;
		try {
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		//int c;

		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream("C:/Users/Owner/workspace/JavaDesingPatterns-L4/src/com/mnknowledge/patterns/structural/decorator/input/test.txt")));
			
			read(in);
			
//			while ((c = in.read()) >= 0) {
//				System.out.print((char) c);
//			}
//
//			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
