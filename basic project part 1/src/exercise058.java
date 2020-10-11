import java.util.*;

public class exercise058 {

	

	

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input a sectence:");
		String line = in.nextLine();
		String upper_case_line ="";
		   Scanner lineSan = new Scanner(line);
		    
			while(lineSan.hasNext()) {
				String word = lineSan.next();
				upper_case_line += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
				
			}
			System.out.println(upper_case_line.trim());
			

	}

}
