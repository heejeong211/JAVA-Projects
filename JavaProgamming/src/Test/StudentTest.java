package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
	private String name;
	private String department;
	private String number;
	private double avg;
	
	public Student(String name, String department, String number, double avg) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String line = sc.nextLine(); // �� �� ��ü�� �Է¹޴� ��.
			
			StringTokenizer st = new StringTokenizer(line, ", ");
			String name = st.nextToken().trim(); // trim() ������ ������ ������ �߶󳻶�
			String department = st.nextToken().trim();
			String number = st.nextToken().trim();
			Double avg = Double.parseDouble(st.nextToken().trim()); // String�� double�� ����ȯ
			
			studentList.add(new Student(name, department, number, avg)); // ������ �ְ� �־ ��.
		}
		
		for (Student student : studentList) {
			System.out.println("------------------------------------");
			System.out.println("�̸�: " + student.getName());
			System.out.println("�а�: " + student.getDepartment());
			System.out.println("�й�: " + student.getNumber());
			System.out.println("�������: " + student.getAvg());
		}
			
		}
		
	}

		
		/*
		while(studentList.size()<4) {
			String name;
			String department;
			String number;
			String avg;
			
			System.out.print(">> ");
			String input = sc.nextLine();
			StringTokenizer st = new StringTokenizer(input, ", ");
			
			for (int i = 0; i < studentList.size(); i++) 
				System.out.println(studentList.get(i));
			
		}
		sc.close();

	}

}
*/