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
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		super.showBusinessInfo();
		
	}
	
	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();
        return copy;
    }
	
	
}
