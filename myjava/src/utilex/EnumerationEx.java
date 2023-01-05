package utilex;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("hi");
		v.add("Hello");
		v.add("World");
		v.add("Java");
		v.add("Program");
		
		//아래의 코드를 완성시켜보세요.
		//결과는 위의 모든 요소가 출력되어야 합니다.
		printToEnumeration(v.elements());

//		Enumeration<String> enumeration = v.elements();
//		System.out.println();
//		Enumeration<String> enumeration = vector.elements();
//		List<String> list = Collections.list(enumeration);
//		System.out.println("List elements: "+list);
	}
	
	static void printToEnumeration(Enumeration<String> elements) {
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}

}
