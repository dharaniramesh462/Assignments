
public class exercise038 {

	public static void main(String[] args) {
		String test = " What is the cost of your dress ? It's cost is around 5000 rupees. ";
		count(test);
	}

	public static void count(String X) {
		
		char[] ch = X.toCharArray();
		int letters = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0;i < X.length();i++){
			if(Character.isLetter(ch[i])) {
				
				letters ++ ;
			}
		
			else if(Character.isDigit(ch[i])) {
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space ++ ;
			}
			else {
				other ++;
			}
		}
		System.out.println("the string is : what is the cost of your dress ? It's cost is around 5000 rupees .");
		
		System.out.println("letter:" + letters);
		System.out.println("space:"+ space);
		
		System.out.println("number:"+ num);
		System.out.println("other:"+ other);
	}
}
		
				
				
			
			
			
		
		
	
	

	


