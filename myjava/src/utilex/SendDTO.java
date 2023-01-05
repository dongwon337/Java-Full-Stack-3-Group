package utilex;

import java.util.ArrayList;



/*
 * 이 클래스는 필요한 DTO 객체를 필요한 만큼 생성해서 List Type 으로
 * DAO 에게 보내는 역할을 합니다.
 */
public class SendDTO {

	
	public static void main(String[] args) {

		
		StudentDTO dto1 = new StudentDTO();
		dto1.setNumber(2);
		dto1.setGroup(3);
		dto1.setName("김동환");
		dto1.setTel("0101");

		StudentDTO dto2 = new StudentDTO();
		dto2.setNumber(3);
		dto2.setGroup(3);
		dto2.setName("박동원");
		dto2.setTel("0102");
		
		StudentDTO dto3 = new StudentDTO();
		dto3.setNumber(4);
		dto3.setGroup(3);
		dto3.setName("정주호");
		dto3.setTel("0103");
		
		//Generic 을 이용해서 Element type 을 제한 합니다.
		ArrayList<StudentDTO> members = new ArrayList<StudentDTO>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		//DAO 의 특정 메서드에 이 정보를 보냅니다.
		//메서드 이름은 putDtos(ArrayList<StudentDTO>list) 형태가 됩니다.
		StudentDAO dao = StudentDAO.getInstance();
		dao.putDtos(members);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
