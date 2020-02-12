package Test;

public class PersonalInfo extends Business{
	private String name;
	private int age;
	
	public PersonalInfo(String name, int age, String company, String work) {
		super(company, work);
		this.age = age;
		this.name = name;
	}

	public void showPersonalInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		super.showBusinessInfo();
		
	}
	
	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();
        return copy;
    }
	
	
}
