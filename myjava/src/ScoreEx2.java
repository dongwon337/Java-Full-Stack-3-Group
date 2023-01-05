import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScoreEx2 {

	public static void main(String[] args) {
		//do~while 을 이용해서 아래의조건처럼 구현되도록 하세요.
		/*
		 * 클래스명은 ScoreEx1 으로 하시고
		 * 
		 * 학생의 성적을 입력 받아 출력하는 프로그램입니다.
		 * 1. 과목은 국,영,수 이고
		 * 2. 각 과목의 점수는 0 ~ 100 사이여야 합니다.
		 * 3. 만약 올바르지 않은 점수가 들어오면, 재입력 받도록 하세요. 즉
		 * 다음 과목의 점수를 입력받는 로직으로 넘어가면 안됩니다.
		 * 4. 모든 과목이 올바르게 입력되면 아래처럼 출력합니다.
		 * 5. 총점 : 몇점, 평균 : ?.? 학점 A,B,C or F
		 * 6. 학점의 기준은 90 이상은 A, 80~89 까지 B, 70 ~ 79까지 C, 나머진 F
		 * 7. 참고로 위의 학점을 계산하려면 평점을 구해서 하는게 편할겁니다.
		 * 8. 평점은 평균을 10으로 나눠서 계산하시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int kor;
		do {
			kor = sc.nextInt();
		}while(kor < 0 || kor > 100);

		System.out.println("영어 점수 입력");
		int eng;
		do {
			eng = sc.nextInt();
		}while(eng < 0 || eng > 100);
		
		System.out.println("수학 점수 입력");
		int math;
		do {
			math = sc.nextInt();
		}while(math < 0 || math > 100);
		
		int sum = kor + eng + math;
		double ave = sum / 3;
		double avepoint = ave / 10;
		String score = null;
		
		if(avepoint >= 9.0) {
			score = "A";
		}else if(avepoint >= 8.0 && avepoint < 9.0) {
			score = "B";
		}else if(avepoint >= 7.0 && avepoint < 8.0) {
			score = "C";
		}else {
			score = "F";
		}
		
		System.out.println("총점 : " + sum + ", 평균 : " + ave + ", 학점 : " + score);
		
	}
}
