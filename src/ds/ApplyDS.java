package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ApplyDS {

	public static void main(String[] args) {
		/*
		 * UseStructure can be applied here to demonstrate how to add and retrieve.
		 * 
		 */
		UseStructure usestructure = new UseStructure();
		
		usestructure.addByLinkedList("UK");
		System.out.println("Return By LinkedList: ");
		for(String st:usestructure.returnByLinkedList()){
			System.out.println(st);
		}
		
		usestructure.addByArrayList("USA");
		System.out.println("Return By ArrayList: ");
		for(String st:usestructure.returnByArrayList()){
			System.out.println(st);
		}
		
		usestructure.addByStack("Canada");
		
		System.out.println("Return By Stack: ");
		
		for(String st:usestructure.returnByStack()){
			System.out.println(st);
		}
		
		usestructure.addByQueue("Bangladesh");
		
		System.out.println("Return By Queue: ");
		
		
		for(String st:usestructure.queue){
			System.out.println(st);
		}
		
		

		
		

	}

}
