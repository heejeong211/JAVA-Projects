
public class ImmutableString {
	
	public static void main(String[] args) {
		String str1 = "Simple String";// Simple String���� �ּҰ� ���� 
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");//��ü����
		String str4 = new String("Simple String");
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");
	}

}