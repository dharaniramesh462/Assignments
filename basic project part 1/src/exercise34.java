import java.util.Scanner;

public class exercise34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input the length of a side of the hexagon:");
		double s = input.nextDouble();
		System.out.print("the area of the hexgon is:"+ hexagonArea(s)+"\n");
	}
	public static double hexagonArea(double s) {
		return(6*(s*s))/(4*Math.tan(Math.PI/6));
		
		
		
	}

}
