import java.util.HashMap;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		
		HashMap<String, String> userPass = new HashMap<String,String>();
		userPass.put("joeBiden270", "democrat4Life");
		userPass.put("THEdonald", "maga2020");
		
		System.out.println(userPass);
		
		TreeMap<Integer, String> states = new TreeMap<Integer, String>();
		states.put(1, "Delaware");
		states.put(28, "Texas");
		states.put(3, "Old Jersey");
		states.put(3, "New Jersey");
		
		System.out.println(states);
		
		/*
		 * The code above demonstrates the similarities between HashMap and TreeMap
		 * When simply adding and printing the methods, they appear to act much in the same way.
		 * But, the TreeMap will actually automatically sort the TreeMap by the provided args.
		 * Also shown in the TreeMap is that a single Integer can't have two different Strings attached to it. 
		 * This works in the same way for HashMap.
		 * If you want to guarantee the order of key then TreeMap should be used as HashMap has no built-in guarantee. 
		 * 
		 */

	}

}
