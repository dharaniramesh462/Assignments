import java.util.Scanner;

public class exerise053 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the first number:");
		int x = in.nextInt();
		System.out.print("enter the second number:");
		int y = in.nextInt();
		System.out.print("enter the third number:");
		int z = in.nextInt();
		System.out.print("the result is:"+test(x,y,z,true));
		
		

	}

	public static boolean test(int p, int q, int r, boolean pqr) {
		if(pqr)
			
		
		return(r>q);
		return(q>p && r>q);
	}

}
