import java.util.Random;
import java.util.Scanner;

public class BaseballTest {
	public static void main(String[] args) {
		
		int[] ball = {0,1,2,3,4,5,6,7,8,9};
		Random random = new Random();
		for(int i=0; i<10000; i++) {
			int r = random.nextInt(9)+1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		
		System.out.print("레벨을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		
		System.out.print("CPU : ");
		for(int i=0; i<level; i++) {
			System.out.print(ball[i]);
		}
		System.out.println();
		
		sc.nextLine();      //키보드 버퍼를 비운다.
//		맞출때까지 반복한다.
		int count = 0;
//		currentTimeMillis() : 1900년 1월 1일부터 이 메소드가 실행되는 순간까지 지난 시간을 1/1000초 단위로 얻어온다.
		long start = System.currentTimeMillis();    // 게임 시작시간
		while(true) {
			System.out.print("USER : ");
			String user = sc.nextLine();
			count ++;
			
//			스트라이크와 볼의 개수를 센다.
//			스트라이크와 볼의 개수는 반복마다 다시 계산해야 하므로 반복안에서 초기화 시켜야 한다.
			int s = 0, b = 0;
			for(int i=0; i<level; i++) {
//				스트라이크의 개수
				if(ball[i] == user.charAt(i) - '0') {
					s++;
				}
//				indexOf(): 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위치를 얻어온다. 없으면 -1을 리턴한다.
//				문자열에 특정한 문자 또는 문자열이 포함되어 있는가를 알 수 있다.
//				볼의 개수
				if(user.indexOf(ball[i] + "") >= 0) {
					b++;
				}
			}
//			맞췄으면 반복을 탈출한다.
			if(s == level) {
				break;
			}
			System.out.println(s + " 스트라이크" + (b-s)+ " 볼");
		}
		long end = System.currentTimeMillis();  // 게임 종료 시간
		System.out.println((end-start)/1000. + "초 걸려서 " + count + "번 만에 맞췄다.");
	}

}
