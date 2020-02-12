package Test;

public class Employee { // *주의 public 잘못 붙이면 에러남.  main을 가진 클래스는 기본적으로 public을 붙여야함. 한 파일안에 public class가 두개 이상이 되면 에러남.
	
	private String name; // 무조건 변수 앞에는 private 붙이기!!!!!!!
	private int age;
	private String address;
	private String department;
	private int salary;
	
	Employee(String name, int age, String address, String department, int salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("주소: "+ address);
		System.out.println("부서: "+ department);
		System.out.println("월급: "+ salary + "만원");
	}
	
	
	

}
