
public class FriendTest {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new CompFriend("YOON", "R&D", "02-123-999");
		frns[cnt++] = new CompFriend("PARK", "R&D", "02-321-777");
		
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // 오버라이딩한 메소드가 출력된다.
			System.out.println();
		}

	}

}
