import java.util.Scanner;

public class exercise052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the first number:");
		int x = in.nextInt();
		
		System.out.print("enter the second number:");
		int y = in.nextInt();
		System.out.print("enter the third number:");
		int z = in.nextInt();
		System.out.print("the result is:"+sumoftwo(x,y,z));
	}
	
		

	

	public static boolean sumoftwo(int p, int q, int r) {
		
		return((p+q)==r||(q+r)==p||(r+q)==q);
	}

}
