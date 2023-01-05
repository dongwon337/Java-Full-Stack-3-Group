package ioex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {

		// PrintWirter 이용해서 파일을 복사해서 ArrayExam.java.back 이라는 파일 생성
		// 하세요.
		
//		PrintWriter writer = 
//		new PrintWriter(new FileWriter(
//		"/Users/gimdonghwan/eclipse-workspace/myjava/src/basic/ArrayExam.java.back"));
		
		File file = 
		new File("/Users/gimdonghwan/eclipse-workspace/myjava/src/basic/ArrayExam.java");

		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		String msg = null;
		int readData;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			lr = new LineNumberReader(br);

			String msg2;

			int i = 1;
			while ((msg2 = lr.readLine()) != null) {
				System.out.println(lr.getLineNumber() + " ");
				System.out.println(msg2);
			}
		} catch (Exception e) {

		}

//		try {
//			fr = new FileReader(file);
//
//			// 순수하게 read() 만 이용해서 읽기
//			while ((readData = fr.read()) != -1) {
//				System.out.print((char)readData);
//			}
//
//			fr.close();
//		} catch (Exception e) {
//
//		}
	}
}
