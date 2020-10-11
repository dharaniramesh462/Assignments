import java.util.Scanner;

public class exercisr060 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input a sentence:");
		String line = in.nextLine();
		String[] words = line.split("[ ]+");
	
		System.out.println("Penultimate word:"+words[words.length-2]);



		

	}

}
