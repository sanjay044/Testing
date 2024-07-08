package org.ma;


import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Task2 {

	public static void main(String[] args) {
		Hashtable<String,String> m = new Hashtable();
		m.put("Vel", "Selenium");
		m.put("Ganesh", "framework");
		m.put("Dinesh", "oracle");
		m.put("Vengat", "corejava");
		m.put("Subash", "jira");
		System.out.println(m);
		//keySet
		Set<String> keySet = m.keySet();
		for(String a:keySet) {
			System.out.println(a);
		}
		Collection<String> values = m.values();
		for(String c : values) {
			System.out.println("values :"+c);
		}
Set<Entry<String, String>> entry= m.entrySet();
for(Entry<String, String> b:entry) {
	System.out.println(b);
}
for(Entry<String, String> b:entry) {
System.out.println("Key :"+b.getKey()+","+"Values ="+b.getValue());
	}
	}
}
