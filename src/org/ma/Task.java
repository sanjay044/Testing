package org.ma;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap();
		
m.put(10, "java");
m.put(20, "sql");
m.put(30, "oops");
m.put(40, "Sql");
m.put(50, "oracle");
m.put(60, "DB");
m.put(10, "selenium");
m.put(50, "psql");
m.put(40, "Hadoop");
System.out.println(m);
System.out.println(" ");
//keySet
Set<Integer> keySet=m.keySet();
for(Integer a:keySet) {
	System.out.println(a);
}
System.out.println(" ");
//entrySet
Set<Entry <Integer,String >> s =m.entrySet();
for(Entry<Integer,String> c :s) {
System.out.println(c);

Integer key = c.getKey();
System.out.println(key);

String value = c.getValue();
System.out.println(value);
	}

System.out.println(" ");


}}
