import java.io.Console;

public class exercise042 {

	public static void main(String[] args) {
		Console cons;
		if((cons = System.console()) != null) {
			char[] pass_word = null;
			try {
				pass_word = cons.readPassword("Input your Password:");
				System.out.println("Your password was:" + new String(pass_word));
			}finally {
				if(pass_word != null) {
					java.util.Arrays.fill(pass_word,' ');
					
				}
						
			}
		}else {
			throw new RuntimeException("Can't get password...No console");
			
		}

	}

}
