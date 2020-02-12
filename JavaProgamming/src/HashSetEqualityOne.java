import java.util.HashSet;

class Num {
	private int num;
	
	public Num(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		System.out.println(super.hashCode()); // 7799, 9955, 7799 �� �ּҰ�(�ؽð�)
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num) // down ĳ����
			return true;
		else
			return false;
	}
	
}

public class HashSetEqualityOne {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		
		System.out.println("�ν��Ͻ� ��: " + set.size());
		
		for(Num n : set)
			System.out.print(n.toString() + '\t');
		
		System.out.println();
	}

}
