import java.util.Scanner;

public class exercise054 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the first number:");
		int x = in.nextInt();
		System.out.print("enter the second number:");
		int y = in.nextInt();
		System.out.print("enter the third number:");
		int z = in.nextInt();
		System.out.print("the result is:"+test_last_digit(x,y,z,true));

	}

	public static boolean test_last_digit(int p, int q, int r, boolean pqr) {
		
		
		return (p % 10 == q % 10 ||(p % 10 == r % 10)||(q % 10 == r % 10));
	}

}
