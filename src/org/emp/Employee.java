package org.emp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Employee{
	public static void main(String[] args) {
	Map<Integer,String>	m= new Hashtable();
	 m.put(100, "Sachin");
	 m.put(18,"Virat");
	 m.put(7, "Dhoni");
	 m.put(200, "Rohit");
	 
	 Collection<String> values = m.values();
	 System.out.println(values);
	 
	 Set<Integer> keySet = m.keySet();
	 System.out.println(keySet);
	 
	 Set<Entry<Integer, String>> entrySet = m.entrySet();
	
	 for (Entry<Integer, String> entry : entrySet) {
		 System.out.println(entry);
	 }
	 System.out.println("=====");	 
		for (Entry<Integer, String> entry2 : entrySet) {
			System.out.println(entry2.getValue());
		}
			System.out.println("=====");	
			for (Entry<Integer, String> entry3 : entrySet) {
				System.out.println(entry3.getKey());
			}}}



