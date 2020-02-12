import java.util.Arrays;

class Person2 implements Comparable{
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		/*if(this.age) > p.age)
		 *return 1; // ���ڷ� ���޵� o�� �۴ٸ� ���� ���� ��ȯ
		 *else if (this.age < p.age)
		 *return -1; // ���ڷ� ���޵� o�� ũ�ٸ� ���� ���� ��ȯ
		 *else
		 *return 0; // ���ڷ� ���޵� o�� ���ٸ� 0�� ��ȯ
		 */
		return this.age - p.age; // ���� �ڵ带 �̷������� ���� �� �� �ִ�.
	}
	
	public String toString() {
		return name + ": " + age;
	}
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		Person2[] ar = new Person2[3];
		ar[0] = new Person2("Lee", 29);
		ar[1] = new Person2("Gee", 15);
		ar[2] = new Person2("Soo", 37);
		
		Arrays.sort(ar);
		for(Person2 p : ar)
			System.out.println(p);

	}

}
