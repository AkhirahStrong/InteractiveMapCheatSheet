import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePutMethod {
	
	public Map<Integer, String>thePutMap(int userId, String userName) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put( 001, "John" ); 
		hm.put( 002, "April" ); 
		hm.put( 003, "James" );
		return hm; 
		
	}

	@Override
	public String toString() {
		return  thePutMap(0, "a").toString(); 
				
	}
	
	public static void instructions() {
		
		System.out.println("Welcome to the put() methed");
		System.out.println("The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map. "
				+ "This means we can insert a specific key and the value it is mapping to into a particular map. "
				+ "If an existing key is passed then the previous value gets replaced by the new value. "
				+ "If a new pair is passed, then the pair gets inserted as a whole.");
		
	}

	

	public Map<Integer, String>addToMapNput(int userId, String userName) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, String> mapped2 = thePutMap(userId, userName);

		System.out.println("Now let's add user to the map");
		
		System.out.println("Enter user ID: ");
		userId = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter use name: ");
		userName = scan.nextLine();
		
		if(userId==userId && userName==userName) {
		mapped2.put( userId, userName);	
		}
		
		System.out.println("New input: " + mapped2);
		System.exit(userId);
		return mapped2;
		
	}
	


}
