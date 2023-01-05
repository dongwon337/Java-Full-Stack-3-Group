package utilex;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	int score;
	String name;
	
	public Person(int score, String name) {
		this.score = score;
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		if(this.score < p.score) return -1;
		else if(this.score == p.score) return 0;
		else return 1;
	}
}
public class CompareExam {

	public static void main(String[] args) {
		Person 동환 = new Person(98, "동환");
		Person 동원 = new Person(99, "동원");
		Person 주호 = new Person(100, "주호");
		
		TreeSet<Person> tSet = new TreeSet<Person>();
		tSet.add(동환);
		tSet.add(동원	);
		tSet.add(주호);
		
		for(Person p : tSet) {
		System.out.println(p.name + " : " + p.score);
	}
}
}