package utilex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterExam {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		
		Iterator<String> ir = myList.iterator();
		
		Collection<String> cl = myList;
		Iterable<String> ib = cl;
		Iterator<String> ir1 = ib.iterator();
		
		while(ir1.hasNext()) {
			System.out.println(ir1.next());
		}
			
		}
		
		
}

