import java.nio.charset.Charset;

public class exercise040 {

	public static void main(String[] args) {
		System.out.println("list of available character sets:");
		for(String str :Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}

	}

}
