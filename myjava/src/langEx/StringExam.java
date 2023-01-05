package langEx;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.SortedMap;

import javax.swing.JOptionPane;







public class StringExam {


	public static void main(String[] args) throws UnsupportedEncodingException {

		//""을 이용해서 생성된 문자열은 모두 String pool 에 저장되고
		//새로운 리터럴을 생성할시엔, 먼저 pool 내에 같은 값이 있는 객체가 존재하는지
		//만약 있다면 해당 Ref 를 리턴합니다. 이 조건은 오직 ""(리터럴) String 객체에만
		//적용됩니다.
		
		String a = "abc";
		String b = "abC";
		
		String c = new String();
		String d = new String(b); // 생성자를 새로 만들었기때문에 다른객체
		
		if(d==b) {
			System.out.println("같은 객체니 값도 당연히 같음");
		}else {
			System.out.println("틀린 객체이고, 값이 같은지는 모르겠음.");
		}
		//String 의 override 된 equals 사용 . 두 문자열 객체가 같은 값이면
		//true 아님 false 리턴.
		if(d.equalsIgnoreCase(b)) {
			System.out.println("다른 문자열 객체지만 대소문자 구분없이 값은 같음");
		}else {
			System.out.println("다른 문자열 객체이며 값도 틀림");
		}
		
		byte[] bArr = {65,66,67,68,69};
		bArr = "안녕하세요.".getBytes();
		//앞으로 배열내부의 값을 문자열로 확인 하고 싶으면 아래 API 를 이용하세요
		System.out.println(Arrays.toString(bArr));
		String bStr = new String(bArr,2,6);
		System.out.println(bStr);
		
		SortedMap<String, Charset> charset = Charset.availableCharsets();
		System.out.println(charset);
		
		
		char[] chArr = {'오','늘','하','루','고','생','함'};
		String chStr = new String(chArr);
		System.out.println(chStr);
		

		char[] uniCodes = chStr.toCharArray();
		int[] converUni = new int[uniCodes.length];
		for(int i = 0; i<uniCodes.length; i ++) {
			converUni[i] = uniCodes[i];
		}
		System.out.println(Arrays.toString(converUni));
		
		String uniStr = new String(converUni,0,converUni.length);
		System.out.println(uniStr);
		
		
		
		
		/*
		 * String myMsg = "오늘의 자바는 문자열 객체 까지 했습니다"
		 * 
		 * 위 myMsg 를 byte[] 배열로 리턴하는 메서드가 있습니다. 리턴 타입이 byte[]임
		 * 
		 * 얘를 호출해서 바이트 배열로 변환후, 배열의 모든 값을 다시 새로운
		 * 문자열로 생성하는데, 단, 문자열의 캐릭터셋을 ISO-8859-1 로 되어진 애로 변환해서
		 * 출력해보세요.
		 */
		System.out.println("");
		String myMsg = "오늘의 자바는 문자열 객체 까지 했습니다.";
		
		byte[] arr = myMsg.getBytes();
//		String bst = new String(arr,0,arr.length,"ISO-8859-1");
		String bst = new String(arr,0,arr.length);
		System.out.println(bst);
		
		System.out.println(bst.length());
		//bst 의 전체를 돌면서 문자(char) 를 리턴 받는다.
		
		for(int i = 0; i <bst.length(); i++) {
			char ch = bst.charAt(i);
			System.out.println(ch);
		}
		
//		System.out.println(bst.charAt(bst.length()));
		System.out.println(Integer.toHexString(bst.codePointAt(0)));
		
		char uniCar = '\uc624';
		System.out.println(uniCar);

		
		
		String msg = "오늘";
		String msg2= msg.concat("하루도 즐겁게");
		System.out.println(msg2);
		
		
		System.out.println(msg2.contains("즐겁게")); //msg2 안에 이 문자열이 포함되어 있나?
		
		String hi = String.copyValueOf(new char[] {'h','e','l','l','o'});
		
		//문자열의 끝과 처음 판별하기
		String email = "design@gmail.com";
		if(email.endsWith(".com") || email.endsWith("co.kr")){
			System.out.println("올바른 서버명입니다.");
		}
		
//		//format() : static 이면서 , 문자열 , 수치형등을 모두 특정 형식대로
//		//포맷하여 설정 할 수 있습니다.
//		/*
//		 * 아래는 간단한 문법입니다.
//		 * 
//		 * %d(10진수 형식),%s(문자열 형식), %f(실수형), Locale(날짜등의 형식)
//		 * 기본적으로 포맷을 적용하면 우측 정렬이 적용됩니다. 만약 -표시를 하게되면
//		 * 왼쪽 정렬을 하게 됩니다.
//		 */
//		
//		int i = 23;
//		
//		System.out.println(String.format("%d", i));
//		System.out.println(String.format("%d_", i));
//		System.out.println(String.format("%5d_", i));
//		System.out.println(String.format("%-5d_", i));
//		System.out.println(String.format("%05d_", i));
//		
//		
//		//십진수 정수의 큰 값을 특정 포맷대로 출력시켜보기
//		int i2 = 123456789;
//		//%뒤에 콤마를 주면 자동으로 3자리수 마다 콤마를 넣어줍니다.
//		System.out.println(String.format("%,d", i2));
//		System.out.println(String.format("%,015d", i2));
//		
//		//문자열 표시하기..
//		String str = "hello";
//		System.out.println(String.format("%-12.2s_", str));
//		
//		
//		//실수형 표기 하기.. 키워드 f
//		double n = 123.45678;
//		System.out.println(String.format("%f", 3.4));
//		System.out.println(String.format("%f", n));
//		System.out.println(String.format("%.2f", n)); //반올림 시켜줌	
//		
//		
//		System.out.println(email);
//		
//		//이메일에 @ 여부 판단하기.. indexOf(char ch)
//		int idx = email.indexOf('n',email.indexOf('n') + 1);
//		
//		System.out.println(idx);
//		
//		if("".isEmpty()) {
//			System.out.println("문자열의 값이 없습니다.");
//		}
//		
//		//Delimiter 는 문자열의 구분자를 뜻합니다.
//		String deliStr = "HelloMyFriend";
//		deliStr = String.join("\n","Hello","Java","World"); //많이 사용하는 데이터 형태
//		System.out.println(deliStr);
//		
//		System.out.println(email.lastIndexOf('.'));
//		
//		email = email.replace("gmail.com", "green.com");
//		System.out.println(email);
//		
//		//여러분 이메일의 서버명 , green.com 으로 변경해보세요.
//
//		String server = email.substring(email.indexOf('@') + 1); // @이후의 부분을 지정
//		String id = email.substring(0,email.indexOf('@') + 1); // 0부터 @까지의 부분을 지정
//		String newServer = server.replace(server , "green.com"); // @이후의 부분을 수정 replace	
//		
//		String newEmail = id.concat(newServer);// 제일 많이 쓰임 1.index of 2.substring
//		System.out.println(newEmail);
//		
//		
//		String wSpace = "  h  ";
//		System.out.println(wSpace.trim().length());
//		
//		int aa = 11;
//		
//		String aaStr = String.valueOf(aa);
//		System.out.println(aaStr + 1);

		
		
		
//		String cc = uid.substring(uid.indexOf('@') + 1); // @이후의 부분을 지정
//		String ii = uid.substring(0,uid.indexOf('@') + 1); // 0부터 @까지의 부분을 지정
//		String newcc = cc.replace(cc , "green.com"); // @이후의 부분을 수정 replace	
//		
//		String newuid = ii.concat(newcc);// 제일 많이 쓰임 1.index of 2.substring
		
		//120부터 204 까지 주석 해제
		
		while(true) {
			
			String uid = JOptionPane.showInputDialog(null,"ID(Email) 입력하세요.");
			int ii = uid.substring(0,uid.indexOf('@')).length();
			char cc = uid.charAt(0);
			
			if(uid.isEmpty()) {
			JOptionPane.showMessageDialog(null,"다시 제대로 \n ID(Email) 입력하세요.");
		}else if(ii < 8 || ii > 12) {
		
			JOptionPane.showMessageDialog(null,"8 ~ 12 사이의 \n ID(Email) 입력하세요." + "현재 입력한 문자 " + ii);
		}else if(Character.isLowerCase(cc)) {
			JOptionPane.showMessageDialog(null,"ID 의 첫글자는 대문자로 입력해야 합니다.");
		}else if(!(uid.matches(".*[0-9].*"))) {
			JOptionPane.showMessageDialog(null,"ID 에는 숫자가 1개 이상 들어가야 합니다.");
			
		}
			else {
			JOptionPane.showMessageDialog(null,"반갑습니다." + uid + "님.\n 로그인 하였습니다.");
			System.exit(0);
		}
			
			
			
			
			
		}
		
	
	
	
	
	
	}}
	
//		if{
//			JOptionPane.showInputDialog(null,"당신 아이디는" + uid + "입니다.");
//			System.exit(0);
//		}
		/*
		 * 사용자의 이메일을 입력 받아서 아래의 조건에 맞게 출력해보세요
		 * 1.ID(Email) 입력하세요
		 * 2. 입력 후 빈 문자열인지 검사 하세요.
		 * 3. 빈 문자열이 아닌경우 아래처럼 검사하세요
		 * 3_1 ID 와 서버로 분리하여 ID 를 검증(idValidate()) 하시는데
		 * 길이는 8 ~ 12 자 사이여야 하고, 반드시 첫자는 대문자여야 합니다.
		 * 또한 ID 중에는 반드시 숫자가 하나 이상 이어야 합니다.
		 * 만약 위의 조건이 틀린경우, 뭐가 틀렸는지 메세지를 띄우고. 모두 정상이면
		 * 사용자에게 로그인 되었습니다 라고 출력시키세요.
		 * 
		 */
		
		


