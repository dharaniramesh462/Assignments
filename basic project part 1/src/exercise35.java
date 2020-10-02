import java.util.Scanner;

public class exercise35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input the number of sides of the polygon:");
		int ns = input.nextInt();
		System.out.print("input the length of one of the sides:");
		double side = input.nextDouble();
		System.out.print("the area is:" + polygonrea(ns,side)+"\n");

	}
	public static double polygonrea(int ns,double side) {
		return(ns*(side*side))/(4.0*Math.tan(Math.PI/ns));
	}

}
