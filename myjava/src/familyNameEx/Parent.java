package familyNameEx;

public class Parent {

		String familyName;//자식이 어떤 성인지 알려주는 속성
		String jobName;//직업을 알려주는 속성
		
		//내 자식 객체가 생성시에 타입을 초기화 하기 위해 생성자 정의 합니다.
		public Parent(String familyName) {
			this.familyName = familyName;
			this.jobName = "내 직업은 택시 드라이버";
		}
		
		//모든 가족은 본인의 직업을 소개 하기 위해 상속목적으로 doJob() 메서드 정의함.
		public void doJob() {
			System.out.println(jobName);
		}
		
		//해당 가족이 어떤 성인지 타입을 문자열로 리턴하는 toString()정의
		public String toString () {
			return "성은 " + familyName;
		}

		
}
