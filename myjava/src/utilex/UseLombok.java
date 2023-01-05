package utilex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//https://projectlombok.org/download 에서 최신 lombok.jar 를 C:\ 아닌 다른
//루트 드라이브에 다운받으세요
//cmd(lombok 위치) java -jar lombok.jar --> 설치할 이클립스 선택 화면 --> 이클립스 리부팅 -->
//프로젝트 우클릭 --> new folder --> lib생성 --> 롬복 붙이기
//--> 롬복우클릭 --> build path --> add to build path

//@Data : 이 어노테이션은 getter, setter, toString, hashcode, equals() 를 자동으로
//생성해줍니다.

@Data
class Student{
	private String id;
	private String name;
	private int age;
}
/*
 * 롬복 Annotation 설정 정보
 
@NoArgsConstructor //기본 생성자를 포함시킨다.
@AllArgsConstructor // 필드초기화 생성자를 포함시킨다.
@RequiredArgsConstructor //기본적으로 생성자라 포함, 만약 final 또는 @NotNull
//이 붙은 필드가 있다면 이 필드만 초기화 하는 생성자 포함
@Getter // Getter 포함
@Setter // Setter 포함
@EqualsAndHashCode //equals(), hashCode() 포함
@ToString //toString() 포함
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
class Student2{
	private String id;
	private String name;
	private int age;
}

@Data
class Student3{
	private final String id = "dongwon";
	@NonNull private String name;
	private int age;
}

public class UseLombok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student3 stu3 = new Student3("dongwon");
		
	}

}
