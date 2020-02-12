import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.naver.com"; // http빼면 에러남, naver는 한개의 컴퓨터임(IP주소니까)
		String line = "";
		
		try {
			url = new URL(address); // url객체를 생성
			
			// 웹브라우저에서 html 텍스트만 받아 온 것임. (이미지 없음...)
			input = new BufferedReader(new InputStreamReader(url.openStream())); // url.openStream()을 하면 Stream이니까 입출력을 하기 위해서 naver와 나 사이에 연결선을 만듦.
			
			while((line=input.readLine()) != null) { // 한줄 한줄 읽어 들임.
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
// 실제 웹브라우저 프로그램(웹브라우저 원리)
// 그림(이미지)은 웹브라우저가 그리고, 웹브라우저는 html에 해당하는 텍스트만 가져옴.
