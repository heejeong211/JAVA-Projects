package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Location {
	private String city;
	private int latitude; // 위도
	private int longitude; // 경도
	
	public Location(String city, int latitued, int longitude) {
		this.city = city;
		this.latitude = latitued;
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
}

public class LocationTest {

	public static void main(String[] args) {
		List<Location> cityList = new ArrayList<>();
		HashMap<String,Location> map = new HashMap<>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String line = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(line, ", ");
			String city = st.nextToken().trim();
			Integer latitude = Integer.parseInt(st.nextToken().trim());
			Integer longitude = Integer.parseInt(st.nextToken().trim());
			
			cityList.add(new Location(city, latitude, longitude));
			map.put(city, new Location(city, latitude, longitude));
			
		}
		
		System.out.println("------------------------------------");
		
		for (Location con : cityList) {
			System.out.print(con.getCity() + " ");
			System.out.print(con.getLatitude() + " ");
			System.out.print(con.getLongitude() + " ");
			System.out.println();
			
		}
		
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("도시 이름>>");
			String city = sc.next();
			
			if(city.equals("그만")) {
				break;
			}
			
			Location m = map.get(city);
			
			if(m == null) {
				System.out.println(city + "도시는 없습니다.");
			} else {
				System.out.println(map.get(city).getCity() + " " + map.get(city).getLatitude() + " " + map.get(city).getLongitude());
			}
		}
		System.out.println("프로그램 종료 입니다.");
		sc.close();

	}
	
}
