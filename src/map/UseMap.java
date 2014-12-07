package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMap {
	
	public UseMap(){
		
	}
	Map<String, String> mapData = new HashMap<String,String>();
	Map<String, List<String>> listData = new HashMap<String,List<String>>();
	//Implement a method which can add data into a Map
	public void addElementByMap(String data1, String data2){
		mapData.put(data1, data2);
	}
	
	/*Implement a method that can retrieve data from a Map and it will return data containing in a Map
	 * Use while loop to iterate through
	 */
	
	public Map<String, String> getDataByMap(){
		
		return mapData;
	}
	
	/*Implement a method that can retrieve data from a Map contains List and it will return data containing in a Map
	 * Use for loop to iterate through
	 */
		
		public Map<String, List<String>> getDataByMapList(String st){
			listData.put(st, mapData);
			
			return listData;
		}

}
