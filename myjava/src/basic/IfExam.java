package basic;
import javax.swing.JOptionPane;


public class IfExam {

	public static void main(String[] args) {

		//		int a = 1;
		//		if (a > 0)
		//	
		//			System.out.println("a는 0 보다 큽니다.");
		//		System.out.println("여긴 if 실행문이 아닌 main() 실행문 입니다.");

		//조건식을 이용해서 아래와 같은 로직을 완성 하세요.
		/*
		 * 수 3개를 입력받습니다.
		 * 출력 결과는 가장 큰 수 부터 출력 시키세요..
		 * ex>4,1001,985 --> 결과 : 1001 >= 985 >= 4
		 */

		int a,b,c,temp;
		a = Integer.parseInt(JOptionPane.showInputDialog("1번째 입력 : "));
		b = Integer.parseInt(JOptionPane.showInputDialog("2번째 입력 : "));
		c = Integer.parseInt(JOptionPane.showInputDialog("3번째 입력 : "));
		
		if(b >= a && b >= c) {
			temp = a;
			a = b;
			b = temp;
		}else if(c >= a && c >= b) {
			temp = a;
			a = c;
			c = temp;
		}
		if(c >= b) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + ">=" + b + ">=" + c);
		
		
		
//		int a,b,c,temp;
//		a = Integer.parseInt(JOptionPane.showInputDialog("1번째 입력 : "));
//		b = Integer.parseInt(JOptionPane.showInputDialog("2번째 입력 : "));
//		c = Integer.parseInt(JOptionPane.showInputDialog("3번째 입력 : "));
//		if(a > b && b > c) {
//			JOptionPane.showMessageDialog(null, "1번째 값" + a + "," + "2번째 값"+ b + ","+"3번째 값" + c);
//		}else if(a > c && c > b){
//			JOptionPane.showMessageDialog(null, "1번째 값" + a + "," + "3번째 값"+ c+ "," +"2번째 값" + b);
//		}else if(b > a && a > c){
//			JOptionPane.showMessageDialog(null, "2번째 값" + b + "," + "1번째 값"+ a+ "," +"3번째 값" + c);
//		}else if(b > c && c > a){
//			JOptionPane.showMessageDialog(null, "2번째 값" + b + "," + "3번째 값"+ c+ "," +"1번째 값" + a);
//		}else if(c > a && a > b){
//			JOptionPane.showMessageDialog(null, "3번째 값" + c + "," + "1번째 값"+ a+ "," +"2번째 값" + b);
//		}else if(c > b && b > a){
//			JOptionPane.showMessageDialog(null, "3번째 값" + c + "," + "2번째 값"+ b+ "," +"1번째 값" + a);
//		}
//		
		
	}

}
