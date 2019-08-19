package comm.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	private Map<String, String> map;
	
	public MapDemo() {
		super();
		map = new HashMap<String, String>();
	}
	public void createMap()
	{
		map.put("Neeraja", "001");
		map.put("Aish", "002");

		map.put("Akshaya", "003");

		map.put("Geeta", "004");

	}
	
	public Set<String> getKeys()
	{
		return map.keySet();
	}
    
	public Collection<String> getValues()
	{
		return map.values();
	}
}
