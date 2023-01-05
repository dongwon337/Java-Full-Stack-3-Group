package ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceExam {

	public static void main(String[] args) {

		// FileInputStream 을 요소로 갖는 Vector
		Vector<InputStream> streams = new Vector<InputStream>();

		// 하나이상의 입력 스트림을 하나로 처리하는 Seq... 스트림 선언
		SequenceInputStream sis = null;

		// 읽어들일 파일 객체 생성
		File f1 = new File("myfirst.dat");
		File f2 = new File("123.txt");

		// f1, f2 를 읽는 스트림 선언
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;

		try {
			fis1 = new FileInputStream(f1);
			fis2 = new FileInputStream(f2);
			//위 두개의 입력 스트림 객체를 vector 에 add 시킨다.
			streams.add(fis1);
			streams.add(fis2);
			
			//SequenceInputStream 의 생성자에 Enumeration 객체로
			//스트림을 넘겨주기 위해 vector 의 Enumeration 을 리턴하는 메서드를 호출한다.
			Enumeration<InputStream> er = streams.elements();
			
			//SequenceInputStream 객체를 생성하면서, 입력 대상인 er 객체를 파람으로 준다.
			sis = new SequenceInputStream(er);
			
			//SequenceInputStream 의 오버로드된 read() 중 맘에 드는걸 호출하여
			//하나로 연결된 파일 스트림의 내용을 읽어들인다.
			int data = 0;
			while((data = sis.read())!= -1) {
				System.out.print((char)data);
			}
			
			sis.close();
		
		} catch (Exception e) {

		}
	}
}
