import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("3과목 점수를 입력하세요 : ");
		 int java = sc.nextInt();
		 int jsp = sc.nextInt();
		 int spring = sc.nextInt();
		 
		 int total = java + jsp + spring;
		 double average = total / 3.;
		 
//		 System.out.println("평균 점수 : " + average);
		 System.out.printf("평균 점수 : %6.2f\n", average);
		 
		 if(average >= 90) {
			 System.out.println("수");
		 } else if(average >= 80) {
			 System.out.println("우");
		 } else if(average >= 70) {
			 System.out.println("미");
		 } else if(average >= 60) {
			 System.out.println("양");
		 } else {
			 System.out.println("가");
		 }
		 
	}

}
