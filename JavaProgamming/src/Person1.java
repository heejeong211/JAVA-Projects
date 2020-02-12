
class Person1 {
	String name;
	public Person1(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize(); // ���� Ŭ������ finalize �޼ҵ� ȣ��
		System.out.println("destroyed: " + name); // �ؿ��� null�� ������µ��� �ұ��ϰ� �̰� ������ �ȵɱ�? 
	}

}

class Person1Test {
	public static void main(String[] args) {
		
	Person1 p1 = new Person1("Yoon");
	Person1 p2 = new Person1("Park");
	p1 = null; // ��������� ������ �÷����� ������� ����. �ν��Ͻ� �Ҹ��ų���� �� ����ۿ� ����.
	p2 = null; // ��������� ������ �÷����� ������� ����.
	//System.gc(); //�Ժη� ����ؼ� �ȵ�.
	//System.runFinalization();
	
	System.out.println("end of program");
	
	}
}
