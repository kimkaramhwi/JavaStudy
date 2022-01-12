
public class PrintTest {

	public static void main(String[] args) {

//		서식 없는 출력(print, println)
//		컨트롤+알트->복사, 알트 ->이동
		System.out.print("안녕 자바\n");
		System.out.println();     // 아무것도 출력하지 않고 줄을 바꾼다. 한 줄 바꾸기
		System.out.println("안녕 자바");
		
//		"+" 연산자는 "+" 연산자의 양쪽에 모두 숫자가 나올경우 덧셈을 하고
//		한 쪽이라도 문자열이 나오면 문자열을 연결하는 연결 연산자로 사용된다.
		System.out.println("5 + 3 = " + (5 + 3));
		System.out.println("5 - 3 = " + (5 - 3));
		System.out.println("5 * 3 = " + 5 * 3);
		System.out.println("5 / 3 = " + 5 / 3);    // 정수와 정수의 연산은 결과도 정수다. 묵시적 형변환
		System.out.println("5 % 3 = " + 5 % 3);    // 나머지
		
//		묵시적 형변환 : 자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변환된다.
//		자바의 기본 자료형
//		boolean : 1바이트(8비트), true 또는 false를 기억한다.
//		char : 2바이트, 1문자를 기억한다. (C언어는 1바이트)
//		short : 2바이트, -32768 ~ 32767사이의 정수를 기억한다.
//		int : 4바이트, -2147483648 ~ 2147483647사이의 정수를 기억한다.
//		long : 8바이트, -2의 63승 ~ 2의 63승 - 1사이의 정수를 기억한다.
//		float : 4바이트, 단정도 실수, 소수점 아래로 6자리 정도를 표현한다.
//		double : 8바이트, 배정도 실수, 소수점 아래로 16자리 정도를 표현한다. float보다 더 정밀한 연산이 가능하다.
		
		System.out.println("5 / 3. = " + 5 / 3.);
//		크기가 더 큰 double형으로 묵시적 형변환
		System.out.println("5. / 3 = " + 5. / 3);
		System.out.println("A + 32 = " + ('A' + 32)); //''은 문자 ""은 문자열
		System.out.println("a - 32 = " + ('a' - 32)); 
//		2바이트와 4바이트의 연산이므로 4바이트로 바뀐다.
		
//		명시적 형변환 : 프로그래머가 그 순간의 자료형을 변경할 수 있다. casting, 형변환
		System.out.println("5 / (double)3 = " + 5 / (double)3);
		System.out.println("A + 32 = " + (char)('A' + 32)); 
		System.out.println("a - 32 = " + (char)('a' - 32)); 
		
//		서식 있는 출력(printf() ==> c언어의 printf 사용법과 같다.)
//		printf("출력서식", 출력할 내용);
//		출력 서식은 출력 서식 문자를 제외한 나머지 문자는 입력한 그대로 출력된다.
//		출력 서식 문자 : d(정수), f(실수), c(문자), s(문자열)
//		출력 서식의 형식 : %[-][0][.m]서식문자
//		- : 출력할 전체 자리수가 지정된 경우 왼쪽에 맞춰 출력한다.
//		0 : 출력할 전체 자리수가 지정된 경우 왼쪽에 남는 자리에 0을 채워 출력한다.
//		n : 출력할 전체 자리수
//		.m : 소수점 아래 자리수, 잘리는 자리에서 반올림시켜 출력한다. 원래 데이터 값은 변경되지 않는다.
		
		System.out.printf("5 + 3 = %d\n", 5 + 3);
		System.out.printf("%d + %d = %d\n", 5, 3, 5 + 3);
		System.out.printf("5 / 3. = %f\n", 5 / 3.);

	}
}
