
public class TestClass {
	
	void instanceMethod () {} // �ν��Ͻ� �޼ҵ�
	static void staticMethod () {} // static �޼ҵ�
	
	void instanceMethod2 () { // �ν��Ͻ� �޼ҵ�
		instanceMethod(); // �ٸ� �ν��Ͻ� �޼ҵ带 ȣ���Ѵ�.
		staticMethod(); // static �޼ҵ带 ȣ���Ѵ�.
	}
	
	static void sataicMethod2 () { //static�޼ҵ�
		instanceMethod(); //����!! �ν��Ͻ��޼��带 ȣ���� �� ����.
		staticMethod();
	}

}

//static �Լ� �ȿ� �ν��Ͻ����(����, �Լ�)�� �� �� ���� ������?
//static �Լ� �ȿ��� �ν��Ͻ� ����� �� �� ���� ������?
//�ν��Ͻ� �Լ� �ȿ��� �ν��Ͻ��� static�̵� �� �� �� ����. �׷��� static �Լ� �ȿ��� static ���� �ֵ鸸 �;���.
//�ν��Ͻ��� new ���� ��(��ü����)�� ȣ���� �� ����.
//�޸� �ö󰡴� �ð��� �ٸ��� ����. static�� Ŭ������ �о���� �� �޸𸮿� �ö󰡰� �ν��Ͻ��� new�� �о���� �� �޸𸮿� �ö󰣴�.
