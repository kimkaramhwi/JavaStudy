
public class MainClass {
	public static void main(String[] args) {
		
		MethodClass methodClass = new MethodClass();
		
		System.out.println("1~100의 합계 : " + methodClass.total());
		
		System.out.println("1~100의 합계 : " + MethodClass.total());  // static메소드 사용시
		
	}

}
