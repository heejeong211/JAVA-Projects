package Test;

public class Employee { // *���� public �߸� ���̸� ������.  main�� ���� Ŭ������ �⺻������ public�� �ٿ�����. �� ���Ͼȿ� public class�� �ΰ� �̻��� �Ǹ� ������.
	
	private String name; // ������ ���� �տ��� private ���̱�!!!!!!!
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
		System.out.println("�̸�: "+ name);
		System.out.println("����: "+ age);
		System.out.println("�ּ�: "+ address);
		System.out.println("�μ�: "+ department);
		System.out.println("����: "+ salary + "����");
	}
	
	
	

}
