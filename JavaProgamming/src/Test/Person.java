package Test;

class Person {
	private String name;
	private String num;
	
	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}
	
	
	/*@Override
	 *public boolean equals(Object obj) {
	 *Person person = (Person)obj;
	 *if (name.equals(person.name) && number.equals(person.number))
	 *return true;
		else
			return false;
	 */
	
	
	@Override
	public boolean equals(Object obj) { // equals�� �Լ� �������̵� ��Ŵ.
		if (this.name == ((Person)obj).name && this.num == ((Person)obj).num)
			return true;
		else
			return false;
		
	}
}

class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", "123456778");
		Person p2 = new Person("ȫ�浿", "123456778");
		System.out.println(p1.equals(p2));
	}
}
