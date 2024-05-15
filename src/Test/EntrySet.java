package Test;
import java.util.Map;
import java.util.HashMap;
public class EntrySet {

	public static void main(String[] args) {
		 // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        
        // Add elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        // Iterate over the map using entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

	
