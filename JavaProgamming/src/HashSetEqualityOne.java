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
		System.out.println(super.hashCode()); // 7799, 9955, 7799 의 주소값(해시값)
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num) // down 캐스팅
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
		
		System.out.println("인스턴스 수: " + set.size());
		
		for(Num n : set)
			System.out.print(n.toString() + '\t');
		
		System.out.println();
	}

}
