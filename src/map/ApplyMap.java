package map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class ApplyMap {

	public static void main(String[] args) {
		/*
		 * UseMap() can be utilize here.
		 */
		UseMap usemap = new UseMap();
	//	usemap.addElementByMapData("Bangladesh","Dhaka");
		//usemap.addElementByMapData("Bangladesh","Sylhet");
		usemap.addElementByMap("A","Dhaka" );
		usemap.addElementByMap("B","Sylhet" );
		usemap.addElementByMap("C","Chitagong" );
		
		Map<String, String> mp = usemap.getDataByMap();
				
        for(Entry<String, String> entry:mp.entrySet()){
			
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
		    }
       usemap.getDataByMapList("Bangladesh");

	}

}
