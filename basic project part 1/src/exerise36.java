import java.util.Scanner;

public class exerise36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input the latitude of coordinate1:");
		double lat1 = input.nextDouble();
		System.out.print("input the longitude of coordinate1:");
		double long1 = input.nextDouble();
		System.out.print("input the latitude of oordinate2:");
		double lat2 = input.nextDouble();
		System.out.print("input the longitude of coordinate2:");
		double long2 = input.nextDouble();
		System.out.print("the distance between those points is:"+ distance_Between_LatLong(lat1,lat2,long1,long2)+"km\n");
	}
	public static double distance_Between_LatLong(double lat1,double long1,double lat2,double long2) {
		lat1 = Math.toRadians(lat1);
		long1 = Math.toRadians(long1);
		lat2 =Math.toRadians(lat2);
		long2 = Math.toRadians(long2);
		double earthRadius = 6371.01;
		return earthRadius* Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2));
	}

	

}
