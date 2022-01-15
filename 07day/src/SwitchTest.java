import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double)total / 3;
		
//		key값은 정수를 기억하는 변수 또는 연산 결과가 정수인 수식, 자바 1.7부터는 문자열도 가능하다.
//		switch(key) {
//		    case value:         //":"임을 주의한다.
//		         key와 value가 일치할 경우 실행할 문장;
//		         [break;]       //if문을 제외한 나머지 제어문의 {}블록을 탈출한다.
//		    [default:
//		         key와 일치하는 value가 없을 경우 실행할 문장;
//		         break;]
//		}
		
//		같은 작업을 하는 case는 나열할 수 있다.
		switch((int) average / 10) {
		case 10:
			System.out.println("참 잘했어요.");
//			System.out.println("수");
//			break;
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
		}
		sc.close();
	}
	

}
