package basic;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FineSum {

	public static void main(String[] args) {
		//FineSum.java
			/*
			 * 두수를 입력을 받으세요(값의 크기는 상관없음.. 100, 4, 4, 100)
			 * 두수의 차이(100, 4 를 받았을 경우, 차이는 96 입니다.)
			 * 이 차이의 누적합을 구해서 출력.
			 */
		
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째수 입력"));
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));
		
		int temp;
		if(fir >= sec) {
			temp = fir;
			fir = sec;
			sec = temp;
		}
		int sum = 0;
		for(int i = fir; i<=sec; i++) {
			sum += i;
		}
		System.out.println(fir + " ~ " + sec + " 누적합 : " + sum);
		
	}
}
