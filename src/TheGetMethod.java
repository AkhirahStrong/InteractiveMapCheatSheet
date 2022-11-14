import java.util.HashMap;
import java.util.Map;

public class TheGetMethod {
	
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

}
