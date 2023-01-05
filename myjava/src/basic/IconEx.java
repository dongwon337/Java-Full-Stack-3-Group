package basic;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class IconEx extends JFrame{
	/*여기있는 이미지를 프레임에 그려줄거임.*/
	private Image background=new ImageIcon(IconEx.class.getResource("../src/basic/icon.png")).getImage();//배경이미지
	/*생성자*/
	public IconEx() {
		homeframe();
	}
	public void homeframe() {
		setTitle("1");//타이틀
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	public void paint(Graphics g) {//그리는 함수
		g.drawImage(background, 0, 0, null);//background를 그려줌
	}
	public static void main(String[] args){
		new IconEx();
	}
}