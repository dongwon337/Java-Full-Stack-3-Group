package ioex;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutEx1 {
	
	public static void main(String[] args) {
		
		int a = 1;
		byte b = 100;
		int han = '김';
		System.out.println(Integer.toBinaryString(han));
		//44608,1010111001000000
		System.out.println(Integer.toBinaryString('x'));
		
		/*
		 * 파일에 데이터를 쓰는 순서는
		 * OutputStream 연다.
		 * 쓴다(write())
		 * 닫는다(flush(), close());
		 * 참고로 close() 는 내부적으로 flush() 를 호출한다)
		 */
		
		String fileName	="myFirst.dat";
		File file = null;
		FileOutputStream fos = null;
		
		try {
			file = new File(fileName);
			fos = new FileOutputStream(file);
			//여기까지가 파일에 스트림을 연결하는 작업..
			
			//여기서 부턴 파일에 쓰는 작업..
			fos.write(han);
			fos.write(a);
			fos.write(b);
			//다 썼으면 닫는다.. 내부적으로 flush() 호출되고 close() 
			fos.close();
			
			System.out.println("파일에 다 썼습니다.");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
	}

}
