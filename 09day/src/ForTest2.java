import java.util.Random;

public class ForTest2 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
		System.out.println((int) (Math.random()*6) + 1);
	    }
		System.out.println("=======================");
		
		Random random = new Random();
		for(int i = 1; i <= 6; i++) {
		System.out.println(random.nextInt(45) + 1);
		}
	}

}
