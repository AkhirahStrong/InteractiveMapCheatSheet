import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheGetAllMethod {
	
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
	
	public void putAllToMapNput(int userId, String userName){
		Scanner scan = new Scanner(System.in);
		Map<Integer, String> getAllMap = thePutMap(userId, userName);
		
		
			System.out.println("Map A: " + getAllMap);
		
		
		Map<Integer, String> newGetAllMap = thePutMap(userId, userName);

		newGetAllMap.putAll(getAllMap);
		
			System.out.println("Map B: " + newGetAllMap);
		
	}
	
	

}
