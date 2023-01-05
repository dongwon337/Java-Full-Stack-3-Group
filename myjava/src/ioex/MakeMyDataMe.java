package ioex;

import java.io.File;
import java.io.FileWriter;

public class MakeMyDataMe {

	public static void main(String[] args) {

		String fileName = "designkimdh.text";
		File file = null;
		
		String id = "아이디 입력\n";
		String ps = "패스워드 입력\n";

		try {
			file = new File(fileName);
			FileWriter fos1 = new FileWriter(file,true);

			fos1.write(id);
			fos1.write(ps);
			fos1.write(3);
			fos1.close();

			System.out.println("파일에 다 썼습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
