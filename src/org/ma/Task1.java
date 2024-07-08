package org.ma;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		Map<String,Integer> m = new TreeMap();
		m.put("!",10);
		m.put("@",20);
		m.put("#",30);
		m.put("$",40);
		m.put("%",50);
		m.put("^",60);
		m.put("&",10);
		m.put("*",50);
		m.put("(",40);
		System.out.println(m);
		
		//keySet
		Set<String> s=m.keySet();
		for(String a:s) {
			System.out.println("keys :" +a);
		}
Collection<Integer> values = m.values();
for(Integer b:values) {
	System.out.println("values ="+b);
}
//entrySet
Set<Entry<String, Integer>> entry = m.entrySet();
	for(Entry<String,Integer> c:entry) {
		System.out.println(c);

	}
	//enhanced loop for get the key and value combination
	for(Entry<String,Integer> c:entry) {
		System.out.println("key ="+c.getKey()+","+"value ="+c.getValue());
	
	}}
}
